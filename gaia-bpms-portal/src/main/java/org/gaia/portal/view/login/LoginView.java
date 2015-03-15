package org.gaia.portal.view.login;

import javax.inject.Inject;
import javax.servlet.ServletException;

import org.gaia.cdi.properties.annotation.ButtonProperties;
import org.gaia.cdi.properties.annotation.PasswordFieldProperties;
import org.gaia.cdi.properties.annotation.TextFieldProperties;
import org.gaia.portal.cdi.NavigationEvent;
import org.gaia.portal.cdi.annotation.MVPView;

import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.access.JaasAccessControl;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@CDIView("login")
@MVPView
public class LoginView extends CustomComponent implements View, ClickListener {

	@Inject
	@TextFieldProperties(caption = "Username")
	private TextField userLoginField;

	@Inject
	@PasswordFieldProperties(caption = "Password")
	private PasswordField userPasswordField;

	@Inject
	@ButtonProperties(caption = "Login")
	private Button loginButton;

	@Inject
	private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

	@Override
	public void enter(ViewChangeEvent event) {

		loginButton.addClickListener(this);
		loginButton.setClickShortcut(KeyCode.ENTER);

		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		mainLayout.setSpacing(false);
		mainLayout.setMargin(false);
		
		VerticalLayout topLayout = new VerticalLayout();
		topLayout.setHeight("100px");
		topLayout.setWidth("100%");
		topLayout.setSpacing(false);
		topLayout.setMargin(false);
		topLayout.setStyleName("logintoppanel");

		Label appName = new Label("G A I A");
		appName.setStyleName("logingaia-label");
		appName.setSizeUndefined();
		topLayout.addComponent(appName);
		topLayout.setComponentAlignment(appName, Alignment.MIDDLE_CENTER);
		
		VerticalLayout middleLayout = new VerticalLayout();
		middleLayout.setSizeUndefined();
		middleLayout.setMargin(false);
		middleLayout.setSpacing(true);
		
		
		mainLayout.addComponent(topLayout);
		Label hr = new Label("<hr>", ContentMode.HTML);
		hr.setStyleName("logintoppanel");
		hr.setHeightUndefined();
		mainLayout.addComponent(hr);
		mainLayout.setExpandRatio(topLayout, 1.0f);
		

		FormLayout loginLayout = new FormLayout();
		loginLayout.setMargin(false);
		loginLayout.setSpacing(true);
		loginLayout.setWidth(null);
		loginLayout.setHeight(null);
		loginLayout.addComponent(userLoginField);
		loginLayout.addComponent(userPasswordField);

		middleLayout.addComponent(loginLayout);
		middleLayout.addComponent(loginButton);
		middleLayout.setComponentAlignment(loginButton, Alignment.MIDDLE_RIGHT);

		mainLayout.addComponent(middleLayout);

		mainLayout.setComponentAlignment(middleLayout, Alignment.MIDDLE_CENTER);

		userLoginField.focus();
		setCompositionRoot(mainLayout);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		String username = userLoginField.getValue();
		String password = userPasswordField.getValue();

		try {
			JaasAccessControl.login(username, password);
			JaasAccessControl.getCurrentRequest().getSession()
					.setAttribute("loggedIn", username);
			navigationEvent.fire(new NavigationEvent("workspace"));
		} catch (ServletException e) {
			Notification.show("Wrong password or user name!");
		}
	}
}
