package in.co.madhur.wunderjava.api.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "smartlist_visibility_week", "smartlist_visibility_today",
		"confirm_delete_entity", "smartlist_visibility_starred",
		"print_completed_items", "sound_notification_enabled",
		"newsletter_subscription_enabled", "account_locale",
		"new_task_location", "smartlist_visibility_all",
		"smartlist_visibility_done", "notifications_desktop_enabled",
		"background", "sound_checkoff_enabled", "notifications_email_enabled",
		"use_badge_icon" })
public class Settings
{

	@JsonProperty("smartlist_visibility_week")
	private String smartlist_visibility_week;
	@JsonProperty("smartlist_visibility_today")
	private String smartlist_visibility_today;
	@JsonProperty("confirm_delete_entity")
	private String confirm_delete_entity;
	@JsonProperty("smartlist_visibility_starred")
	private String smartlist_visibility_starred;
	@JsonProperty("print_completed_items")
	private String print_completed_items;
	@JsonProperty("sound_notification_enabled")
	private String sound_notification_enabled;
	@JsonProperty("newsletter_subscription_enabled")
	private String newsletter_subscription_enabled;
	@JsonProperty("account_locale")
	private String account_locale;
	@JsonProperty("new_task_location")
	private String new_task_location;
	@JsonProperty("smartlist_visibility_all")
	private String smartlist_visibility_all;
	@JsonProperty("smartlist_visibility_done")
	private String smartlist_visibility_done;
	@JsonProperty("notifications_desktop_enabled")
	private String notifications_desktop_enabled;
	@JsonProperty("background")
	private String background;
	@JsonProperty("sound_checkoff_enabled")
	private String sound_checkoff_enabled;
	@JsonProperty("notifications_email_enabled")
	private String notifications_email_enabled;
	@JsonProperty("use_badge_icon")
	private String use_badge_icon;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("smartlist_visibility_week")
	public String getSmartlist_visibility_week()
	{
		return smartlist_visibility_week;
	}

	@JsonProperty("smartlist_visibility_week")
	public void setSmartlist_visibility_week(String smartlist_visibility_week)
	{
		this.smartlist_visibility_week = smartlist_visibility_week;
	}

	@JsonProperty("smartlist_visibility_today")
	public String getSmartlist_visibility_today()
	{
		return smartlist_visibility_today;
	}

	@JsonProperty("smartlist_visibility_today")
	public void setSmartlist_visibility_today(String smartlist_visibility_today)
	{
		this.smartlist_visibility_today = smartlist_visibility_today;
	}

	@JsonProperty("confirm_delete_entity")
	public String getConfirm_delete_entity()
	{
		return confirm_delete_entity;
	}

	@JsonProperty("confirm_delete_entity")
	public void setConfirm_delete_entity(String confirm_delete_entity)
	{
		this.confirm_delete_entity = confirm_delete_entity;
	}

	@JsonProperty("smartlist_visibility_starred")
	public String getSmartlist_visibility_starred()
	{
		return smartlist_visibility_starred;
	}

	@JsonProperty("smartlist_visibility_starred")
	public void setSmartlist_visibility_starred(String smartlist_visibility_starred)
	{
		this.smartlist_visibility_starred = smartlist_visibility_starred;
	}

	@JsonProperty("print_completed_items")
	public String getPrint_completed_items()
	{
		return print_completed_items;
	}

	@JsonProperty("print_completed_items")
	public void setPrint_completed_items(String print_completed_items)
	{
		this.print_completed_items = print_completed_items;
	}

	@JsonProperty("sound_notification_enabled")
	public String getSound_notification_enabled()
	{
		return sound_notification_enabled;
	}

	@JsonProperty("sound_notification_enabled")
	public void setSound_notification_enabled(String sound_notification_enabled)
	{
		this.sound_notification_enabled = sound_notification_enabled;
	}

	@JsonProperty("newsletter_subscription_enabled")
	public String getNewsletter_subscription_enabled()
	{
		return newsletter_subscription_enabled;
	}

	@JsonProperty("newsletter_subscription_enabled")
	public void setNewsletter_subscription_enabled(String newsletter_subscription_enabled)
	{
		this.newsletter_subscription_enabled = newsletter_subscription_enabled;
	}

	@JsonProperty("account_locale")
	public String getAccount_locale()
	{
		return account_locale;
	}

	@JsonProperty("account_locale")
	public void setAccount_locale(String account_locale)
	{
		this.account_locale = account_locale;
	}

	@JsonProperty("new_task_location")
	public String getNew_task_location()
	{
		return new_task_location;
	}

	@JsonProperty("new_task_location")
	public void setNew_task_location(String new_task_location)
	{
		this.new_task_location = new_task_location;
	}

	@JsonProperty("smartlist_visibility_all")
	public String getSmartlist_visibility_all()
	{
		return smartlist_visibility_all;
	}

	@JsonProperty("smartlist_visibility_all")
	public void setSmartlist_visibility_all(String smartlist_visibility_all)
	{
		this.smartlist_visibility_all = smartlist_visibility_all;
	}

	@JsonProperty("smartlist_visibility_done")
	public String getSmartlist_visibility_done()
	{
		return smartlist_visibility_done;
	}

	@JsonProperty("smartlist_visibility_done")
	public void setSmartlist_visibility_done(String smartlist_visibility_done)
	{
		this.smartlist_visibility_done = smartlist_visibility_done;
	}

	@JsonProperty("notifications_desktop_enabled")
	public String getNotifications_desktop_enabled()
	{
		return notifications_desktop_enabled;
	}

	@JsonProperty("notifications_desktop_enabled")
	public void setNotifications_desktop_enabled(String notifications_desktop_enabled)
	{
		this.notifications_desktop_enabled = notifications_desktop_enabled;
	}

	@JsonProperty("background")
	public String getBackground()
	{
		return background;
	}

	@JsonProperty("background")
	public void setBackground(String background)
	{
		this.background = background;
	}

	@JsonProperty("sound_checkoff_enabled")
	public String getSound_checkoff_enabled()
	{
		return sound_checkoff_enabled;
	}

	@JsonProperty("sound_checkoff_enabled")
	public void setSound_checkoff_enabled(String sound_checkoff_enabled)
	{
		this.sound_checkoff_enabled = sound_checkoff_enabled;
	}

	@JsonProperty("notifications_email_enabled")
	public String getNotifications_email_enabled()
	{
		return notifications_email_enabled;
	}

	@JsonProperty("notifications_email_enabled")
	public void setNotifications_email_enabled(String notifications_email_enabled)
	{
		this.notifications_email_enabled = notifications_email_enabled;
	}

	@JsonProperty("use_badge_icon")
	public String getUse_badge_icon()
	{
		return use_badge_icon;
	}

	@JsonProperty("use_badge_icon")
	public void setUse_badge_icon(String use_badge_icon)
	{
		this.use_badge_icon = use_badge_icon;
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
