package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ioc.annotations.Inject;
import org.apache.tapestry.annotations.Path;

public class JQModal {

	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	private Asset _jquery;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.js")
	private Asset jqmodal;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.css")
	private Asset jqmodalCSS;


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
