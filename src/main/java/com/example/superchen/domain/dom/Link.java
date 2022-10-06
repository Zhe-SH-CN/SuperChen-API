package com.example.superchen.domain.dom;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@TableName("link")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link {

    @TableId(type = IdType.AUTO)
    private int id;

    private String url;

    private Integer risk;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private String token;

}
