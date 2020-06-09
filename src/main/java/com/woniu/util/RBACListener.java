package com.woniu.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class RBACListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
	     String contextPath = servletContext.getContextPath();
	     servletContext.setAttribute("App", contextPath);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	 	// TODO Auto-generated method stub
			ServletContextListener.super.contextDestroyed(sce);
	}
	

}
