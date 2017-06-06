package sy.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.base.BaseDaoI;
import sy.model.base.Activity;
import sy.model.base.Record;
import sy.service.base.ActivityrecordServiceI;
import sy.service.impl.BaseServiceImpl;
import sy.util.base.HqlFilter;

@Service
public class ActivityrecordServiceImpl extends BaseServiceImpl<Record> implements ActivityrecordServiceI {

	@Autowired
	private BaseDaoI<Record> activityUserDao;
	@Autowired
	private BaseDaoI<Record> baseDao;
	
	@Override
	public List<Record> findRecordByFilter(HqlFilter hqlFilter) {
		String hql = "select distinct t from Record t join t.activityUser user";
		return find(hql + hqlFilter.getWhereAndOrderHql(), hqlFilter.getParams());
	}
}
