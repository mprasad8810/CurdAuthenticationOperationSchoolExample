//package com.curd.school.CurdAuthenticationOperationSchoolExample.config;
//
//import com.google.common.base.Predicate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//@EnableWebMvc
//@ComponentScan("com.curd.school.CurdAuthenticationOperationSchoolExample")
//public class SwaggerConfig {
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
//                .paths((Predicate<String>) PathSelectors.any())
//                .build();
//    }
//}
