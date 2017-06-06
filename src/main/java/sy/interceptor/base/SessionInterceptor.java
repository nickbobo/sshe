package sy.interceptor.base;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

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
//		ServletActionContext.getRequest();
//		HttpServletRequest request = new HttpServletRequest.getServletContext();
//		String musictype = request.getParameter("musictype");

//		String questionoptiontital1 = ServletActionContext.getRequest().getParameter("rows");
		
		HttpServletRequest  request = ServletActionContext.getRequest();
		ArrayList requestList = new ArrayList();
		requestList.add(request.getParameter("rows"));
		requestList.add(request.getParameter("page"));
		for (int i = 0; i < requestList.size(); i++) {
			logger.info("nick:"+i+"、"+requestList.get(i));
		}
//		String requestList  [];
		
//		request[0] = 
		SessionInfo sessionInfo = (SessionInfo) ServletActionContext.getRequest().getSession().getAttribute(ConfigUtil.getSessionInfoName());
		ServletActionContext.getResponse().setHeader("Access-Control-Allow-Origin", "*");
//		System.out.println(request.toString());
		logger.info("进入session拦截器->访问路径为[" +sessionInfo+"],[" +ServletActionContext.getRequest().getServletPath() + "]");
		System.out.println("进入session拦截器->访问路径为[" +sessionInfo+"],[" + ServletActionContext.getRequest().getServletPath() + "]");
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
