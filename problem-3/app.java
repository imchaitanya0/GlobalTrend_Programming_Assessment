import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        SampleService sampleService = context.getBean(SampleService.class);
        sampleService.doSomething();
        sampleService.doSomethingElse();
    }
}