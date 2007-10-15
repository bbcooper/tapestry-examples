package org.example.tapestry.pages.ui.dialog;

import org.apache.tapestry.Asset;
import org.apache.tapestry.ioc.annotations.Inject;
import org.apache.tapestry.annotations.Path;

public class ThickBoxDialog {
	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	private Asset _jquery;
	
	@Inject
	@Path("context:assets/thickbox/thickbox.js")
	private Asset _thickbox;
	
	@Inject
	@Path("context:assets/thickbox/thickbox.css")
	private Asset _thickboxCSS;

	public Asset getJquery() {
		return _jquery;
	}

	public void setJquery(Asset _jquery) {
		this._jquery = _jquery;
	}

	public Asset getThickbox() {
		return _thickbox;
	}

	public void setThickbox(Asset _thickbox) {
		this._thickbox = _thickbox;
	}
	
	public Asset getThickboxCSS() {
		return _thickboxCSS;
	}

	public void setThickboxCSS(Asset _thickboxCSS) {
		this._thickboxCSS = _thickboxCSS;
	}
}
