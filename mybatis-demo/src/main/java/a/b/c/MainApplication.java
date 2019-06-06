package a.b.c;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = sqlSessionFactory.openSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog newBlog = new Blog();
        newBlog.setTitle("xxxx");
        newBlog.setContent("yyyy");
        session.insert("a.b.c.BlogMapper.insert", newBlog);

        newBlog = new Blog();
        newBlog.setId(1L);
        newBlog.setTitle("xxxx");
        newBlog.setContent("yyyy");
        session.update("a.b.c.BlogMapper.updateById", newBlog);

        session.delete("a.b.c.BlogMapper.deleteById", 1L);

        Blog blog = session.selectOne("a.b.c.BlogMapper.selectById", 1L);
        List<Blog> blogs = session.selectList("a.b.c.BlogMapper.selectAll");
/*
        Blog newBlog = new Blog();
        newBlog.setTitle("xxxx");
        newBlog.setContent("yyyy");
        mapper.insert(newBlog);

        newBlog = new Blog();
        newBlog.setId(1L);
        newBlog.setTitle("xxxx");
        newBlog.setContent("yyyy");
        mapper.updateById(newBlog);

        Blog blog = mapper.selectById(1L);
        List<Blog> blogs = mapper.selectAll();*/

        session.close();
    }
}
