package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.ioc.annotations.Inject;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.util.TextStreamResponse;

public class ThickBoxDialogOnLoad {
	@Inject
	private ComponentResources _resources;
	
	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	private Asset _jquery;
	
	@Inject
	@Path("context:assets/thickbox/thickbox.js")
	private Asset _thickbox;
	
	@Inject
	@Path("context:assets/thickbox/thickbox.css")
	private Asset _thickboxCSS;

	/**
	 * Generates a URI to the server-side function for the XHR to use.
	 * 
	 * @return the link
	 */
	public String getTheLink() {
		//Link l = _resources.createActionLink("myAction", false);
		Link l = _resources.createPageLink("ui/dialog/Step1", false);
		return l.toURI();
	}

	/**
	 * This is a server-side method called via XHR that returns some text.
	 * 
	 * @return some text
	 */
	StreamResponse onMyAction() {
		return new TextStreamResponse("text/html",
				"<p>paragraph <b>bold</b></p>");
	}
	public Asset getJquery() {
		return _jquery;
	}

	public Asset getThickbox() {
		return _thickbox;
	}

	public Asset getThickboxCSS() {
		return _thickboxCSS;
	}
}