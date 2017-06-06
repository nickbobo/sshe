package sy.action.base;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import sy.action.BaseAction;
import sy.model.base.Activity;
import sy.service.base.ActivityServiceI;
//import sy.service.base.ActivityUserServiceI;


@SuppressWarnings("serial")
@Namespace("/base")
public class ActivityAction extends BaseAction<Activity> {
//	@Autowired
//	private ActivityUserServiceI userService;
	
	@Autowired
	public void setService(ActivityServiceI service) {
		this.service = service;
	}
	public void getActivityUser(){
		List<Activity>  list= ((ActivityServiceI)service).find();
		writeJson(list);
	}
	
	
}
