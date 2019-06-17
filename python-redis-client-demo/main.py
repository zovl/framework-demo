import redis

hostname = '127.0.0.1'
port = 6379
r = redis.Redis(hostname, port)

r.set('key', 'value')
value = r.get('key')

keys = r.keys('*')