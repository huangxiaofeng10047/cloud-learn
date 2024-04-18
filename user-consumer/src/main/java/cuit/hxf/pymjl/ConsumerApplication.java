package cuit.hxf.pymjl;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author hxf
 * @date 2023年01月28日 11:46 AM
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDubbo
public class ConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    
    }
}
