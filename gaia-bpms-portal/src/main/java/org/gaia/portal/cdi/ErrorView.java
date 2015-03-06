package org.gaia.portal.cdi;

import javax.inject.Inject;

import com.vaadin.cdi.access.AccessControl;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;


public class ErrorView extends CustomComponent implements View {

	private static final long serialVersionUID = 1L;

	@Inject
    private AccessControl accessControl;

    @Inject
    private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

    @Override
    public void enter(ViewChangeEvent event) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        layout.setSpacing(true);

        layout.addComponent(new Label(
                "Unfortunately, the page you've requested does not exists."));
        if (accessControl.isUserSignedIn()) {
            layout.addComponent(createTaskListButton());
        } else {
            layout.addComponent(createLoginButton());
        }
        setCompositionRoot(layout);
    }

    private Button createLoginButton() {
        Button button = new Button("To login page");
        button.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigationEvent.fire(new NavigationEvent("login"));
            }
        });
        return button;
    }

    private Button createTaskListButton() {
        Button button = new Button("Back to the main page");
        button.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigationEvent.fire(new NavigationEvent("task-list"));
            }
        });
        return button;
    }
}
