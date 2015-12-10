package cn.evosoft.gap.jmsCustomer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsCustomer {
	final String bindAddress = "tcp://127.0.0.1:55551";
	final String queueName = "MQ";
	public void startUp(){
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(bindAddress);
		try {
			Connection  con = connectionFactory.createConnection();
			con.start();
			Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue(queueName);
			MessageConsumer consumer = session.createConsumer(queue);
			System.out.println("-----------customer beagin to recieve message-------");
			consumer.setMessageListener((message) -> {  
	            TextMessage tm = (TextMessage)message;  
	            try {  
	                System.out.println("收到消息：" + tm.getText());  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        });
			System.out.println("-----customer stop recieve message--------");
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
