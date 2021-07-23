package com.vueblog.service.impl;

import com.vueblog.entity.Blog;
import com.vueblog.entity.BlogDTO;
import com.vueblog.mapper.BlogMapper;
import com.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Resource
    private BlogMapper blogMapper;

    @Override
    public List<BlogDTO> selectList(Long id) {
        List<BlogDTO> blogList = blogMapper.selectList(id);
        System.out.println(blogList);
        return blogList;
    }

    @Override
    public Blog selectOne(Blog blog) {

        return blogMapper.selectOne(blog);
    }

    @Override
    public int addOne(Blog blog) {
        return blogMapper.addOne(blog);
    }

    @Override
    public Blog updateOne(Blog blog) {
        return blogMapper.updateOne(blog);
    }
}
