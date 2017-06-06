package sy.model.base;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Activityrecord implements Serializable {
	private String id;
	private String activityId;
	private String activityName;
	private String activityUrl;
	private String activityScore;
	
	private String UserId;
	private String UserName;
	private String UserHeadUrl;
	private int sex;
	private Date createdatetime;
	
	
	public Activityrecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activityrecord(String id, String activityId, String activityName, String activityUrl, String activityScore,
			String userId, String userName, String userHeadUrl, int sex, Date createdatetime) {
		super();
		this.id = id;
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityUrl = activityUrl;
		this.activityScore = activityScore;
		UserId = userId;
		UserName = userName;
		UserHeadUrl = userHeadUrl;
		this.sex = sex;
		this.createdatetime = createdatetime;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityUrl() {
		return activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}
	public String getActivityScore() {
		return activityScore;
	}
	public void setActivityScore(String activityScore) {
		this.activityScore = activityScore;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserHeadUrl() {
		return UserHeadUrl;
	}
	public void setUserHeadUrl(String userHeadUrl) {
		UserHeadUrl = userHeadUrl;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getCreatedatetime() {
		return createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

}
