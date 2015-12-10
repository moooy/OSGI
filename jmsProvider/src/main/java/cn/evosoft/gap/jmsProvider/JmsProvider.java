package cn.evosoft.gap.jmsProvider;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsProvider {
	
	final String bindAddress = "tcp://127.0.0.1:55551";
	final String queueName = "MQ";
     public void startUp(){
    	  ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(bindAddress);
    	  try {
			Connection con = connectionFactory.createConnection();
			con.start();
			Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue(queueName);
			MessageProducer producer = session.createProducer(queue);
			TextMessage message = null;
			System.out.println("message begin to send");
			for (int i = 0; i < 5; i++) {
				message = session.createTextMessage("this is a meassge"+i);
				producer.send(message);
			}
			System.out.println("message sended");
			session.close();
			con.close();
			System.out.println("connection is close");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
     }
}
