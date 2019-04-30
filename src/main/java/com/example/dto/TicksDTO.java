package com.example.dto;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@KeySequence("ticks_id_seq")
@TableName("ticks")
public class TicksDTO {

    @TableField(value = "id")
    private Long id;

    @TableField(value = "tick")
    private Date tick;
}
