package cn.evosoft.gap.bserviceImp.service;

import cn.evosoft.gap.bserviceProducer.service.HelloWorldService;

public class HelloWorldServiceImp implements HelloWorldService {

	public void Hello() {
        System.out.println("a message from service :Hello world");
	}

	public void startUp() {
       System.out.println("start HelloWorld Service");
	}

}
