package main

import (
	"log"
	"github.com/streadway/amqp"
	"time"
)

func main() {
	connection, err := amqp.Dial("amqp://guest:guest@localhost:5672/")
	defer connection.Close()
	channel, err := connection.Channel()
	defer channel.Close()

	exchangeName := "p/s-queue"
	message := time.Now().String()
	channel.ExchangeDeclare(
		exchangeName,
		"fanout",
		true,
		false,
		false,
		false,
		nil, )
	for i := 0; i < 100; i++ {
		channel.Publish(
			exchangeName,
			"",
			false,
			false,
			amqp.Publishing{
				ContentType: "text/plain",
				Body:        []byte(message),
			})
		log.Printf("Sent message: %s", message)
	}
	if err != nil {
		log.Fatalf("Error message: %s", err)
	}
}
