package chaoyue.hello;

public class Greeting {
  private long id = 2L;
  private String content = "chaoyue";

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
