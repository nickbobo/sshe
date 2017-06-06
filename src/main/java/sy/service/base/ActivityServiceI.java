package sy.service.base;

import java.util.List;

import sy.model.base.Activity;
import sy.service.BaseServiceI;
import sy.util.base.HqlFilter;

public interface ActivityServiceI extends BaseServiceI<Activity> {
	
	public List<Activity> findActivityByFilter(HqlFilter hqlFilter);

}
