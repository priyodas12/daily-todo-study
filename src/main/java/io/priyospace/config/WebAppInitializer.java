package io.priyospace.config;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Slf4j
public class WebAppInitializer implements WebApplicationInitializer {

    //fields
    private static final String DISPATCHER_SERVLET_NAME="dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("On Starting...");

        //create application context
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();

        //register config class
        context.register(WebConfig.class);

        //create dispatcher servlet
        DispatcherServlet ds=new DispatcherServlet(context);

        //register and configure dispatcher servlet
        ServletRegistration.Dynamic reg=servletContext.addServlet(DISPATCHER_SERVLET_NAME,ds);

        //start up loading
        reg.setLoadOnStartup(1);

        //url pattern
        reg.addMapping("/");

    }
}
