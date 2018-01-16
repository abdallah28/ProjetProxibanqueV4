package org.formation.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Stephane_Abdallah: Classe de Configuration qui étend
 *         WebMvcConfigurerAdapter, Mapping des Jsp avec
 *         InternalResourceViewResolver, définition de la page de démarrageet du
 *         chemin du répertoire resources
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { " org.formation.spring" })
@Import({ ApplicationConfig.class })
@PropertySource("classpath:application.properties")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() { // trouver la bonne vue
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) { // pour dire d�s que tu d�marres tu vas sur cette
																		// page jsp
		// index mapping
		// / - > index.jsp
		registry.addViewController("/").setViewName("index");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) { // pour qu'il sache aller chercher les
																		// ressources
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

	//
	// @Override
	// public void addInterceptors(InterceptorRegistry registry) {
	// registry.addInterceptor(localeChangeInterceptor());
	// }
	//
	// @Bean
	// public static PropertySourcesPlaceholderConfigurer
	// propertyPlaceholderConfigure(){
	// return new PropertySourcesPlaceholderConfigurer();
	//
	// }
	//
	// @Bean
	// public MessageSource messageSource() {
	// ResourceBundleMessageSource messageSource = new
	// ResourceBundleMessageSource();
	// messageSource.setBasename("lang");
	// messageSource.setDefaultEncoding("UTF-8");
	// return messageSource;
	// }
	//
	// @Bean
	// public LocaleChangeInterceptor localeChangeInterceptor() {
	// LocaleChangeInterceptor localeChangeInterceptor = new
	// LocaleChangeInterceptor();
	// localeChangeInterceptor.setParamName("language");
	// return localeChangeInterceptor;
	//
	// }
	//
	// @Bean
	// public CookieLocaleResolver localeResolver() {
	// CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
	// cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
	// return cookieLocaleResolver;
	//
	// }
	//
	//

}
