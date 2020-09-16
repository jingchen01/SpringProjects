import com.springdemo.service.SpeakerService;
import com.springdemo.service.SpeakerService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService2 service2 = appContext.getBean("speakerService2", SpeakerService2.class);
        System.out.println(service2.findAll().get(0).getFirstName());
    }
}
