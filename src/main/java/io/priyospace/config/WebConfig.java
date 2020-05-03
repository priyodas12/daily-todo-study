package io.priyospace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"io.priyospace"})
public class WebConfig {
    //static path and extension
    public static final String RESOLVER_PREFIX="/WEB-INF/view/";
    public static final String RESOLVER_EXTENSION=".jsp";

    //bean methods
    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver urvs=new InternalResourceViewResolver();
        urvs.setPrefix(RESOLVER_PREFIX);
        urvs.setSuffix(RESOLVER_EXTENSION);
        return urvs;
    }
}
