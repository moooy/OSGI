package cn.evosoft.gap.serviceImp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import cn.evosoft.gap.serviceImp.service.HelloService;
import cn.evosoft.gap.serviceProducer.service.IHelloService;


public class Activator implements BundleActivator {
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		context.registerService(IHelloService.class.getName(), new HelloService(), null);
		System.out.println("the service is registed");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
