package a.b.c;

import com.rabbitmq.client.*;

import java.io.IOException;

public class SecondApplication {

    public static void main(String[] args) throws Exception {

        Object object = new Object();

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        final String exchangeName = "p/s-queue";
        channel.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, exchangeName, "");

        channel.basicConsume(queueName,
                new DeliverCallback() {
                    public void handle(String consumerTag, Delivery message) throws IOException {
                        String string = new String(message.getBody());
                        System.out.println("Received message: " + string);
                    }
                }, new CancelCallback() {
                    public void handle(String consumerTag) throws IOException {
                        System.out.println("Consumer tag: " + consumerTag);
                    }
                });

        synchronized (object) {
            object.wait();
        }

        channel.close();
        connection.close();
    }
}
