import com.spring.config.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student", Student.class);
        student.display();
    }

}
