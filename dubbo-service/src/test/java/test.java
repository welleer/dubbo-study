import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2018/3/8.
 */
public class test {
        public static void main(String[] args) throws Exception {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
            context.start();
            System.in.read(); // 按任意键退出
        }
}
