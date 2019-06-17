package a.b.c;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.Date;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        // factory.setUsername(username);
        // factory.setPassword(password);
        // factory.setVirtualHost(virtualHost);
        // factory.setHost(hostName);
        // factory.setPort(port);
        // or
        // factory.setUri("amqp://username:password@hostName:port/virtualHost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        String exchangeName = "p/s-queue";
        byte[] message = String.valueOf(new Date().getTime()).getBytes();
        channel.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT);
        for (int i = 0; i < 100; i++) {
            channel.basicPublish(exchangeName, "", null, message);
            System.out.println("Sent message: " + new String(message));
        }

        channel.close();
        connection.close();
    }
}
