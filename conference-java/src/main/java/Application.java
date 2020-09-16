import com.springdemo.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Singleton speakerService
        {
            System.out.println("########## Singleton speakerService ########## ");
            SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());

            SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());

            SpeakerService service3 = appContext.getBean("speakerService2", SpeakerService.class);
            System.out.println(service3);
            System.out.println(service3.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());
        }

        // Prototype speakerService
        {
            System.out.println("########## Prototype speakerService ########## ");
            SpeakerService service = appContext.getBean("speakerServicePrototype", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());

            SpeakerService service2 = appContext.getBean("speakerServicePrototype", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());

            SpeakerService service3 = appContext.getBean("speakerServicePrototype2", SpeakerService.class);
            System.out.println(service3);
            System.out.println(service3.findAll().get(0).getFirstName());
            System.out.println(service.findAll().get(0).getLastName());
            System.out.println(service.findAll().get(0).getSeedNum());
        }
    }
}
