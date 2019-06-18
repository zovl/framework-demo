package main

import (
	"github.com/streadway/amqp"
	"log"
)

func main() {
	connection, err := amqp.Dial("amqp://guest:guest@localhost:5672/")
	defer connection.Close()
	channel, err := connection.Channel()
	defer channel.Close()

	exchangeName := "p/s-queue"
	channel.ExchangeDeclare(
		exchangeName,
		"fanout",
		true,
		false,
		false,
		false,
		nil)
	queue, err := channel.QueueDeclare(
		"",
		false,
		false,
		true,
		false,
		nil)
	err = channel.QueueBind(
		queue.Name,
		"",
		exchangeName,
		false,
		nil)
	msgs, err := channel.Consume(
		queue.Name,
		"",
		true,
		false,
		false,
		false,
		nil)

	forever := make(chan bool)
	go func() {
		for d := range msgs {
			message := d.Body
			log.Printf("Received message: %s", message)
		}
	}()
	<-forever
	if err != nil {
		log.Fatalf("Error message: %s", err)
	}
}
