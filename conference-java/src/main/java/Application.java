import com.springbootdemo.model.Speaker;
import com.springbootdemo.service.SpeakerService;
import com.springbootdemo.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Singleton speakerService
        {
            SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());

            SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
        }

        // Prototype speakerService
        {
            SpeakerService service = appContext.getBean("speakerServicePrototype", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());

            SpeakerService service2 = appContext.getBean("speakerServicePrototype", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
        }
    }
}