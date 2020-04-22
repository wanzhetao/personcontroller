package org.spring.springboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
 
@Configuration
@EnableSwagger2
public class swaggerConfig {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("controller")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.spring.springboot.controller"))//项目包名
				.paths(PathSelectors.any()).build();
	}
 
 
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("远行REST定制平台 RESTful API")
				.description("通过远行REST定制平台定制的REST API")
				.termsOfServiceUrl("").version("1.0").build();
	}
}
