package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.annotations.Component;
import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.util.TextStreamResponse;
import org.example.tapestry.components.ui.dialog.WizardStep1;

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

//	@Component
//	private WizardStep1 wizardStep1;
	
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
	    String htmlFragment = "<p>paragraph <b>bold</b></p>";
	    return new TextStreamResponse("text/html", htmlFragment);
	    
//	    wizardStep1.setMessage("hello");
//	    return (StreamResponse) wizardStep1;
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
