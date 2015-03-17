package org.gaia.portal.view.login;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;

import org.gaia.portal.cdi.NavigationEvent;

import com.vaadin.cdi.access.AccessControl;
import com.vaadin.cdi.access.JaasAccessControl;
import com.vaadin.ui.Notification;

@SessionScoped
public class LoginPresenter implements Serializable {

	@Inject
	private AccessControl accessControl;

	private LoginView view;

	public void setView(LoginView view) {
		this.view = view;
	}

	public void signIn() {
		try {
			JaasAccessControl.login(view.getUsername(), view.getPassword());
			JaasAccessControl.getCurrentRequest().getSession()
					.setAttribute("loggedIn", view.getUsername());
			view.signedInSucceed();
		} catch (ServletException e) {
			view.signInFailed();
		}
	}

}
