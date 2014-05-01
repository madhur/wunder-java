package in.co.madhur.wunderjava;

import in.co.madhur.wunderjava.api.AuthException;
import in.co.madhur.wunderjava.api.NetworkException;
import in.co.madhur.wunderjava.api.WunderList;
import in.co.madhur.wunderjava.api.model.WList;

import java.util.List;
import java.util.Scanner;

public class Main
{

	private static String username;
	private static String password;
	private static WunderList wunderList;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Wunderlist username: ");
		username=in.nextLine();
		System.out.println("Enter the Wunderlist password: ");
		password=in.nextLine();
		
		try
		{
			wunderList=WunderList.getInstance(username, password);
			
			List<WList> wlists=wunderList.GetLists();
			System.out.println("Printing out the lists: ");
			for(WList list : wlists)
			{
				System.out.println(list.getTitle());
				
			}
		}
		catch (AuthException | NetworkException e)
		{
			System.out.println(e.getMessage());
		}
		
		in.nextLine();
		
		in.close();

	}

}
