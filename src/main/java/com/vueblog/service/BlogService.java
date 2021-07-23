package com.vueblog.service;

import com.vueblog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vueblog.entity.BlogDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
public interface BlogService extends IService<Blog> {
    List<BlogDTO> selectList(Long id);
    Blog selectOne(Blog blog);
    int addOne(@Param("Blog") Blog blog);

    Blog updateOne(@Param("Blog") Blog blog);
}
