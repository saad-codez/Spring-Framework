import com.spring.config.AppConfig;
import com.spring.config.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); // for xml file
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // for java based annotation
//        Student student = context.getBean("student", Student.class);
//        student.display();
    }

}
