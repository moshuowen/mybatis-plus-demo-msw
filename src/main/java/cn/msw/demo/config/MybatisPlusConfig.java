package cn.msw.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author moshuowen@outlook.com
 * @date 2022/7/3 15:49
 * @version 1.0
 */
@Configuration
@MapperScan("cn.msw.demo.mapper")
public class MybatisPlusConfig {

}
