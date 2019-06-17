package main

import (
	"fmt"
	"github.com/go-redis/redis"
)

func main() {
	client := redis.NewClient(&redis.Options{
		Addr:     "127.0.0.1:6379",
		Password: "",
		DB:       0,
	})

	pong, err := client.Ping().Result()
	fmt.Println(pong, err)

	client.Set("key", "value", 0)
	value, err := client.Get("key").Result()
	fmt.Println(value, err)

	keys, err := client.Keys("*").Result()
	for e := range keys {
		fmt.Println(e)
	}
}