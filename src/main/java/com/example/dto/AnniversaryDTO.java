package com.example.dto;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@KeySequence("anniversary_id_seq")
@TableName("anniversary")
public class AnniversaryDTO extends BaseTDO{
    private String title;
    private String content;
    private Date dateAt;
}
