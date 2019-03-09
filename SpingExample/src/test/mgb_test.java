package test;

import mbgbean.Country;
import mbgbean.CountryExample;
import mbgbean.User;
import mbgbean.UserExample;
import mbgmappar.CountryMapper;
import mbgmappar.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class mgb_test {

    //   Generator 使用
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

        //按主键查询
//        mbgbean.User user=mapper.selectByPrimaryKey(1);
//        System.out.println(user);

        //按条件查询
        UserExample example=new UserExample();
        example.createCriteria().andNameLike("文");

         List<User> users= mapper.selectByExample(example);
        System.out.println(users);
        //sqlSession.commit();


    }


    @Test
    public void Test() throws IOException {
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


        //按条件查询
        UserExample example=new UserExample();
        User user=new User();
        user.setId(10);
        user.setName("名剑绝世");
        user.setAge("22");
        user.setcId(1);
        mapper.insert(user);
        sqlSession.commit();

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
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);

        //按条件查询
        UserExample example=new UserExample();
        User user=new User();
        user.setId(10);
        user.setName("名剑绝世");
        user.setAge("22");
        user.setcId(1);
        mapper.insert(user);
        sqlSession.commit();
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

        CountryMapper mapper= sqlSession.getMapper(CountryMapper.class);

        //按条件查询
        CountryExample example=new CountryExample();
        example.createCriteria().andCCapitalEqualTo("北京");
        List<Country> country= mapper.selectByExample(example);
        System.out.println(country);

    }

}
