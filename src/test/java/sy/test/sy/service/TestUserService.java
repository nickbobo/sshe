package sy.test.sy.service;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import sy.model.base.ActivityUser;
import sy.model.base.Syuser;
import sy.service.base.ActivityUserServiceI;
import sy.service.base.SyuserServiceI;
import sy.util.base.FastjsonFilter;
import sy.util.base.HqlFilter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml", "classpath:spring-druid.xml" })
public class TestUserService {

	@Autowired
	private SyuserServiceI userService;
	
	@SuppressWarnings("unused")
	@Autowired
	private ActivityUserServiceI activityUserService;
	
	@Test
	@Transactional(readOnly = true)
	public void gitActivityUser(){
		ActivityUser a = activityUserService.getById(1);// getActivityUser("1");
		System.out.println(writeJsonByFilter(a,null,null));
	}
	
	@Test
	@Transactional(readOnly = true)
	public void getUser() {
		Syuser t = userService.getById("1");
		System.out.println(writeJsonByFilter(t, null, null));
	}
	
	

	@Test
	@Transactional(readOnly = true)
	public void test() {
		HqlFilter filter = new HqlFilter();
		userService.getByFilter(filter);
		userService.findByFilter(filter);
		userService.findByFilter(filter, 1, 10);
		userService.countByFilter(filter);
	}

	private String writeJsonByFilter(Object object, String[] includesProperties, String[] excludesProperties) {
		FastjsonFilter filter = new FastjsonFilter();// excludes优先于includes
		if (excludesProperties != null && excludesProperties.length > 0) {
			filter.getExcludes().addAll(Arrays.<String> asList(excludesProperties));
		}
		if (includesProperties != null && includesProperties.length > 0) {
			filter.getIncludes().addAll(Arrays.<String> asList(includesProperties));
		}
		String json = JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat);
		return json;
	}

}
