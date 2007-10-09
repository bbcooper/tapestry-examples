package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.util.TextStreamResponse;

public class JQModalAjax {
	@Inject
	private ComponentResources _resources;

	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	private Asset _jquery;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.js")
	private Asset jqmodal;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.css")
	private Asset jqmodalCSS;

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
		return new TextStreamResponse("text/html;charset=UTF-8",
				"<p>paragraph <b>bold</b></p>");
	}

	public Asset getJquery() {
		return _jquery;
	}

	public Asset getJqmodal() {
		return jqmodal;
	}

	public Asset getJqmodalCSS() {
		return jqmodalCSS;
	}
	
	
}
