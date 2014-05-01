package in.co.madhur.wunderjava.api.model;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "product", "name", "settings", "created_at", "updated_at",
		"email", "token", "avatar", "confirmation_state", "type", "id",
		"email_confirmed" })
public class LoginResponse
{

	@JsonProperty("product")
	private String product;
	@JsonProperty("name")
	private String name;
	@JsonProperty("settings")
	private Settings settings;
	@JsonProperty("created_at")
	private String created_at;
	@JsonProperty("updated_at")
	private String updated_at;
	@JsonProperty("email")
	private String email;
	@JsonProperty("token")
	private String token;
	@JsonProperty("avatar")
	private Object avatar;
	@JsonProperty("confirmation_state")
	private String confirmation_state;
	@JsonProperty("type")
	private String type;
	@JsonProperty("id")
	private String id;
	@JsonProperty("email_confirmed")
	private Boolean email_confirmed;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("product")
	public String getProduct()
	{
		return product;
	}

	@JsonProperty("product")
	public void setProduct(String product)
	{
		this.product = product;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}

	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@JsonProperty("settings")
	public Settings getSettings()
	{
		return settings;
	}

	@JsonProperty("settings")
	public void setSettings(Settings settings)
	{
		this.settings = settings;
	}

	@JsonProperty("created_at")
	public String getCreated_at()
	{
		return created_at;
	}

	@JsonProperty("created_at")
	public void setCreated_at(String created_at)
	{
		this.created_at = created_at;
	}

	@JsonProperty("updated_at")
	public String getUpdated_at()
	{
		return updated_at;
	}

	@JsonProperty("updated_at")
	public void setUpdated_at(String updated_at)
	{
		this.updated_at = updated_at;
	}

	@JsonProperty("email")
	public String getEmail()
	{
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonProperty("token")
	public String getToken()
	{
		return token;
	}

	@JsonProperty("token")
	public void setToken(String token)
	{
		this.token = token;
	}

	@JsonProperty("avatar")
	public Object getAvatar()
	{
		return avatar;
	}

	@JsonProperty("avatar")
	public void setAvatar(Object avatar)
	{
		this.avatar = avatar;
	}

	@JsonProperty("confirmation_state")
	public String getConfirmation_state()
	{
		return confirmation_state;
	}

	@JsonProperty("confirmation_state")
	public void setConfirmation_state(String confirmation_state)
	{
		this.confirmation_state = confirmation_state;
	}

	@JsonProperty("type")
	public String getType()
	{
		return type;
	}

	@JsonProperty("type")
	public void setType(String type)
	{
		this.type = type;
	}

	@JsonProperty("id")
	public String getId()
	{
		return id;
	}

	@JsonProperty("id")
	public void setId(String id)
	{
		this.id = id;
	}

	@JsonProperty("email_confirmed")
	public Boolean getEmail_confirmed()
	{
		return email_confirmed;
	}

	@JsonProperty("email_confirmed")
	public void setEmail_confirmed(Boolean email_confirmed)
	{
		this.email_confirmed = email_confirmed;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties()
	{
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value)
	{
		this.additionalProperties.put(name, value);
	}

}