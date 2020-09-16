import com.springbootdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springbootdemo.repository.SpeakerRepository;
import com.springbootdemo.service.SpeakerService;
import com.springbootdemo.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

     @Bean(name = "speakerService")
     @Scope(value = BeanDefinition.SCOPE_SINGLETON)
     public SpeakerService getSpeakerService() {
         SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
         return service;
     }

    @Bean(name = "speakerService2")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService2() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }

    @Bean(name = "speakerServicePrototype")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerServicePrototype() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerServicePrototype2")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerServicePrototype2() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }

     @Bean(name = "speakerRepository")
     public SpeakerRepository getSpeakerRepository() {
         return new HibernateSpeakerRepositoryImpl();
     }
}
