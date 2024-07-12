import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @LogExecutionTime
    public void doSomething() throws InterruptedException {
        Thread.sleep(1000); // Simulate some work
    }

    public void doSomethingElse() throws InterruptedException {
        Thread.sleep(500); // This method is not annotated
    }
}