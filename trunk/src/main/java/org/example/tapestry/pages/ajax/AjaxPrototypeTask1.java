package org.example.tapestry.pages.ajax;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.ioc.annotations.Inject;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.util.TextStreamResponse;

public class AjaxPrototypeTask1 {
	@Inject
	private ComponentResources _resources;

	@Inject
	@Path("${tapestry.scriptaculous}/prototype.js")
	private Asset _prototype;

//	@Inject
//	@Path("${tapestry.scriptaculous}/scriptaculous.js")
//	private Asset _scriptaculous;

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
	 * @return the prototype
	 */
	public Asset getPrototype() {
		return _prototype;
	}

	/**
	 * @param prototype
	 *            the prototype to set
	 */
	public void setPrototype(Asset prototype) {
		_prototype = prototype;
	}

	/**
	 * @return the scriptaculous
	 */
//	public Asset getScriptaculous() {
//		return _scriptaculous;
//	}

	/**
	 * @param scriptaculous
	 *            the scriptaculous to set
	 */
//	public void setScriptaculous(Asset scriptaculous) {
//		_scriptaculous = scriptaculous;
//	}
}
