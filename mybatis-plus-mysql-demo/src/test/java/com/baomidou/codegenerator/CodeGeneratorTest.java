package com.baomidou.codegenerator;

import com.baomidou.SpringBaseTest;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import java.nio.file.Paths;

public class CodeGeneratorTest extends SpringBaseTest {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Test
    public void test() {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author("qiao")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd HH:mm:ss")
                )
                .packageConfig(builder -> builder
                        .parent("com.baomidou")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .controller("controller")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                )
//                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
