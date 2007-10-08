package org.example.tapestry.pages.ajax;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.util.TextStreamResponse;

public class AjaxJQueryTask1 {
	@Inject
	private ComponentResources _resources;

	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	private Asset _jquery;

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
	StreamResponse onMyAction() {
		return new TextStreamResponse("type/text",
				"Five bucks below the belt.  That's how I roll.");
	}

	/**
	 * @return the jquery
	 */
	public Asset getJquery() {
		return _jquery;
	}

	/**
	 * @param jquery
	 *            the jquery to set
	 */
	public void setJquery(Asset jquery) {
		_jquery = jquery;
	}

}
