package cn.evosoft.gap.bserviceConsumer;

import cn.evosoft.gap.bserviceProducer.service.HelloWorldService;

public class HelloWorldClient {
    HelloWorldService helloworldService = null;
    public void startUp(){
    	System.out.println("client HelloWorld:About to excute a test ");
    	helloworldService.Hello();
    }
    
    public HelloWorldService getHelloWorldService(){
    	return helloworldService;
    }
    
    public void setHelloWorldservice(HelloWorldService helloWorldService){
    	this.helloworldService = helloWorldService;
    }
}
