package org.gaia.portal.cdi;

import java.util.logging.Logger;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class NavigationLogDecorator implements NavigationService {

	private static final long serialVersionUID = 1L;

	@Inject
    @Delegate
    @Any
    NavigationService delegate;

    @Override
    public void onNavigationEvent(NavigationEvent event) {
        getLogger().info("navigated to " + event.getNavigateTo());
        delegate.onNavigationEvent(event);
    }

    private Logger getLogger() {
        return Logger.getLogger(this.getClass().getSimpleName());
    }

}
