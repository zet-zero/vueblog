package com.vueblog.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogVO {
    private Long id;

    private Long userId;

    private String title;

    private String description;

    private String content;

    private LocalDateTime created;

    private Integer status;
}
