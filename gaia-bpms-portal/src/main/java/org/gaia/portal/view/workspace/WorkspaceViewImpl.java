package org.gaia.portal.view.workspace;

import javax.inject.Inject;

import org.activiti.engine.ProcessEngine;
import org.gaia.portal.Messages;
import org.gaia.portal.cdi.LocaleMessages;
import org.gaia.portal.cdi.NavigationEvent;
import org.gaia.portal.cdi.annotation.MVPView;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.access.AccessControl;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@MVPView
@CDIView("workspace")
public class WorkspaceViewImpl extends CustomComponent implements WorkspaceView, View {

	@Inject
	private LocaleMessages locales;

	@Inject
	private AccessControl accessControl;

	@Inject
	private ProcessEngine processEngine;

	@Inject
	private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

	@Override
	public void enter(ViewChangeEvent event) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setCompositionRoot(layout);

		Button button = new Button("Show task list");

		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigationEvent.fire(new NavigationEvent("Task"));
			}
		});

		layout.addComponent(new Label("GAIA Workspace"));
		layout.addComponent(new Label(Messages.getString("About.HELLO_STRING")));
		layout.addComponent(new Label(locales.getString("About.HELLO_STRING")));
		layout.addComponent(button);
	}
}