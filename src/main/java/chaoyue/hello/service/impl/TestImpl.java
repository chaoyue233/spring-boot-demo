package chaoyue.hello.service.impl;

import chaoyue.hello.dao.People;
import chaoyue.hello.dao.Region;
import chaoyue.hello.mapper.RegionMapper;
import chaoyue.hello.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImpl implements ITest {
  @Autowired
  private People people;
  @Autowired
  private RegionMapper regionMapper;

  @Override
  public void f() {
    System.out.println("hello!!!! " + people.getName() + " age is " + people.getAge());
  }

  @Override
  public List<Region> getAllRegion() {
    return regionMapper.selectByModel(null);
  }


}
