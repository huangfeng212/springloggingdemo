package example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {

  public static void main(String[] args) {

    ConfigurableApplicationContext context =
        new AnnotationConfigApplicationContext(Main.class);

    MyBean bean = context.getBean(MyBean.class);
    bean.doSomething();
  }

  @Bean
  public MyBean myBean() {
    return new MyBean();
  }

}
