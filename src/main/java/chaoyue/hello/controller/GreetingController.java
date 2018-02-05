package chaoyue.hello.controller;

import java.util.concurrent.atomic.AtomicLong;

import chaoyue.hello.service.ITest;
import chaoyue.hello.dao.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @Autowired
  private ITest test;

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    test.f();
    return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
  }
}
