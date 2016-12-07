package com.ttn.aem.osgispringhelloworld.activators;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.aem.osgispringhelloworld.services.HelloWorldService;
import com.ttn.aem.osgispringhelloworld.services.impls.HelloWorldServiceImpl;

/**
 * Hello world!
 *
 */
public class AppActivator implements BundleActivator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppActivator.class);

	private ServiceRegistration registration;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		LOGGER.info("Starting bundle");
		registration = bundleContext.registerService(HelloWorldService.class.getName(), new HelloWorldServiceImpl(),
				null);
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		registration.unregister();
		LOGGER.info("Stopped bundle");
	}

}
