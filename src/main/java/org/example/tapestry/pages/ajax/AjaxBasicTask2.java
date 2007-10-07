package org.example.tapestry.pages.ajax;

import java.util.HashMap;

import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.util.TextStreamResponse;

public class AjaxBasicTask2 {
	
	private HashMap<String, String> users = new HashMap<String, String>();

	void pageLoaded() {
		System.out.println("AjaxTests PageLoaded");
		users.put("greg", "account 1");
		users.put("duke", "account 2");
	}	
	
	@Inject
	private ComponentResources _resources;
	
	/**
	 * Generates a URI to the server-side function for the XHR to use.
	 * 
	 * @return the link
	 */
	public String getTheLink() {
		Link l = _resources.createActionLink("myAction", false);
		return l.toURI();
	}

	/**
	 * This is a server-side method called via XHR that returns some text.
	 * 
	 * @return some text
	 */
	StreamResponse onMyAction(String id) {
		String message;
		if ((id != null) && users.containsKey(id.trim())) {
			message = "<message>valid</message>";
		} else {
			message = "<message>invalid</message>";
		}
		return new TextStreamResponse("type/xml", message);
	}
}
