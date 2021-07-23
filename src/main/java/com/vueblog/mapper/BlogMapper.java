package com.vueblog.mapper;

import com.vueblog.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vueblog.entity.BlogDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@Repository
@Component
public interface BlogMapper extends BaseMapper<Blog> {
    List<BlogDTO> selectList(Long id);
    Blog selectOne(@Param("Blog") Blog blog);
    int addOne(@Param("Blog") Blog blog);

    Blog updateOne(@Param("Blog")Blog blog);
}
