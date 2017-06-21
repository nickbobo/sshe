package sy.interceptor.base;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import sy.model.base.SessionInfo;
import sy.util.base.ConfigUtil;

/**
 * session拦截器
 * 
 * @author 孙宇
 * 
 */
@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
public class SessionInterceptor extends MethodFilterInterceptor {

	private static final Logger logger = Logger.getLogger(SessionInterceptor.class);

	
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		ServletActionContext.getRequest();
//		HttpServletRequest request = new HttpServletRequest.getServletContext();
//		String musictype = request.getParameter("musictype");

//		String questionoptiontital1 = ServletActionContext.getRequest().getParameter("rows");
		
		HttpServletRequest  request = ServletActionContext.getRequest();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Access-Control-Allow-Origin", "*");// 表明它允许"http://foo.org"发起跨域请求
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");// 表明它允许GET、PUT、DELETE的外域请求
		response.setHeader("Access-Control-Max-Age", "3600"); // 表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");// 表明它允许跨域请求包含content-type头
		//HttpServletRequest request = ServletActionContext.getRequest();  
		//ServletActionContext.getRequest(); 
		
		ArrayList requestList = new ArrayList();
		requestList.add(request.getParameter("id"));
		requestList.add(request.getParameter("rows"));
		requestList.add(request.getParameter("page"));
//		requestList.add(request.getParameter("jsonpCallback"));
		for (int i = 0; i < requestList.size(); i++) {
			System.out.println("nick:"+i+"、"+requestList.get(i));
			logger.info("nick:"+i+"、"+requestList.get(i));
		}
		
//		String requestList  [];
//		request[0] = 
		SessionInfo sessionInfo = (SessionInfo) ServletActionContext.getRequest().getSession().getAttribute(ConfigUtil.getSessionInfoName());
		ServletActionContext.getResponse().setHeader("Access-Control-Allow-Origin", "*");
//		System.out.println(request.toString());
		logger.info("进入session拦截器->1111访问路径为[" +sessionInfo+"],[" +ServletActionContext.getRequest().getServletPath() + "]");
		System.out.println("进入session拦截器->2222访问路径为[" +sessionInfo+"],[" + ServletActionContext.getRequest().getServletPath() + "]");
//		if (sessionInfo == null) {
//			
//			String errMsg = "您还没有登录或登录已超时，请重新登录，然后再刷新本功能！";
//			logger.info(errMsg);
//			ServletActionContext.getRequest().setAttribute("msg", errMsg);
//			return "noSession";
//		}
		return actionInvocation.invoke();
	}

}
