package in.co.madhur.wunderjava;

import in.co.madhur.wunderjava.api.AuthException;
import in.co.madhur.wunderjava.api.NetworkException;
import in.co.madhur.wunderjava.api.WunderList;
import in.co.madhur.wunderjava.api.model.Me;
import in.co.madhur.wunderjava.api.model.WList;
import in.co.madhur.wunderjava.api.model.WTask;

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
			
			
			Me me=wunderList.GetUserInfo();
			System.out.println("Name: "+ me.getName());
			System.out.println("Authorization Toekn: "+ me.getToken());
			
			System.out.println("Press enter to print out the lists");
			in.nextLine();
			
			List<WList> wlists=wunderList.GetLists();
			System.out.println("Printing out the lists: ");
			for(WList list : wlists)
			{
				System.out.println(list.getTitle());
				
			}
			
			System.out.println("Press enter to print out the tasks");
			
			in.nextLine();
			
			
			List<WTask> wTasks=wunderList.GetTasks();
			System.out.println("Printing out the Tasks: ");
			for(WTask task : wTasks)
			{
				System.out.println(task.getTitle());
				
			}
			
			
			System.out.println("Creating a test task...");
			//wunderList.
		}
		catch (AuthException | NetworkException e)
		{
			System.out.println(e.getMessage());
		}
		
		in.nextLine();
		
		in.close();

	}

}
