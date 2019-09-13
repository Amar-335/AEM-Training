package com.training.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.json.simple.JSONObject;
import org.osgi.service.component.annotations.Component;
@Component(service = Servlet.class,
property = {
        "sling.servlet.methods=" + "HttpConstants.METHOD_GET",
        "sling.servlet.paths=" + "/bin/formSubmitting",
        "sling.servlet.extensions=" + "sample",
}
		)

public class FormSubmiting extends SlingAllMethodsServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6551851204940693657L;
	@Override
	   protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			   throws IOException {
		String Name="Khushi";
		String LName="Amar";
		JSONObject obj= new JSONObject();
		obj.put("Name", Name);
		obj.put("LName", LName);
		String jsonData = obj.toJSONString();
		response.getWriter().write(jsonData);
        
	}
}
