package com.hard.integrationTests.config;

import com.hard.config.AppConfig;
import com.hard.services.*;
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
    public void shouldReturnApartmentServiceImplBean_Test() {
        ApartmentService apartmentService = null;

        try {
            apartmentService = (ApartmentService) webApplicationContext.getBean("apartmentServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnIssueServiceImplBean_Test() {
        IssueService issueService = null;

        try {
            issueService = (IssueService) webApplicationContext.getBean("issueServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnMessageIssueServiceImplBean_Test() {
        MessageIssueService messageIssueService = null;

        try {
            messageIssueService = (MessageIssueService) webApplicationContext.getBean("messageIssueServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnMessageTopicServiceImplBean_Test() {
        MessageTopicService messageTopicService = null;

        try {
            messageTopicService = (MessageTopicService) webApplicationContext.getBean("messageTopicServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnPartnershipServiceImplBean_Test() {
        PartnershipService partnershipService = null;

        try {
            partnershipService = (PartnershipService) webApplicationContext.getBean("partnershipServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnPositionServiceImplBean_Test() {
        PositionService positionService = null;

        try {
            positionService = (PositionService) webApplicationContext.getBean("positionServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnRoleServiceImplBean_Test() {
        RoleService roleService = null;

        try {
            roleService = (RoleService) webApplicationContext.getBean("roleServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnTopicServiceImplBean_Test() {
        TopicService topicService = null;

        try {
            topicService = (TopicService) webApplicationContext.getBean("topicServiceImpl");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

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
