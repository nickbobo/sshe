package sy.action;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import sy.model.easyui.Grid;
import sy.model.easyui.Json;
import sy.service.BaseServiceI;
import sy.util.base.BeanUtils;
import sy.util.base.FastjsonFilter;
import sy.util.base.HqlFilter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionSupport;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import junit.framework.Test;
/**
 * 基础ACTION,其他ACTION继承此ACTION来获得writeJson和ActionSupport的功能
 * 
 * 基本的CRUD已实现，子类继承BaseAction的时候，提供setService方法即可
 * 
 * 注解@Action后，访问地址就是命名空间+类名(全小写，并且不包括Action后缀)，本action的访问地址就是/base.sy
 * 
 * @author 孙宇
 * 
 */
@ParentPackage("SyPackage")
@Namespace("/")
@Action
public class BaseAction<T> extends ActionSupport {
	private static final Logger logger = Logger.getLogger(BaseAction.class);

	protected int page = 1;// 当前页
	protected int rows = 10;// 每页显示记录数
	protected String sort;// 排序字段
	protected String order = "asc";// asc/desc
	protected String q;// easyui的combo和其子类过滤时使用

	protected String id;// 主键
	protected String ids;// 主键集合，逗号分割
	protected T data;// 数据模型(与前台表单name相同，name="data.xxx")

	protected BaseServiceI<T> service;// 业务逻辑

	/**
	 * 继承BaseAction的action需要先设置这个方法，使其获得当前action的业务服务
	 * 
	 * @param service
	 */
	public void setService(BaseServiceI<T> service) {
		this.service = service;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}
	public static Map<String,String> readClassAttr(Object object) throws Exception{

	    Field[] fields=object.getClass().getDeclaredFields();
	    String keyList="";
	    String valueList="";

	    for(Field field:fields){
	        field.setAccessible(true);  

	        if(field.get(object)!=null&&!"".equals(field.get(object).toString())){

	            keyList+=","+field.getName();

	            if("a".equals(field.getName())){

	                valueList+=","+"特殊格式哦";

	            }else{

	                valueList+=","+field.get(object);

	            }

	            System.out.println(field.getName()+"   "+field.get(object).toString());
	        }
	    }

	    Map<String,String> maps=new HashMap<String, String>();
	    maps.put("keys", keyList);
	    maps.put("values",valueList);

	    return maps;
	}
	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @param includesProperties
	 *            需要转换的属性
	 * @param excludesProperties
	 *            不需要转换的属性
	 */
	public void writeJsonByFilter(Object object, String[] includesProperties, String[] excludesProperties) {
		try {
			FastjsonFilter filter = new FastjsonFilter();// excludes优先于includes
			if (excludesProperties != null && excludesProperties.length > 0) {
				filter.getExcludes().addAll(Arrays.<String> asList(excludesProperties));
			}
			if (includesProperties != null && includesProperties.length > 0) {
				filter.getIncludes().addAll(Arrays.<String> asList(includesProperties));
			}
			
			
//			java.util.Calendar clndr = java.util.Calendar.getInstance();  
//			Class cls = clndr.getClass();  
//			  
//			System.out.println(cls.getName());  
//			java.lang.reflect.Field[] flds = object.;  
//			  
//			if ( flds != null )  
//			{  
//			    for ( int i = 0; i < flds.length; i++ )  
//			    {  
//			        System.out.println(flds[i].getName() + " - " + flds[i].get(clndr));  
//			    }  
//			}  
//			

			readClassAttr(object);

//			object.getClass();
//			
//
//			Object car = object;
//			Field[] fields = c.getDeclaredFields();//拿到数据成员
//			Method[] methods = c.getMethods();//拿到函数成员
//			System.out.println(fields.length);
//			System.out.println(methods.length);
//			for(Field f : fields){
//			    System.out.println("该类的内部变量有:"+f.getName());
//			}
//			for(Method m : methods) {
//			    System.out.println("该类的方法有:"+m.getName());
//			}
			
			System.out.println(object.toString());
			System.out.println("对象转JSON：要排除的属性[" +object+ excludesProperties + "]要包含的属性[" + includesProperties + "]");
			logger.info("对象转JSON：要排除的属性[" + excludesProperties + "]要包含的属性[" + includesProperties + "]");
			String json;
			String User_Agent = getRequest().getHeader("User-Agent");
			if (StringUtils.indexOfIgnoreCase(User_Agent, "MSIE 6") > -1) {
				// 使用SerializerFeature.BrowserCompatible特性会把所有的中文都会序列化为\\uXXXX这种格式，字节数会多一些，但是能兼容IE6
				json = JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.BrowserCompatible);
			} else {
				// 使用SerializerFeature.WriteDateUseDateFormat特性来序列化日期格式的类型为yyyy-MM-dd hh24:mi:ss
				// 使用SerializerFeature.DisableCircularReferenceDetect特性关闭引用检测和生成
				json = JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect);
			}
			logger.info("转换后的JSON字符串：" + json);
			getResponse().setContentType("text/html;charset=utf-8");
			getResponse().getWriter().write(json);


			
			getResponse().setContentType("text/plain");  
			getResponse().setHeader("Pragma", "No-cache");  
			getResponse().setHeader("Content-type", "application/json");  
			getResponse().setHeader("Cache-Control", "no-cache");  
			getResponse().setDateHeader("Expires", 0);  
			
//			HttpServletRequest  request = ServletActionContext.getRequest();
//	        Map<String,String> map = new HashMap<String,String>();   
//	        map.put("result", "content");  
//	        PrintWriter out = response.getWriter();       
//	        JSONObject resultJSON = JSONObject.fromObject(json); //根据需要拼装json  
//	        String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数  
//	        StringUtils resultJSON;
//	        getResponse().getWriter().println(jsonpCallback+"("+json.toString()+")");//返回jsonp格式数据  
//	        out.flush();  
//	        out.close(); 
//	        
//	        
//	        String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数  
//	        out.println(jsonpCallback+"("+resultJSON.toString(1,1)+")");//返回jsonp格式数据  
	        
			getResponse().getWriter().flush();
			getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @throws IOException
	 */
	public void writeJson(Object object) {
		writeJsonByFilter(object, null, null);
	}

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @param includesProperties
	 *            需要转换的属性
	 */
	public void writeJsonByIncludesProperties(Object object, String[] includesProperties) {
		writeJsonByFilter(object, includesProperties, null);
	}

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @param excludesProperties
	 *            不需要转换的属性
	 */
	public void writeJsonByExcludesProperties(Object object, String[] excludesProperties) {
		writeJsonByFilter(object, null, excludesProperties);
	}

	/**
	 * 获得request
	 * 
	 * @return
	 */
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	/**
	 * 获得response
	 * 
	 * @return
	 */
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

	/**
	 * 获得session
	 * 
	 * @return
	 */
	public HttpSession getSession() {
		return ServletActionContext.getRequest().getSession();
	}

	/**
	 * 获得一个对象
	 */
	public void getById() {
		if (!StringUtils.isBlank(id)) {
			writeJson(service.getById(id));
		} else {
			Json j = new Json();
			j.setMsg("主键不可为空！");
			writeJson(j);
		}
	}

	/**
	 * 查找一批对象
	 */
	public void find() {
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		writeJson(service.findByFilter(hqlFilter, page, rows));
	}

	/**
	 * 查找所有对象
	 */
	public void findAll() {
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		writeJson(service.findByFilter(hqlFilter));
	}

	/**
	 * 查找分页后的grid
	 */
	public void grid() {
		Grid grid = new Grid();
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		grid.setTotal(service.countByFilter(hqlFilter));
		grid.setRows(service.findByFilter(hqlFilter, page, rows));
		writeJson(grid);
	}

	/**
	 * 查找grid所有数据，不分页
	 */
	public void gridAll() {
		Grid grid = new Grid();
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		List<T> l = service.findByFilter(hqlFilter);
		grid.setTotal((long) l.size());
		grid.setRows(l);
		writeJson(grid);
	}

	/**
	 * 获得treeGrid，treeGrid由于提供了pid的扩展，所以不分页
	 */
	public void treeGrid() {
		HqlFilter hqlFilter = new HqlFilter(getRequest());
		writeJson(service.findByFilter(hqlFilter));
	}

	/**
	 * 保存一个对象
	 */
	public void save() {
		Json json = new Json();
		if (data != null) {
			service.save(data);
			json.setSuccess(true);
			json.setMsg("新建成功！");
		}
		writeJson(json);
	}

	/**
	 * 更新一个对象
	 */
	public void update() {
		Json json = new Json();
		String reflectId = null;
		try {
			if (data != null) {
				reflectId = (String) FieldUtils.readField(data, "id", true);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if (!StringUtils.isBlank(reflectId)) {
			T t = service.getById(reflectId);
			BeanUtils.copyNotNullProperties(data, t, new String[] { "createdatetime" });
			service.update(t);
			json.setSuccess(true);
			json.setMsg("更新成功！");
		}
		writeJson(json);
	}

	/**
	 * 删除一个对象
	 */
	public void delete() {
		Json json = new Json();
		if (!StringUtils.isBlank(id)) {
			T t = service.getById(id);
			service.delete(t);
			json.setSuccess(true);
			json.setMsg("删除成功！");
		}
		writeJson(json);
	}

}
