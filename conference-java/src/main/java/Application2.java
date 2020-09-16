import com.springdemo.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig2.class);

        // Singleton speakerService
        {
            SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());

            SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
        }
    }
}
