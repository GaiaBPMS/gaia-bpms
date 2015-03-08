package org.gaia.portal.cdi;

import javax.inject.Inject;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;
import com.vaadin.cdi.access.JaasAccessControl;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@Theme("gaiatheme")
@CDIUI("")
@Push
@SuppressWarnings("serial")
public class BootVaadinUI extends UI {

    @Inject
    private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

    @Override
    protected void init(VaadinRequest request) {

		if (JaasAccessControl.getCurrentRequest().getSession().getAttribute("loggedIn") == null) {
	        navigationEvent.fire(new NavigationEvent("login"));
		} else {
			navigationEvent.fire(new NavigationEvent("login"));
		}
    }

}
