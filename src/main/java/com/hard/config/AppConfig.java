package com.hard.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({
        "com.hard.config.app",
        "com.hard.repositories",
        "com.hard.services.impl",
})
@EnableJpaRepositories("com.hard.repositories")
@EnableTransactionManagement
public class AppConfig {

}
