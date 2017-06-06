/**
 * 
 */
package sy.service.base;

import java.io.Serializable;
import java.util.List;

import sy.model.base.ActivityUser;
import sy.model.base.Syrole;
import sy.service.BaseServiceI;
import sy.util.base.HqlFilter;

/**
 * @author nick
 *
 */
public interface ActivityUserServiceI extends BaseServiceI<ActivityUser> {
	public ActivityUser getActivityUser(Serializable id);
	
	public List<ActivityUser>  findActivityUserByFilter(HqlFilter hqlFilter);
	
	
	public void saveActivityUser(ActivityUser activityUser, String activityUserId);
}
