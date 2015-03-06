package org.gaia.portal.pages.login;

import javax.inject.Inject;
import javax.servlet.ServletException;

import org.gaia.cdi.properties.annotation.ButtonProperties;
import org.gaia.cdi.properties.annotation.PasswordFieldProperties;
import org.gaia.cdi.properties.annotation.TextFieldProperties;
import org.gaia.portal.cdi.NavigationEvent;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.access.JaasAccessControl;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@CDIView("login")
public class LoginView extends CustomComponent implements View, ClickListener {

    @Inject
    @TextFieldProperties(caption ="Username")
	private TextField usernameField;
    
    @Inject
    @PasswordFieldProperties(caption = "Password")
    private PasswordField passwordField;
    
    @Inject
    @ButtonProperties(caption="Login")
    private Button loginButton;
    
    @Inject
    private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

    @Override
    public void enter(ViewChangeEvent event) {

        loginButton.addClickListener(this);
        loginButton.setClickShortcut(KeyCode.ENTER);
       
        VerticalLayout layout = new VerticalLayout();
        
        setCompositionRoot(layout);
        
        layout.setSizeFull();
        layout.setMargin(true);
        layout.setSpacing(true);
       
        Panel loginPanel = new Panel("Welcome in Gaia.");
        loginPanel.setWidth(null);
        layout.addComponent(loginPanel);
        FormLayout loginForm = new FormLayout();
        loginForm.setMargin(true);
        loginForm.setStyleName("loginForm");
        loginForm.addComponent(usernameField);
        loginForm.addComponent(passwordField);
        loginForm.addComponent(loginButton);
        
        loginPanel.setContent(loginForm);
        
        usernameField.focus();
        
        layout.setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        String username = usernameField.getValue();
        String password = passwordField.getValue();

        try {
			JaasAccessControl.login(username, password);
			JaasAccessControl.getCurrentRequest().getSession().setAttribute("loggedIn", username);
			navigationEvent.fire(new NavigationEvent("about"));
		} catch (ServletException e) {
			Notification.show("Wrong password or user name!");
		}   
    }
}
