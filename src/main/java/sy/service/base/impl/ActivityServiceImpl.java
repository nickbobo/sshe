package sy.service.base.impl;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import sy.dao.base.BaseDaoI;
import sy.model.base.Activity;
//import sy.model.base.ActivityUser;
import sy.service.base.ActivityServiceI;
import sy.service.impl.BaseServiceImpl;
import sy.util.base.HqlFilter;
@Service
public class ActivityServiceImpl extends BaseServiceImpl<Activity> implements ActivityServiceI {
//	@Autowired
//	private BaseDaoI<Activity> activityUserDao;
//	@Autowired
//	private BaseDaoI<Activity> baseDao;
	@Override
	public List<Activity> findActivityByFilter(HqlFilter hqlFilter) {
		String hql = "select * from activity";
		
		return find(hql+hqlFilter.getWhereHql(),hqlFilter.getParams());
	}



}
