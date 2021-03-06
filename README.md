Spring Data Redis
===================



## <i class="icon-folder-open"></i> Install Redis

Just follow the official tutorial [Redis Quickstart](https://redis.io/topics/quickstart),
Take MAC as example, follow these simple steps: 


```
wget http://download.redis.io/redis-stable.tar.gz
tar xvzf redis-stable.tar.gz
cd redis-stable
make

make test
sudo make install
```


The simplest way to start the Redis server is just executing the redis-server binary without any argument


![enter image description here](https://github.com/VickyFengYu/spring-data-redis/blob/master/image/install-redis.jpg?raw=true)


### Build the Project

```
mvn clean install
```

### Run Tests


```
mvn test
```

For test purpose, can just use embedded-redis, instead of installing redis.

```
testCompile group: 'it.ozimov', name: 'embedded-redis', version: '0.7.2'

<dependency>
    <groupId>it.ozimov</groupId>
    <artifactId>embedded-redis</artifactId>
    <version>0.7.2</version>
    <scope>test</scope>
</dependency>

```


