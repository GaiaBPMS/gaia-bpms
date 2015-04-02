package org.gaia.bpms.view.task;

import javax.inject.Inject;

import org.gaia.bpms.view.task.list.TaskListTable;
import org.gaia.cdi.properties.annotation.ButtonProperties;
import org.gaia.cdi.properties.annotation.HorizontalLayoutProperties;
import org.gaia.cdi.properties.annotation.LabelProperties;
import org.gaia.cdi.properties.annotation.VerticalLayoutProperties;
import org.gaia.portal.cdi.annotation.MVPView;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@CDIView("Task")
@MVPView
public class TaskViewImpl extends CustomComponent implements View, TaskView {

	@Inject
	@VerticalLayoutProperties(sizeFull = true)
	private VerticalLayout rootLayout;

	@Inject
	@HorizontalLayoutProperties(width = "100%", height = "35px")
	private HorizontalLayout titleLayout;

	@Inject
	@HorizontalLayoutProperties(width = "100%")
	private HorizontalLayout buttonsLayout;

	@Inject
	@VerticalLayoutProperties(sizeFull = true)
	private VerticalLayout taskListLayout;

	@Inject
	@ButtonProperties(caption = "Claim task")
	private Button claim;

	@Inject
	@ButtonProperties(caption = "Start task")
	private Button start;

	@Inject
	@LabelProperties(caption = "Tasks")
	private Label taskTitle;

	private final TaskListTable taskList = new TaskListTable();

	@Override
	public void enter(ViewChangeEvent event) {

		super.setSizeFull();

		// title layout
		this.titleLayout.addStyleName("redBackground");
		this.titleLayout.addComponent(this.taskTitle);
		this.titleLayout.setComponentAlignment(this.taskTitle, Alignment.MIDDLE_RIGHT);

		this.taskListLayout.addStyleName("yellowBackground");
		this.taskListLayout.addComponent(this.taskList);

		// buttons layout
		this.buttonsLayout.addStyleName("blueBackground");
		this.buttonsLayout.addComponent(this.claim);
		this.buttonsLayout.addComponent(this.start);
		this.buttonsLayout.setComponentAlignment(this.claim, Alignment.MIDDLE_RIGHT);
		this.buttonsLayout.setComponentAlignment(this.start, Alignment.MIDDLE_RIGHT);
		this.buttonsLayout.setExpandRatio(this.claim, 1);
		this.buttonsLayout.setExpandRatio(this.start, 0);

		// root layout
		this.rootLayout.addComponent(this.titleLayout);
		this.rootLayout.addComponent(this.buttonsLayout);
		this.rootLayout.addComponent(this.taskListLayout);
		this.rootLayout.setExpandRatio(this.titleLayout, 0);
		this.rootLayout.setExpandRatio(this.buttonsLayout, 0);
		this.rootLayout.setExpandRatio(this.taskListLayout, 1);

		super.setCompositionRoot(this.rootLayout);
	}
}