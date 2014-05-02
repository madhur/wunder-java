package in.co.madhur.wunderjava.api;

import in.co.madhur.wunderjava.api.model.LoginResponse;
import in.co.madhur.wunderjava.api.model.Me;
import in.co.madhur.wunderjava.api.model.WList;
import in.co.madhur.wunderjava.api.model.WTask;

import java.util.List;

import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;

public interface WunderAPI
{
	@FormUrlEncoded
	@POST("/login")
	LoginResponse login(@Field("email") String username, @Field("password")String password);
	
	@GET(value = "/me")
	Me getUserInfo(@Header("Authorization") String authorization);
	
	@GET(value = "/me/tasks")
	List<WTask> GetWunderTasks(@Header("Authorization") String authorization);
	
	@FormUrlEncoded
	@POST(value = "/me/tasks")
	WTask CreateWunderTask(@Header("Authorization") String authorization, @Field("list_id") String listId, @Field("title") String title,  @Field("starred") String isStarred, @Field("due_date") String dueDate);
	
	@FormUrlEncoded
	@POST(value = "/me/lists")
	WList CreateList(@Header("Authorization") String authorization, @Field("title") String title);

	
	@GET(value = "/me/lists")
	List<WList> GetLists(@Header("Authorization") String authorization);
	
	@DELETE(value="/me/lists/{list_id}")
	void DeleteList(@Header("Authorization") String authorization, @Path("list_id") String listId);
}
