package a.b.c;

import java.util.List;

public interface BlogMapper {

    void insert(Blog blog);

    void updateById(Blog blog);

    void deleteById(long id);

    Blog selectById(long id);

    List<Blog> selectAll();
}