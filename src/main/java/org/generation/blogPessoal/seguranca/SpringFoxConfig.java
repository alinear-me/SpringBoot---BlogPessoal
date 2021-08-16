package org.generation.blogPessoal.seguranca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.sun.tools.sjavac.server.RequestHandler;

import springfox.documentation.builders.ApiInfoBuilder;

//import com.google.common.base.Predicate;

//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*- @EnableSwagger2: No Sprin Boot o swagger é ativado com esta anotação.
 *  
 *- O método 'api' (em verde) retorna o Docket. Esse Docket é um objeto que configura tudo o que
 *precisamos dentro do nosso swagger.
 *- Docket: estamos definindo no nosso @Bean a permição para configurar os endpoints expostos por ele.
 *
 *- apis() e paths(): nesses métodos definimos que todas as apis e caminhos estarão disponíveis.
 * Com isso através de reflection a biblioteca já consegue obter os endpoinst definidos na aplicação.
 * 
 *- Ao executar, o Swagger UI estará disponível em /swagger-ui.html
 *  * */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	

	@Bean
	public Docket api() {
		return	new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.any())
		.paths(PathSelectors.any())
		.build(); 
		} 
	
	
		private Predicate<springfox.documentation.RequestHandler> apis() {
		return RequestHandlerSelectors.basePackage("package org.generation.blogPessoal");
	}
	

		private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("API de Blog Pessoal")
				.description("Essa é a API de Blog Pessoal - Generation.")
				.license("Apache License, Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.termsOfServiceUrl("/service.html")
				.version("1.0.0")
				.contact(new Contact("Aline Monteiro", "https://github.com/alinear-me", "aline.monteiro100@gmail.com"))
				.build();
				
		
		return apiInfo;
		
	}
	
	}

