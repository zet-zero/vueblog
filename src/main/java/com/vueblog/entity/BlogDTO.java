package com.vueblog.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Table(name = "m_blog")
public class BlogDTO {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "description")
    private String title;

    private String description;

    private String content;

    private LocalDateTime created;

    private Integer status;
}
