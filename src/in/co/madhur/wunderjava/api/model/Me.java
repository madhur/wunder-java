package in.co.madhur.wunderjava.api.model;

import com.google.gson.annotations.Expose;

public class Me
{

	@Expose
	private String product;
	@Expose
	private String name;
	@Expose
	private String created_at;
	@Expose
	private String updated_at;
	@Expose
	private String email;
	@Expose
	private String token;
	@Expose
	private Object avatar;
	@Expose
	private String confirmation_state;
	@Expose
	private String type;
	@Expose
	private String id;
	@Expose
	private Boolean email_confirmed;

	public String getProduct()
	{
		return product;
	}

	public void setProduct(String product)
	{
		this.product = product;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCreated_at()
	{
		return created_at;
	}

	public void setCreated_at(String created_at)
	{
		this.created_at = created_at;
	}

	public String getUpdated_at()
	{
		return updated_at;
	}

	public void setUpdated_at(String updated_at)
	{
		this.updated_at = updated_at;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	public Object getAvatar()
	{
		return avatar;
	}

	public void setAvatar(Object avatar)
	{
		this.avatar = avatar;
	}

	public String getConfirmation_state()
	{
		return confirmation_state;
	}

	public void setConfirmation_state(String confirmation_state)
	{
		this.confirmation_state = confirmation_state;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Boolean getEmail_confirmed()
	{
		return email_confirmed;
	}

	public void setEmail_confirmed(Boolean email_confirmed)
	{
		this.email_confirmed = email_confirmed;
	}

}