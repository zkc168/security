import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;
import cn.sm1234.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapper1 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFinfByUsername(){
        User user = userMapper.findByUsername("eric");
        System.out.println(user);
    }

    @Test
    public void findPermissionByUsername(){
        List<Permission> permissions = userMapper.findPermissionByUsername("eric");
        for (Permission permission:permissions){
            System.out.println(permission.getPermName()+":"+permission.getPermTag());
        }
        System.out.println(permissions);
    }
}
