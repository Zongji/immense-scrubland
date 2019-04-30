package com.example.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class BaseTDO {
    @TableField(value = "id")
    private Long id;

    @TableField(value = "creator")
    private String creator;

    @TableField(value = "updator")
    private String updator;

    @TableField(value = "create_at")
    private Date createAt;

    @TableField(value = "update_at")
    private Date updateAt;


}
