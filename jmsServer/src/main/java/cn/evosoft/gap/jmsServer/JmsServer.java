package cn.evosoft.gap.jmsServer;

import org.apache.activemq.broker.BrokerService;

public class JmsServer {
	
	final String bindAddress = "tcp://127.0.0.1:55551";
    public void startUp(){
    	System.out.println("JmsServer begin to create");
    	BrokerService brokerServer = new BrokerService();
    	try {
			brokerServer.addConnector(bindAddress);
			brokerServer.setUseJmx(false);
			brokerServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("JmsServer is starting");
    }
}
