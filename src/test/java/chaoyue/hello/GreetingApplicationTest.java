package chaoyue.hello;

import chaoyue.hello.controller.GreetingController;
import chaoyue.hello.dao.Region;
import chaoyue.hello.service.ITest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.alibaba.fastjson.JSON;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GreetingApplication.class)
//@ContextConfiguration(locations = {"classpath:/applicationBACK.properties"})
@WebAppConfiguration
public class GreetingApplicationTest {
  private MockMvc mockMvc;
  @Autowired
  private ITest iTest;

  @Before
  public void setUp() {
    mockMvc = MockMvcBuilders.standaloneSetup(new GreetingController()).build();
  }

  @Test
  public void greetingTest() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/greeting").accept(MediaType.APPLICATION_JSON));
  }

  @Test
  public void selfTest() {
    iTest.f();
  }

  @Test
  public void getAllRegionTest() {
    List<Region> result = iTest.getAllRegion();
    System.out.println(JSON.toJSONString(result));
  }
}
