import com.liwei.service.GetMoneyService;
import com.liwei.service.SaveMoneyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2018/3/8.
 */
public class customer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:customer.xml");
        context.start();
//while(1==1) {
//        Thread.sleep(1000);
    GetMoneyService getMoneyService = (GetMoneyService) context.getBean("getMoneyService"); // 获取远程服务代理
    String hello = getMoneyService.get(); // 执行远程方法

    System.out.println(hello); // 显示调用结果
        SaveMoneyService saveMoneyService = (SaveMoneyService) context.getBean("saveMoneyService"); // 获取远程服务代理
        String save = saveMoneyService.save(); // 执行远程方法
        System.out.println(save); // 显示调用结果
//}
    }
}