package sy.test.sy.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import sy.dao.base.BaseDaoI;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml", "classpath:spring-druid.xml" })
public class TestDao {

	@SuppressWarnings("rawtypes")
	@Autowired
	private BaseDaoI baseDao;

	@SuppressWarnings("rawtypes")
	@Test
	@Transactional
	public void test() {
		@SuppressWarnings("unchecked")
		List<Map> l = baseDao.findBySql("select t.DESCRIPTION dddd from syresource t");
		
		System.out.println(l.size());
		for(int i = 0 ;i < l.size();i++){
			
//			Map map = l.get(i);
//			Set set = map.keySet();
			
			System.out.println(JSON.toJSONString(l.get(i)));//.toString());
			
//			Iterator it = set.iterator();
//			while(it.hasNext()) {
//				System.out.println(map.get(it.next()));
//			}
//			System.out.println(l.get(i));
		}
//		System.out.println(JSON.toJSONString(l));

		@SuppressWarnings("unchecked")
		List<Map> l2 = baseDao.findBySql("select t.* from syresource t");
//		System.out.println(JSON.toJSONString(l2));
	}

}
