package sy.action.base;

import java.util.ArrayList;
import java.util.Hashtable;
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

	// @Autowired
	// private ActivityRecordServiceI acctivityRecordService;

	@Autowired
	public void setService(ActivityrecordServiceI service) {
		this.service = service;
	}

	public void doNotNeedSecurity_getRecordByActivityUserId() {

		// String jsoncallback = request.getParameter("sort");
		System.out.println("jsoncallback:11");
		// System.out.println("jsoncallback:22"+jsoncallback);

		id = "1";
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		// hqlFilter.addFilter("QUERY_user#id_S_EQ", id);
		List<Record> record = ((ActivityrecordServiceI) service)
				.findRecordByFilter(hqlFilter);
		System.out.println(record.toString());

		List<Record> l = new ArrayList<Record>(record);

		List<Activityrecord> ar = new ArrayList<Activityrecord>();

		Activityrecord ard = new Activityrecord();

		for (Record r : l) {
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
		// {
		// "errmsg": "",
		// "jsParams": {
		// "signature": "64a36e43e7a40c6a9a31202e244cbc8cd7d6416a",
		// "noncestr": "25ca9cfa5903543d898631e7807e9c4e",
		// "timestamp": 1497862082
		// },
		// "issubscribe": 1,
		// "flag": 1,
		// "contentType": "application/json;charset=UTF-8",
		// "openid": "oj3y9wKmU7d_nyzjnLpO5oQTtyPg",
		// "passport": "2a9549c520ef6b4c74bebb6329799ae4",
		// "code": 0,
		// "obj": [{
		// "awardtype": "1",
		// "allcount": 0
		// }, {
		// "awardtype": "2",
		// "allcount": 0
		// }, {
		// "awardtype": "4",
		// "allcount": 1
		// }]
		// }
		Hashtable<String, String> jsParams = new Hashtable<String, String>();
		jsParams.put("signature", "64a36e43e7a40c6a9a31202e244cbc8cd7d6416a");
		jsParams.put("noncestr", "25ca9cfa5903543d898631e7807e9c4e");
		jsParams.put("timestamp", "1497862082");

		Hashtable<String, Object> numbers = new Hashtable<String, Object>();

		numbers.put("errmsg:", "12");
		numbers.put("jsParams", jsParams);
		numbers.put("issubscribe", 1);
		numbers.put("three", ar);

		// for(Activityrecord ars : ar){
		// System.out.println(ars.getId());
		// }
		//
		// for (Record r : l) {
		// System.out.println(r.getActivity().getName());
		// }

		// List<Syrole> l = new ArrayList<Syrole>(roles);
		// Collections.sort(l, new Comparator<Syrole>() {// 排序
		// @Override
		// public int compare(Syrole o1, Syrole o2) {
		// if (o1.getSeq() == null) {
		// o1.setSeq(1000);
		// }
		// if (o2.getSeq() == null) {
		// o2.setSeq(1000);
		// }
		// return o1.getSeq().compareTo(o2.getSeq());
		// }
		// });

		writeJson(numbers);
	}
}
