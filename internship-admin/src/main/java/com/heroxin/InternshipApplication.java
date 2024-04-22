package com.heroxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InternshipApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternshipApplication.class, args);
        System.out.println("" +
                " ____  ____                                 _            \n" +
                "|_   ||   _|                               (_)           \n" +
                "  | |__| |  .---.  _ .--.   .--.   _   __  __   _ .--.   \n" +
                "  |  __  | / /__\\\\[ `/'`\\]/ .'`\\ \\[ \\ [  ][  | [ `.-. |  \n" +
                " _| |  | |_| \\__., | |    | \\__. | > '  <  | |  | | | |  \n" +
                "|____||____|'.__.'[___]    '.__.' [__]`\\_][___][___||__] \n" +
                "\n" +
                "保定学院 数据科学与软件工程学院 2020级 软件工程一班 李鑫 2005024116 \n" +
                "                                          (某学院顶岗实习管理系统)"
        );
    }
}
