package org.example.tapestry.pages.ui.portlets;

import org.apache.tapestry.Asset;
import org.apache.tapestry.annotations.Path;
import org.apache.tapestry.annotations.Persist;
import org.apache.tapestry.ioc.annotations.Inject;

public class JQueryBasic {
    @Inject
    @Path("context:assets/jquery-portlets/jquery.js")
    private Asset jquery;
    
    @Inject
    @Path("context:assets/jquery-portlets/interface.js")
    private Asset jqinterface;
    
    @Inject
    @Path("context:assets/jquery-portlets/config.js")
    private Asset jqconfig;
    
    @Inject
    @Path("context:assets/jquery-portlets/portlets.css")
    private Asset jqportletsCSS;

    @Inject
    @Path("context:assets/jquery-portlets/logo.gif")
    private Asset logo;

    public Asset getJquery() {
        return jquery;
    }

    public Asset getJqinterface() {
        return jqinterface;
    }
    
    public Asset getJqconfig() {
        return jqconfig;
    }

    public Asset getJqportletsCSS() {
        return jqportletsCSS;
    }

    public Asset getLogo() {
        return logo;
    }
    
    @Persist("flash")
    private String newsAppearance;

    public String getNewsAppearance() {
        return newsAppearance;
    }

    public void setNewsAppearance(String newsAppearance) {
        this.newsAppearance = newsAppearance;
    }
}
