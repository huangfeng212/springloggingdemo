package example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
  @Bean
  public MyBean myBean() {
    return new MyBean();
  }
  public static void main(String[] args) {
    System.setProperty("java.util.logging.config.file", Main.class.getClassLoader()
        .getResource("jul.properties")
        .getFile());

    ConfigurableApplicationContext context =
        new AnnotationConfigApplicationContext(Main.class);

    MyBean bean = context.getBean(MyBean.class);
    bean.doSomething();
  }

}
