package cn.evosoft.gap.serviceConsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import cn.evosoft.gap.serviceProducer.service.IHelloService;

public class Activator implements BundleActivator {
	private static BundleContext context;
	private IHelloService service;
	
	static BundleContext getContext() {
		return context;
	}
	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		ServiceReference reference = context.getServiceReference(IHelloService.class.getName());
		service = (IHelloService) context.getService(reference);
		System.out.println(service.sayHello());
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
