package cn.evosoft.gap.blueprintDeployer;

public class HelloWorldServiceImp implements HelloWorldService {

	public void Hello() {
        System.out.println("a message from service :Hello world");
	}

	public void startUp() {
       System.out.println("start deployer HelloWorld Service");
	}

}
