package sy.util.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 * 用于过滤需要拦截的JSP文件
 * 
 * @author 孙宇
 * 
 */
public class SessionFilter implements Filter {

	private static final Logger logger = Logger.getLogger(SessionFilter.class);

	private List<String> list = new ArrayList<String>();

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");// 表明它允许"http://foo.org"发起跨域请求
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");// 表明它允许GET、PUT、DELETE的外域请求
		response.setHeader("Access-Control-Max-Age", "3600"); // 表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");// 表明它允许跨域请求包含content-type头
		
		request.getMethod();// 获得客户端向服务器端传送数据的方法有GET、POST、PUT等类型
		request.getRequestURI();// 获得发出请求字符串的客户端地址
		request.getServletPath();// 获得客户端所请求的脚本文件的文件路径
		request.getServerName();// 获得服务器的名字
		request.getServerPort();// 获得服务器的端口号
		request.getRemoteAddr();// 获得客户端的IP地址
		request.getRemoteHost();// 获得客户端电脑的名字，若失败，则返回客户端电脑的IP地址
		request.getProtocol();
		
		String jsonpCallback = request.getParameter("jsonpCallback");
		System.out.println("jsonpCallback[999"+jsonpCallback+"]");
		logger.info("jsonpCallback["+jsonpCallback+"]");
//		System.out.println(request.getRequestURI()+
//							":-->"+request.getServerPort()+
//							":-->"+request.getServerName()+
//							":-->"+request.getRemoteAddr()+
//							":-->"+request.getRemoteHost()+
//							":-->"+request.getProtocol()+
//							":-->"+response.getBufferSize()+
//							":-->"+request.getMethod());
		String servletPath = request.getServletPath();
		for (String url : list) {
			if (servletPath.indexOf(url) > -1) {// 需要过滤
				logger.info("进入session过滤器->3333访问路径为[" + servletPath + "]");
				if (request.getSession().getAttribute("sessionInfo") == null) {// session不存在需要拦截
					request.setAttribute("msg", "您还没有登录或登录已超时，请重新登录，然后再刷新本功能！");
					request.getRequestDispatcher("/error/noSession.jsp").forward(request, response);
					return;
				}
				break;
			}
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// 初始化需要拦截的文件夹
		String include = filterConfig.getInitParameter("include");
		if (!StringUtils.isBlank(include)) {
			StringTokenizer st = new StringTokenizer(include, ",");
			list.clear();
			while (st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
		}

	}

	public void destroy() {
	}
}
