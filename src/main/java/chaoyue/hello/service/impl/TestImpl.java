package chaoyue.hello.service.impl;

import chaoyue.hello.dao.People;
import chaoyue.hello.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements ITest {
  @Autowired
  private People people;

  @Override
  public void f() {
    System.out.println("hello!!!! " + people.getName() + " age is " + people.getAge());
  }
}
