import cn.sanske.mybatisplus.Dto.User;
import cn.sanske.mybatisplus.MybatisPlusApplication;
import cn.sanske.mybatisplus.mapper.UserMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 若练此功 必先自宫
 * <p>
 * ┏┛ ┻━━━━━┛ ┻┓
 * ┃　　　　　　 ┃
 * ┃　　　━　　　┃
 * ┃　┳┛　  ┗┳　┃
 * ┃　　　　　　 ┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　 ┃
 * ┗━┓　　　┏━━━┛
 * ┃　　　┃   神兽保佑
 * ┃　　　┃   代码无BUG！
 * ┃　　　┗━━━━━━━━━┓
 * ┃　　　　　　　    ┣┓
 * ┃　　　　         ┏┛
 * ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * ┃ ┫ ┫   ┃ ┫ ┫
 * ┗━┻━┛   ┗━┻━┛
 * 用户测试
 *
 * @author sanske
 * @since 2020-04-01
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MybatisPlusApplication.class})
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUserInfo() {
      System.out.println("getUserAll");
      List<User> users = userMapper.selectList(null);
      users.forEach(System.out::println);
    }

}