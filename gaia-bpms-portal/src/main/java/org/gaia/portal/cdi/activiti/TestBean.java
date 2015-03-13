package org.gaia.portal.cdi.activiti;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import org.activiti.engine.ProcessEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Startup
@Singleton
public class TestBean {

	private static Logger logger = LoggerFactory.getLogger(TestBean.class.getName());

	@Inject
	private ProcessEngine processEngine;

	@PostConstruct
	public void init() {
		logger.info("----------------------  Process engine '" + processEngine.getName()
				+ "' is up and running!");
	}

}
