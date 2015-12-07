package cn.evosoft.gap.bserviceConsumer;

import cn.evosoft.gap.bserviceProducer.service.HelloWorldService;

public class HelloWorldClient {
    HelloWorldService helloWorldService = null;
    public void startUp(){
    	System.out.println("client HelloWorld:About to excute a test ");
    	helloWorldService.Hello();
    }
    
    public HelloWorldService getHelloWorldService(){
    	return helloWorldService;
    }
    
    public void setHelloWorldService(HelloWorldService helloWorldService){
    	this.helloWorldService = helloWorldService;
    }
}
