package sy.service.base.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.base.BaseDaoI;
import sy.model.base.ActivityUser;
import sy.model.base.Syuser;
import sy.service.base.ActivityUserServiceI;
import sy.service.impl.BaseServiceImpl;
import sy.util.base.HqlFilter;

@Service
public class ActivityUserServiceImpl extends BaseServiceImpl<ActivityUser> implements ActivityUserServiceI {

	@Autowired
	private BaseDaoI<ActivityUser> baseDao;
	@Override
	public ActivityUser getActivityUser(Serializable id){
		@SuppressWarnings("unchecked")
		Class<ActivityUser> c = (Class<ActivityUser>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return baseDao.getById(c, id);
	}
	@Override
	public List<ActivityUser> findActivityUserByFilter(HqlFilter hqlFilter) {
		String hql = "select * from activityUser";
		
		return find(hql+hqlFilter.getWhereHql(),hqlFilter.getParams());
	}
	@Override
	public void saveActivityUser(ActivityUser activityUser, String activityUserId) {
		
		save(activityUser);

//		ActivityUser user = baseDao.getById(ActivityUser.class, activityUserId);
		
//		save(syorganization);
//
//		Syuser user = userDao.getById(Syuser.class, userId);
//		user 
//		user.getSyorganizations().add(syorganization);
//		user.get
//		user.getSyroles().add(syrole);// 把新添加的角色与当前用户关联
	}
}
