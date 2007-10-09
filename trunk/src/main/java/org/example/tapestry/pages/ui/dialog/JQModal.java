package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.annotations.Inject;
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

	public void setJquery(Asset jquery) {
		_jquery = jquery;
	}

	public Asset getJqmodal() {
		return jqmodal;
	}

	public void setJqmodal(Asset jqmodal) {
		this.jqmodal = jqmodal;
	}

	public Asset getJqmodalCSS() {
		return jqmodalCSS;
	}

	public void setJqmodalCSS(Asset jqmodalCSS) {
		this.jqmodalCSS = jqmodalCSS;
	}
	
	
}
