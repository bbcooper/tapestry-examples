package org.example.tapestry.pages.ajax;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.services.RequestGlobals;

public class AjaxBasicTask2 {
	private HttpServletRequest request;
	private HttpServletResponse response;

	@Inject
	private RequestGlobals _requestGlobals;

	private HashMap<String, String> users = new HashMap<String, String>();

	void pageLoaded() {
		System.out.println("AjaxTests PageLoaded");
		users.put("greg", "account data");
		users.put("duke", "account data");
	}

	void pageAtached() {
		System.out.println("AjaxBasic PageAtached");
	}

	void pageDetached() {
		System.out.println("AjaxBasic PageAtached");
		//users.clear();
	}

	void onActivate(String id) throws IOException {
		request = _requestGlobals.getHTTPServletRequest();
		response = _requestGlobals.getHTTPServletResponse();
		System.out.println("AjaxBasic onActivate");
		System.out.println("id: " + id);
		if ((id != null) && users.containsKey(id.trim())) {
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write("<message>valid</message>");
		} else {
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write("<message>invalid</message>");
		}
	}

	void onPassivate() {
		System.out.println("AjaxBasic onPassivate");
	}
}
