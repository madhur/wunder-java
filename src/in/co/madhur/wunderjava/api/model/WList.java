package in.co.madhur.wunderjava.api.model;

import com.google.gson.annotations.Expose;

public class WList
{

	@Expose
	private String id;
	@Expose
	private String type;
	@Expose
	private String local_identifier;
	@Expose
	private String owner_id;
	@Expose
	private Double position;
	@Expose
	private String title;
	@Expose
	private String created_at;
	@Expose
	private String updated_at;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getLocal_identifier()
	{
		return local_identifier;
	}

	public void setLocal_identifier(String local_identifier)
	{
		this.local_identifier = local_identifier;
	}

	public String getOwner_id()
	{
		return owner_id;
	}

	public void setOwner_id(String owner_id)
	{
		this.owner_id = owner_id;
	}

	public Double getPosition()
	{
		return position;
	}

	public void setPosition(Double position)
	{
		this.position = position;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
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

}