package com.springdata.reactive.redis.demo.redis.queue;

public interface MessagePublisher {

  void publish(final String message);
}
