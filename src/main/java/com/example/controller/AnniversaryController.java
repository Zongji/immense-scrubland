package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dto.AnniversaryDTO;
import com.example.dto.TicksDTO;
import com.example.service.AnniversaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/anniversary")
public class AnniversaryController {

    private final AnniversaryService anniversaryService;

    @RequestMapping("")
    String add(Map<String, Object> model) {

        System.out.println("===========test2===========");
        AnniversaryDTO dto = new AnniversaryDTO();
        dto.setTitle("title1");
        dto.setContent("111111");
        dto.setCreator("sys");
        dto.setUpdator("sys");
        dto.setDateAt(new Date());

        anniversaryService.save(dto);
        List list = anniversaryService.listObjs();

        model.put("dtos", list);
        return "anniversary";
    }
}
