package org.gaia.portal.cdi.activiti;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import org.activiti.engine.ProcessEngine;


@Startup
@Singleton
public class TestBean {

	//private static Logger log = LoggerFactory.getLogger(TestBean.class.getName());

	@Inject
	private ProcessEngine processEngine;

	@PostConstruct
	protected void init() {
		System.out.println("Process engine '" + processEngine.getName()
				+ "' is up and running!");
	}

}
