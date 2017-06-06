package sy.model.base;

/**
 * sessionInfo模型，只要登录成功，就需要设置到session里面，便于系统使用
 * 
 * @author 孙宇
 * 
 */
public class SessionInfo implements java.io.Serializable {

	private Syuser user;
	private ActivityUser activityUser;
	public Syuser getUser() {
		return user;
	}

	public void setUser(Syuser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SessionInfo [user=" + user + ", activityUser=" + activityUser + "]";
	}

	public ActivityUser getActivityUser() {
		return activityUser;
	}

	public void setActivityUser(ActivityUser activityUser) {
		this.activityUser = activityUser;
	}

}
