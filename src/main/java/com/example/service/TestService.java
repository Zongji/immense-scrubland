package com.example.service;

import com.example.dto.Ticks;
import com.example.mapper.TicksMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestService {

    private final TicksMapper ticksMapper;

    public List<Ticks> getList() {
        List<Ticks> list = ticksMapper.selectList(null);
        return list;
    }

    public int insert() {
        Ticks ticks = new Ticks();
        ticks.setTick(new Date());
        int i = ticksMapper.insert(ticks);
        return i;
    }
}
