package org.gaia.portal.cdi;

import java.io.Serializable;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import com.vaadin.server.VaadinSession;

@SessionScoped
public class LocaleMessages implements Serializable{

	private static final String BUNDLE_NAME = "locales.messages";

	private ResourceBundle resourceBundle;

	@PostConstruct
	protected void Init() {
		resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, VaadinSession.getCurrent().getLocale());
	}

	public String getString(String key) {
		try {
			return resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
