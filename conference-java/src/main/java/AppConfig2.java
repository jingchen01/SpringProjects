import com.springdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springdemo.repository.SpeakerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.springdemo"})
public class AppConfig2 {
}
