package org.formation.spring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Stephane Abdallah: Classe de configuration JDBC,
 *         Drive,Accés,Provider, Dialect, transaction, EntityManager, Path vers
 *         application.properties
 *
 */
@Configuration // class de configurations
@EnableJpaRepositories(basePackages = { "org.formation.spring" }) // pour activer Jpa dans Spring
@EnableTransactionManagement // pour activer les transactions
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = { "org.formation.spring" }) // �couvrir les coumposants
public class ApplicationConfig {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("jdbc.driverClass"));
		dataSource.setUrl(environment.getProperty("jdbc.url")); // c'est ce qui nous permet de r�cuperer le fichier
																// property
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));
		return dataSource;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);

		return jpaTransactionManager;

	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {

		// JPA Java Persistence API (tHE Standard Specification for accessing databases
		// through Java Objects)
		// Hibernate Implementation of JPA is used
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();

		// JPA vendor adapter will set SQL syntax to MYSQL
		jpaVendorAdapter.setDatabase(Database.MYSQL); // dialect

		// Database tables-setGenerateDdl(true);
		// setting this will show SQLS on logs
		jpaVendorAdapter.setShowSql(true); // dialect

		return jpaVendorAdapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		// equivalent Xml

		/*
		 * <!-- JPA Persistence Context and EntityManager configuration --> <bean
		 * id="entityManagerFactory"
		 * class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean" >
		 * <property name="packagesToScan" value="spring.mvc.bean" /> <property
		 * name="dataSource" ref="dataSource" /> <property name="jpaVendorAdapter">
		 * <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter" >
		 * <property name="generateDdl" value="true" /> <property name="showSql"
		 * value="true" /> </bean> </property> <property name="jpaProperties"> <props>
		 * <prop key="hibernate.dialect">org.hibernate.dialect.HSQLDialect</prop> <prop
		 * key="hibernate.show_sql">true</prop> <prop
		 * key="hibernate.format_sql">false</prop> <prop
		 * key="hibernate.hbm2ddl.auto">update</prop> </props> </property> </bean>
		 */

		// Entity Manager Factory configuration is required in order to manage entities
		// (tables) in Spring MVC
		// Entity Manager Factory will manage the life cycle of entities in Java
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();

		// Entity manager factory requires a data source in order to store/list entities
		entityManagerFactory.setDataSource(dataSource());

		// Java Config Dependency injection is provided here by setting JPA Vendor
		// Adapter (Hibernate)
		entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter());

		// Entity Manager Factory will scan packages in order to find entities (@Entity)
		entityManagerFactory.setPackagesToScan("org.formation.spring.model");

		// Custom properties can be set using Properties
		Properties jpaProperties = new Properties();
		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update"); // on peut jouer avec update, delete ou create

		entityManagerFactory.setJpaProperties(jpaProperties);

		return entityManagerFactory;

	}

}
