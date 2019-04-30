package com.example.controller;

import com.example.dto.TicksDTO;
import com.example.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TestController {

    private DataSource dataSource;
    private final TestService testService;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/db")
    String db(Map<String, Object> model) {

        return getString2(model);
    }

    private String getString2(Map<String, Object> model) {
        System.out.println("===========test2===========");
        testService.insert();
        List<TicksDTO> list = testService.getList();

        ArrayList<String> output = new ArrayList<String>();
        list.stream().forEach(item -> {
            output.add("Read from DB: " + item.getTick().toString());
        });
        model.put("records", output);
        return "db";
    }

    private String getString(Map<String, Object> model) {
        System.out.println("=====================db=======");
        try (Connection connection = dataSource.getConnection()) {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (id bigserial not null, tick timestamp)");
            stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
            ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

            ArrayList<String> output = new ArrayList<String>();
            while (rs.next()) {
                output.add("Read from DB: " + rs.getTimestamp("tick"));
            }

            model.put("records", output);
            return "db";
        } catch (Exception e) {
            model.put("message", e.getMessage());
            return "error";
        }
    }

}
