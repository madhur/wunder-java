package in.co.madhur.wunderjava.api;

import in.co.madhur.wunderjava.api.model.LoginResponse;
import in.co.madhur.wunderjava.api.model.Me;
import in.co.madhur.wunderjava.api.model.WList;
import in.co.madhur.wunderjava.api.model.WTask;

import java.util.List;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;

public interface WunderAPI
{
	@FormUrlEncoded
	@POST("/login")
	  LoginResponse login(@Field("email") String username, @Field("password")String password);
	
	@GET(value = "/me")
	  Me getUserInfo(@Header("Authorization") String authorization);
	
	@GET(value = "/me/tasks")
	List<WTask> GetWunderTasks(@Header("Authorization") String authorization);
	
	@POST(value = "/me/tasks")
	List<WTask> CreateWunderTask(@Header("Authorization") String authorization, String listId, String title,  String isStarred, String dueDate);
	
	@GET(value = "/me/lists")
	List<WList> GetLists(@Header("Authorization") String authorization);
}
