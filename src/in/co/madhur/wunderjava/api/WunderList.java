package in.co.madhur.wunderjava.api;

import java.util.List;

import in.co.madhur.wunderjava.api.model.LoginResponse;
import in.co.madhur.wunderjava.api.model.Me;
import in.co.madhur.wunderjava.api.model.WList;
import in.co.madhur.wunderjava.api.model.WTask;
import retrofit.RestAdapter;
import retrofit.RetrofitError;

/**
 * @author Madhur Ahuja
 *
 */
public class WunderList
{
	private static WunderList wunderList;
	private static RestAdapter restAdapter;
	private static WunderAPI service;
	private static String token;
	private static String userId;

	/**
	 * 
	 */
	private WunderList()
	{

	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	private static LoginResponse Login(String userName, String password)
			throws AuthException, NetworkException
	{
		LoginResponse response = null;
		try
		{
			response = service.login(userName, password);
		}
		catch (RetrofitError e)
		{
			if (e.isNetworkError())
				throw new NetworkException(APIConsts.NETWORK_ERROR);
			if (e.getResponse().getStatus() == 403)
				throw new AuthException(APIConsts.AUTH_ERROR);
			if (e.getResponse().getStatus() == 404)
				throw new AuthException(APIConsts.USER_NOT_FOUND);

		}

		// Save the token
		token = response.getToken();
		userId = response.getId();

		return response;
	}

	/**
	 * @return
	 * @throws NetworkException
	 */
	public Me GetUserInfo() throws NetworkException
	{
		Me userInfo = null;

		try
		{
			userInfo = service.getUserInfo(token);
		}
		catch (RetrofitError e)
		{
			if (e.isNetworkError())
				throw new NetworkException(APIConsts.NETWORK_ERROR);
		}

		return userInfo;
	}

	/**
	 * @param newToken
	 */
	public void SetToken(String newToken)
	{
		token = newToken;

	}

	/**
	 * @return
	 */
	public String GetToken()
	{
		return token;
	}

	/**
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	private static boolean IsLoginRequired() throws AuthException,
			NetworkException
	{
		Me userInfo;

		try
		{
			// Try to get data using provided token
			userInfo = service.getUserInfo(token);
		}
		catch (RetrofitError e)
		{
			if (e.isNetworkError())
			{
				if (e.getMessage() != null)
				{
					throw new NetworkException(e.getMessage());

				}
				else
					throw new NetworkException(APIConsts.NETWORK_ERROR);

			}

			if (e.getResponse().getStatus() == 401)
			{
				return true;
			}
			return true;
		}

		return false;
	}

	/**
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	public List<WTask> GetTasks() throws AuthException, NetworkException
	{
		List<WTask> tasks;
		try
		{
			tasks = service.GetWunderTasks(token);
		}

		catch (RetrofitError e)
		{
			if (e.isNetworkError())
				throw new NetworkException(APIConsts.NETWORK_ERROR);

			if (e.getResponse().getStatus() == 401)
			{
				throw new AuthException(APIConsts.AUTH_ERROR, AuthError.AUTH_ERROR);
			}
			else
				throw new AuthException(APIConsts.UNKNWOWN_RETROFIT_ERROR, AuthError.UNKNOWN);
		}

		return tasks;
	}

	/**
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	public List<WList> GetLists() throws AuthException, NetworkException
	{
		List<WList> lists;
		try
		{
			lists = service.GetLists(token);
		}
		catch (RetrofitError e)
		{
			if (e.isNetworkError())
				throw new NetworkException(APIConsts.NETWORK_ERROR);

			if (e.getResponse().getStatus() == 401)
			{
				throw new AuthException(APIConsts.AUTH_ERROR, AuthError.AUTH_ERROR);
			}
			else
				throw new AuthException(APIConsts.UNKNWOWN_RETROFIT_ERROR, AuthError.UNKNOWN);
		}

		return lists;

	}

	/**
	 * @param newToken
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	public static WunderList getInstance(String newToken) throws AuthException,
			NetworkException
	{
		if (wunderList == null)
		{
			restAdapter = new RestAdapter.Builder().setEndpoint(APIConsts.API_URL).build();
			service = restAdapter.create(WunderAPI.class);
			wunderList = new WunderList();
			token = newToken;

			if (IsLoginRequired())
				throw new AuthException(AuthError.OLD_TOKEN_EXPIRED);

			return wunderList;
		}
		else
			return wunderList;

	}

	/**
	 * @param userName
	 * @param password
	 * @return
	 * @throws AuthException
	 * @throws NetworkException
	 */
	public static WunderList getInstance(String userName, String password)
			throws AuthException, NetworkException
	{
		if (wunderList == null)
		{
			restAdapter = new RestAdapter.Builder().setEndpoint(APIConsts.API_URL).build();
			service = restAdapter.create(WunderAPI.class);
			wunderList = new WunderList();

			// Since token is not provided, make explicit call to login which
			// will set the token internally.
			// Callers should get the token by calling wunderlist.getToken();
			Login(userName, password);

			return wunderList;
		}
		else
			return wunderList;

	}
}
