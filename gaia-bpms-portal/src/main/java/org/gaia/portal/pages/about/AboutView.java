package org.gaia.portal.pages.about;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;

import org.activiti.engine.ProcessEngine;
import org.gaia.portal.cdi.activiti.TestBean;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.access.AccessControl;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;


@CDIView("about")
public class AboutView extends CustomComponent implements View {

	@Inject
	private AccessControl accessControl;
	
	@Inject
	private ProcessEngine processEngine;
	
	@Override
	public void enter(ViewChangeEvent event) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setCompositionRoot(layout); 
		
		Button button = new Button("Show login user");

		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("User " + accessControl.getPrincipalName()));
				layout.addComponent(new Label("User " + processEngine));
				setCompositionRoot(layout);
			}
		});
		
		layout.addComponent(button);
	}

}
