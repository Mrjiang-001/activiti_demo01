import com.mhqf.cglib.MyBeanFactory;
import com.mhqf.dao.GoodsDao;
import org.junit.Test;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/29 0:28
 */
public class CglibTest {
    @Test
    public void test01() {
        GoodsDao goodsDao = MyBeanFactory.getBean();
        // 执行方法
        goodsDao.add();
        goodsDao.update();
        goodsDao.delete();
        goodsDao.find();
    }
}
