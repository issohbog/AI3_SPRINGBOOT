package com.aloha.mvc.dto;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @NoArgsConstructor
// @Getter
// @Setter
// @ToString
@Data
@AllArgsConstructor
@Builder
public class Posts {

    private Long no; 
    private String id; 
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    public Posts(){
        this.id = UUID.randomUUID().toString();
    }
}
