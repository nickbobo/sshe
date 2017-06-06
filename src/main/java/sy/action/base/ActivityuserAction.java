package sy.action.base;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import sy.action.BaseAction;
import sy.model.base.ActivityUser;
import sy.model.base.SessionInfo;
import sy.model.easyui.Json;
//import sy.model.easyui.Grid;
import sy.service.base.ActivityUserServiceI;
import sy.service.base.SyorganizationServiceI;
import sy.util.base.ConfigUtil;
import sy.util.base.HqlFilter;


@SuppressWarnings("serial")
@Namespace("/base")
@Action
public class ActivityuserAction extends BaseAction<ActivityUser> {
//	@Autowired
//	private ActivityUserServiceI userService;
	
	@Autowired
	public void setService(ActivityUserServiceI service){
		this.service = service;
	}
	
	public void save(){
		Json json = new Json();
		if (data != null) {
			SessionInfo sessionInfo = (SessionInfo) getSession().getAttribute(ConfigUtil.getSessionInfoName());
			((ActivityUserServiceI) service).saveActivityUser(data, sessionInfo.getUser().getId());
			json.setSuccess(true);
		}
		writeJson(json);
	}
	
	public void getActivityUser(){
		List<ActivityUser>  list= ((ActivityUserServiceI)service).find();
		writeJson(list);
	}
	
	public void getActivityUserId(){
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		hqlFilter.addFilter("QUERY_activityUser#id_S_EQ",id);
		ActivityUser activityUser = ((ActivityUserServiceI)service).getById(id);
		writeJson(activityUser);
	}
}







