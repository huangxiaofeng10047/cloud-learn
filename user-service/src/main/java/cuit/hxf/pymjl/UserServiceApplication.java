package cuit.hxf.pymjl;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 **
 * @author Pymjl
 * @version 1.0
 * @date 2022/8/25 12:47
 **/
@SpringBootApplication
@EnableDubbo
//@MapperScan({"cuit.hxf.pymjl.mapper","com.gitee.sunchenbin.mybatis.actable.dao.*"})
//@ComponentScan(basePackages = {"cuit.hxf.pymjl","com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
