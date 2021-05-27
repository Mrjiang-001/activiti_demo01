import com.mhqf.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/27 16:11
 */
public class MybatisTest {
    @Test
    public void test01() throws IOException {
        String resource = "mybatis/mybatis_cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = sqlSession.selectOne("org.mybatis.example.BlogMapper.selectStudent", 1);
        System.out.println(student);
        sqlSession.commit();
        sqlSession.close();
    }

    public void test02() {
        String r;
    }
}
