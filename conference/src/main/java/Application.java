import com.springbootdemo.model.Speaker;
import com.springbootdemo.service.SpeakerService;
import com.springbootdemo.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
