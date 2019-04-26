package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DBConfig {

    @Value("${spring.datasource.url}")
    private String dbUrl;

//    @Bean
//    public DataSource dataSource() throws SQLException {
//        log.info("===========================datasource init! dburl:{}", dbUrl);
//        if (dbUrl == null || dbUrl.isEmpty()) {
//            return new HikariDataSource();
//        } else {
//            HikariConfig config = new HikariConfig();
//            config.setJdbcUrl(dbUrl);
////            config.setUsername("qojwmhziriyfsw");
////            config.setPassword("2adeff3885dd3cc02b59dddc0f8baa03eaa8438254eef4422fff89d501541657");
//            return new HikariDataSource(config);
//        }
//    }
}
