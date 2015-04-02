package org.gaia.bpms.view.task.list;

import java.sql.Date;

import com.vaadin.ui.Table;

public class TaskListTable extends Table {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TaskListTable() {
		super.setSizeFull();
		super.addContainerProperty("Id", Integer.class, null);
		super.addContainerProperty("Name", String.class, null);
		super.addContainerProperty("Actual owner", String.class, null);
		super.addContainerProperty("Date created", Date.class, null);
	}
}
