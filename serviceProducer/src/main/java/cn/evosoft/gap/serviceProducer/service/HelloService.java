package cn.evosoft.gap.serviceProducer.service;

public class HelloService implements IHelloService {

	public String sayHello() {
        String output = "hello OSGI service";
		return output;
	}

}
