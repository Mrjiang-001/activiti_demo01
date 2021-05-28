import com.mhqf.controller.MyAspect;
import com.mhqf.controller.MyBeanFactory;
import com.mhqf.dao.CustomerDao;
import org.junit.Test;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/28 23:47
 */
public class JDKProxyTest {
    @Test
    public void test01() {
        // 从工厂获得指定的内容（相当于spring获得，但此内容时代理对象）
        CustomerDao customerDao = MyBeanFactory.getBean();
        customerDao.add();
        customerDao.delete();
        customerDao.find();
        customerDao.update();

    }
}
