package sy.action.base;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import sy.action.BaseAction;
import sy.model.base.Activityrecord;
import sy.model.base.Record;
import sy.service.base.ActivityrecordServiceI;
import sy.util.base.HqlFilter;


@SuppressWarnings("serial")
@Namespace("/base")
@Action
public class RecordAction extends BaseAction<Record> {

	//@Autowired
	//private ActivityRecordServiceI acctivityRecordService;
	
	@Autowired
	public void setService(ActivityrecordServiceI service){
		this.service = service;
	}
	
	public void doNotNeedSecurity_getRecordByActivityUserId(){
		id= "1";
		HqlFilter hqlFilter = new HqlFilter(getRequest());
//		hqlFilter.addFilter("QUERY_user#id_S_EQ", id);
		List<Record> record = ((ActivityrecordServiceI) service).findRecordByFilter(hqlFilter);
		System.out.println(record.toString());
		
		List<Record> l = new ArrayList<Record>(record);
		
		List<Activityrecord> ar = new ArrayList<Activityrecord>();
		
		Activityrecord ard = new Activityrecord();
		
		
			for(Record r : l){
				ard.setId(r.getId());
				ard.setActivityId(r.getActivity().getId());
				ard.setActivityName(r.getActivity().getName());
				ard.setActivityScore(r.getScore());
				ard.setActivityUrl(r.getActivity().getUrl());
				ard.setUserHeadUrl(r.getActivityUser().getHeadurl());
				ard.setUserId(r.getActivityUser().getId());
				ard.setUserName(r.getActivityUser().getName());
				ard.setSex(r.getActivityUser().getSex());
				ard.setCreatedatetime(r.getCreatedatetime());
				ar.add(ard);
			}
			
			for(Activityrecord ars : ar){
				System.out.println(ars.getId());
			}
		
		for (Record r : l) {
			System.out.println(r.getActivity().getName());
		}
		
		
//		List<Syrole> l = new ArrayList<Syrole>(roles);
//		Collections.sort(l, new Comparator<Syrole>() {// 排序
//					@Override
//					public int compare(Syrole o1, Syrole o2) {
//						if (o1.getSeq() == null) {
//							o1.setSeq(1000);
//						}
//						if (o2.getSeq() == null) {
//							o2.setSeq(1000);
//						}
//						return o1.getSeq().compareTo(o2.getSeq());
//					}
//				});
		
		writeJson(ar);
	}
}
