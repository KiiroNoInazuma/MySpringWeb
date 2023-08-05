import config.ConfigTransport;
import models.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTransport.class);
        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);

        //Проставлена на @Qualifier("transport1") ("Мазда")

        driver1.getReadyTransport();
        driver2.getReadyTransport();
        driver3.getReadyTransport();

    }
}
