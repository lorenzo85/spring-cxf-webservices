package org.spring.cxf.weather.webservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = {VelocityAutoConfiguration.class})
@ImportResource({"classpath:cxf-servlet.xml"})
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    @Bean
    public ServletRegistrationBean cxfServlet() {
        org.apache.cxf.transport.servlet.CXFServlet cxfServlet = new org.apache.cxf.transport.servlet.CXFServlet();
        ServletRegistrationBean servletDef = new ServletRegistrationBean(cxfServlet, "/*");
        servletDef.setLoadOnStartup(1);
        return servletDef;
    }
}
