package org.example.tapestry.pages.ui.dialog;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.tapestry.Asset;
import org.apache.tapestry.ComponentResources;
import org.apache.tapestry.Link;
import org.apache.tapestry.StreamResponse;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.ioc.annotations.Inject;
import org.apache.tapestry.services.Context;
import org.apache.tapestry.services.Request;
import org.apache.tapestry.util.TextStreamResponse;


public class JQModalWizard {
	
	@Inject
	private Context context;
	
	@Inject
	private Request request;
	
	@Inject
	private ComponentResources resources;
	
	@Inject
	@Path("context:assets/jquery-1.2.1.js")
	//@Path("context:assets/jquery-1.1.2.js")
	private Asset _jquery;

	@Inject
	@Path("context:assets/interface.js")
	private Asset jsinterface;
	
	@Inject
	@Path("context:assets/jquery.suggest.js")
	private Asset jqsuggest;
	
	@Inject
	@Path("context:assets/jquery.dimensions.js")
	private Asset jqdimensions;

	@Inject
	@Path("context:assets/jqModal/jquery.suggest.css")
	private Asset jqsuggestCSS;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.js")
	private Asset jqmodal;
	
	@Inject
	@Path("context:assets/jqModal/jqModal.css")
	private Asset jqmodalCSS;
	
	private List<String> allCities;
	private List<String> cities;

	public Asset getJquery() {
		return _jquery;
	}
	
	public Asset getJsinterface() {
		return jsinterface;
	}
	
	public Asset getJqmodal() {
		return jqmodal;
	}

	public Asset getJqmodalCSS() {
		return jqmodalCSS;
	}

	public Asset getJqsuggest() {
		return jqsuggest;
	}

	public Asset getJqdimensions() {
		return jqdimensions;
	}

	public Asset getJqsuggestCSS() {
		return jqsuggestCSS;
	}

	public String getTheLink() {
		Link l = resources.createActionLink("myAction", false);
		return l.toURI();
	}
	
	void pageLoaded() {
		allCities = new ArrayList<String>();
		File file;
		try {
			file = new File(context.getResource("/cities.txt").toURI());
			allCities = FileUtils.readLines(file, "UTF-8");
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void pageAttached() {
		cities = new ArrayList<String>();
	}

	/**
	 * Gets called by the browser.
	 * @return list of cities
	 */
	StreamResponse onMyAction() {
		System.out.println(request.getParameter("q"));
		
		for(String city : allCities) {
			String value = request.getParameter("q");
			if (city.toLowerCase().startsWith(value)) {
				cities.add(city);
			}
		}
		
		String listOfCities = "";
		
		for (String city : cities) {
			listOfCities += city + "\n";
		}
		return new TextStreamResponse("type/text", listOfCities);
	}
}
