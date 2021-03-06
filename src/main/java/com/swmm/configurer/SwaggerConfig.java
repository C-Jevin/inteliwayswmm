package com.swmm.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                /* 自行修改为自己的包路径 */
                .apis(RequestHandlerSelectors.basePackage("com.swmm.web"))

                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("InteliwaySwmm项目")
                .description("InteliwaySwmm API")
                //服务条款网址
                //.termsOfServiceUrl("http://localhost:8081/static/all.html/")
                .version("1.0")
                .contact(new Contact("InteliwaySwmm在线接口说明文档", "http://nanjing.innowater.cn:18081/html/all.html/",null))
                //.contact(new Contact("InteliwaySwmm在线接口说明文档", "http://localhost:8081/static/html/all.html/",null))
                .build();
    }
}
