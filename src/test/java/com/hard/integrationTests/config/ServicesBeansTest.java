package com.hard.integrationTests.config;

import com.hard.config.AppConfig;
import com.hard.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {
                AppConfig.class,
        }
)
@WebAppConfiguration
public class ServicesBeansTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void shouldReturnUserServiceImplBean_Test() {
        UserService userService = null;

        try {
            userService = (UserService) webApplicationContext.getBean("userServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }
}
