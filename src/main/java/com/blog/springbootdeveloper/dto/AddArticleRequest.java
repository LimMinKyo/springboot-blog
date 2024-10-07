package com.blog.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.blog.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity() {
        return Article.builder().title(title).content(content).build();
    }
}