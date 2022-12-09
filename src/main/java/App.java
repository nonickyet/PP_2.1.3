import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(beanHello1.getMessage());
        HelloWorld beanHello2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat beanCat1 = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanHello1 == beanHello2);
        System.out.println(beanCat1 == beanCat2);
    }
}