package org.example.tapestry.pages;

import java.util.Date;

import org.apache.tapestry.annotations.Inject;
import org.apache.tapestry.services.Cookies;

/**
 * Start page of application cell.
 */
public class Start
{
	public Date getCurrentTime() 
	{ 
		return new Date(); 
	}
	
//	@Inject
//	private Cookies cookies;
//	
//	void pageAttached() {
//		String id = cookies.readCookieValue("cellId"); 
//		if (id == null) {
//			System.out.println("prvič na tej strani");
//			cookies.writeCookieValue("cellId", "xxxxxxxx");
//			System.out.println("Cookie written.");
//		} else {
//			System.out.println("id: " + id);
//		}				
//	}
	
	void pageLoaded() {
		System.out.println("Start PageLoaded");
	}
	
	void pageAtached() {
		System.out.println("Start PageAtached");
	}
	
	void pageDetached() {
		System.out.println("Start PageAtached");
	}
	
	void onActivate() {
		System.out.println("Start onActivate");
	}

	void onPassivate() {
		System.out.println("Start onPassivate");
	}	
}