package mappar;

import bean.CountryVo;
import bean.User;
import bean.UserVo;

import java.util.List;

public interface UserMapper {

    //mapper动态代理开发四大原则
    //1、接口方法名需要与 xml 文件中要调用的sql语句的 id 要一致
    //2、接口的形参类型需要与 mapper.xml parameterType 一致
    //3、接口返回值需要与 mapper.xml resultType 一致
    //4、mapper.xml中namespace 要与接口的全包名一致
    //5、注意mapper 动态代理开发中，根据返回值类型来自动选择
    //通过Id查询一个用户

    public User selectUserById(int id);


    public List<User> selectUserByName(String name);

    //一对一
    public List<UserVo> selectAllUserVo();

    //一对多
    public List<CountryVo> selectAllCountryVo();

    //多条件查询
    public List<User> selectUserListByUser(User u);

    //
    public List<User> getUserByIds(List<Integer> ids);

    //更新用户表
    public void updatetUserInfo(User u);

    //查询多个id的用户列表
    public List<User> selectUserListByIds(User u);
}
