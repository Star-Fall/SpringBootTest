package com.starfall.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author StarFall
 * @project SpringBootTest
 * @package com.starfall.springboot.config
 * @className GlobalConfiguration
 * @date 2019/5/6 23:13
 * @description GlobalConfiguration
 */
@Configuration
public class GlobalConfiguration {

    @Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver {

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
