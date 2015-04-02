package org.gaia.bpms.view.home;

import org.gaia.portal.cdi.annotation.MVPView;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import org.gaia.bpms.view.home.HomeView;

@CDIView("Home")
@MVPView
public class HomeViewImpl extends CustomComponent implements View, HomeView {

	@Override
	public void enter(ViewChangeEvent event) {

		final GridLayout mainLayout = new GridLayout(1, 2);
		final Button myWorkButton = new Button("My work");

		mainLayout.setSizeFull();
		mainLayout.addComponent(myWorkButton, 0, 1);
		mainLayout.setComponentAlignment(myWorkButton, Alignment.TOP_CENTER);

		setCompositionRoot(mainLayout);
	}
}