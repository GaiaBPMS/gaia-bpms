package org.gaia.portal.view.workspace;

import javax.inject.Inject;

import org.activiti.engine.ProcessEngine;
import org.gaia.portal.cdi.annotation.MVPView;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.access.AccessControl;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;


@MVPView
@CDIView("workspace")
public class WorkspaceViewImpl extends CustomComponent implements WorkspaceView, View {

	@Inject
	private AccessControl accessControl;
	
	@Inject
	private ProcessEngine processEngine;

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}