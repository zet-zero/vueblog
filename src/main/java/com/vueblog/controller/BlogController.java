package com.vueblog.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.Blog;
import com.vueblog.entity.BlogDTO;
import com.vueblog.entity.User;
import com.vueblog.mapper.BlogMapper;
import com.vueblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    BlogMapper blogMapper;

    @PostMapping("/list")
    public Object list(@RequestParam(defaultValue = "1") Integer currentPage,@RequestBody User user){
        PageHelper.startPage(currentPage,10);
        List<BlogDTO> blogList = blogService.selectList(user.getId());
        System.out.println("test");
        PageInfo<Blog> pageInfo = new PageInfo(blogList);
        return pageInfo.getList();
    }

    @GetMapping("/detail")
    public ResultVO<Blog> detail(@RequestBody Blog blog){
        return new ResultVO(blogService.selectOne(blog));
    }

    @GetMapping("/edit")
    public ResultVO<Blog> edit(@Validated @RequestBody Blog blog){
        return new ResultVO(blogService.selectOne(blog));
    }

    @PostMapping("/save")
    public ResultVO save(@RequestBody Blog blog){
        if(blog.getId() != null)
            blogService.updateOne(blog);
        else
            blogService.addOne(blog);
        return ResultVO.SUCCESS;
    }
}
