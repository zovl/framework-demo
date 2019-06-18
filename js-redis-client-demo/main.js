var redis = require("redis"),
    client = redis.createClient();

client.set("key", "value");
client.get("key", function(err, reply) {
    var value = reply
    console.log(value)
});

client.quit();