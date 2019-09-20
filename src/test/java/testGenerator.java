import com.vainglory.mapper.UserMapper;
import com.vainglory.pojo.User;
import com.vainglory.pojo.UserExample;
import com.vainglory.utils.sqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testGenerator {

    /**
     * 测试插入
     */
    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setGender("男");
        user.setName("德华刘");
        user.setPhone("12345678998");
        user.setEmail("1111.@qq.com");
        userMapper.insert(user);

        /*执行更新操作时一定要提交*/
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试按照条件查询
     */
    @Test
    public void test02(){
        SqlSession sqlSession = sqlSessionUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        /*构建查询条件*/
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameLike("%李%");
        /*按照条件查询*/
        List<User> userList = userMapper.selectByExample(userExample);

        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}
