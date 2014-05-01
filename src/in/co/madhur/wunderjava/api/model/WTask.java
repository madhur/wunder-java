package in.co.madhur.wunderjava.api.model;


import com.google.gson.annotations.Expose;

public class WTask
{

	@Expose
	private Object assignee_id;
	@Expose
	private String completed_at;
	@Expose
	private Object completed_by_id;
	@Expose
	private String created_at;
	@Expose
	private String created_by_id;
	@Expose
	private Object deleted_at;
	@Expose
	private Object due_date;
	@Expose
	private String id;
	@Expose
	private String list_id;
	@Expose
	private String local_identifier;
	@Expose
	private String note;
	@Expose
	private String owner_id;
	@Expose
	private Object parent_id;
	@Expose
	private Double position;
	@Expose
	private Integer recurrence_count;
	@Expose
	private Object recurrence_type;
	@Expose
	private Object recurring_parent_id;
	@Expose
	private Boolean starred;
	@Expose
	private String title;
	@Expose
	private String type;
	@Expose
	private String updated_at;
	@Expose
	private String updated_by_id;
	@Expose
	private String user_id;

	public Object getAssignee_id()
	{
		return assignee_id;
	}

	public void setAssignee_id(Object assignee_id)
	{
		this.assignee_id = assignee_id;
	}

	public String getCompleted_at()
	{
		return completed_at;
	}

	public void setCompleted_at(String completed_at)
	{
		this.completed_at = completed_at;
	}

	public Object getCompleted_by_id()
	{
		return completed_by_id;
	}

	public void setCompleted_by_id(Object completed_by_id)
	{
		this.completed_by_id = completed_by_id;
	}

	public String getCreated_at()
	{
		return created_at;
	}

	public void setCreated_at(String created_at)
	{
		this.created_at = created_at;
	}

	public String getCreated_by_id()
	{
		return created_by_id;
	}

	public void setCreated_by_id(String created_by_id)
	{
		this.created_by_id = created_by_id;
	}

	public Object getDeleted_at()
	{
		return deleted_at;
	}

	public void setDeleted_at(Object deleted_at)
	{
		this.deleted_at = deleted_at;
	}

	public Object getDue_date()
	{
		return due_date;
	}

	public void setDue_date(Object due_date)
	{
		this.due_date = due_date;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getList_id()
	{
		return list_id;
	}

	public void setList_id(String list_id)
	{
		this.list_id = list_id;
	}

	public String getLocal_identifier()
	{
		return local_identifier;
	}

	public void setLocal_identifier(String local_identifier)
	{
		this.local_identifier = local_identifier;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	public String getOwner_id()
	{
		return owner_id;
	}

	public void setOwner_id(String owner_id)
	{
		this.owner_id = owner_id;
	}

	public Object getParent_id()
	{
		return parent_id;
	}

	public void setParent_id(Object parent_id)
	{
		this.parent_id = parent_id;
	}

	public Double getPosition()
	{
		return position;
	}

	public void setPosition(Double position)
	{
		this.position = position;
	}

	public Integer getRecurrence_count()
	{
		return recurrence_count;
	}

	public void setRecurrence_count(Integer recurrence_count)
	{
		this.recurrence_count = recurrence_count;
	}

	public Object getRecurrence_type()
	{
		return recurrence_type;
	}

	public void setRecurrence_type(Object recurrence_type)
	{
		this.recurrence_type = recurrence_type;
	}

	public Object getRecurring_parent_id()
	{
		return recurring_parent_id;
	}

	public void setRecurring_parent_id(Object recurring_parent_id)
	{
		this.recurring_parent_id = recurring_parent_id;
	}

	public Boolean getStarred()
	{
		return starred;
	}

	public void setStarred(Boolean starred)
	{
		this.starred = starred;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getUpdated_at()
	{
		return updated_at;
	}

	public void setUpdated_at(String updated_at)
	{
		this.updated_at = updated_at;
	}

	public String getUpdated_by_id()
	{
		return updated_by_id;
	}

	public void setUpdated_by_id(String updated_by_id)
	{
		this.updated_by_id = updated_by_id;
	}

	public String getUser_id()
	{
		return user_id;
	}

	public void setUser_id(String user_id)
	{
		this.user_id = user_id;
	}

}