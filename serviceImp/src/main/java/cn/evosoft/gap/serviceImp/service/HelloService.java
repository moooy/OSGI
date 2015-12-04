package cn.evosoft.gap.serviceImp.service;

import cn.evosoft.gap.serviceProducer.service.IHelloService;

public class HelloService implements IHelloService {

	public String sayHello() {
        String output = "hello OSGI service";
		return output;
	}

}
