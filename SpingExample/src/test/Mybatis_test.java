package test;

import bean.CountryVo;
import bean.User;
import bean.UserVo;
import mappar.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Mybatis_test {

    @Test
    public void Test1() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();
        //操作数据库
        //第一个参数 要操作的sql语句  第二个sql 语句的占位符
        //User user = sqlSession.selectOne("Usermappar.selectUserById",0);
        User user =new User();
        user.setId(6);
        user.setName("baba");
        //新增
        sqlSession.insert("Usermappar.insertUser",user);
        sqlSession.commit();
        //System.out.println(user.toString());
    }

    @Test
    public void Test2() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();
        //操作数据库
        //第一个参数 要操作的sql语句  第二个sql 语句的占位符
        //User user = sqlSession.selectOne("Usermappar.selectUserById",0);
        User user =new User();
        user.setId(6);

        user.setName("baba");
        //修改
        sqlSession.update("Usermappar.updatetUser",user);
        sqlSession.commit();
        //System.out.println(user.toString());
    }


    @Test
    public void Test3() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        //删除
        sqlSession.delete("Usermappar.delelctUserById",6);
        sqlSession.commit();
        //System.out.println(user.toString());
    }


    //动态代理查询
    @Test
    public void Test4() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserById(2);

        System.out.println(user.toString());
    }

    //动态代理模糊查询
    @Test
    public void Test5() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<bean.User> user = mapper.selectUserByName("文");
        for (int i=0;i<user.size();i++){
            System.out.println(user.get(i).toString());
        }

    }


    //一对一链表查询
    @Test
    public void Test6() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<bean.UserVo> user = mapper.selectAllUserVo();
        for (UserVo u : user) {
            System.out.println(u);
        }

    }

    //一对多 关联查询
    @Test
    public void Test7() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<bean.CountryVo> user = mapper.selectAllCountryVo();
        for (CountryVo u : user) {
            System.out.println(u);
        }

    }

    //一对多 关联查询
    @Test
    public void Test8() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setAge("19");
        user.setName("文");
        user.setC_id(1);
        List<User> countryVos = mapper.selectUserListByUser(user);
        for (User u : countryVos) {
            System.out.println(u);
        }

    }

    //集合查询
    @Test
    public void Test11() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<User> countryVos = mapper.getUserByIds(ids);
        for (User u : countryVos) {
            System.out.println(u);
        }

    }


    //更新表
    @Test
    public void Test9() throws IOException {
        //读取配置文件
        String resource = "generatorConfig2.xml";
        InputStream in= Resources.getResourceAsStream(resource);

        //需要sqlSessionfactoryBulider
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();

        //创建需要sqlSessionfactory
        SqlSessionFactory sessionFactory= builder.build(in);

        //生产一个sqlSession
        SqlSession sqlSession=sessionFactory.openSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setId(1);
        user.setAge("19999");
        user.setName("八岐邪神");
        user.setC_id(1);
        mapper.updatetUserInfo(user);
        sqlSession.commit();
    }

}
