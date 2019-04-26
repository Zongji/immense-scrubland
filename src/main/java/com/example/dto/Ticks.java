package com.example.dto;

import com.baomidou.mybatisplus.annotation.KeySequence;
import lombok.Data;

import java.util.Date;

@Data
@KeySequence("ticks_id_seq")
public class Ticks {

    private Long id;
    private Date tick;
}
