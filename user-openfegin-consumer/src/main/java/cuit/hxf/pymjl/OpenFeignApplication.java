package cuit.hxf.pymjl;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import cuit.hxf.pymjl.config.OpenFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Pymjl
 * @version 1.0
 * @date 2022/8/31 23:37
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,DruidDataSourceAutoConfigure.class})
@EnableFeignClients(defaultConfiguration = OpenFeignConfig.class)
public class OpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class, args);
    }
}
