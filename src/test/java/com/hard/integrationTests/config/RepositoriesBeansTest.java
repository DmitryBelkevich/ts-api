package com.hard.integrationTests.config;

import com.hard.config.AppConfig;
import com.hard.repositories.*;
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
public class RepositoriesBeansTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void shouldReturnApartmentRepositoryBean_Test() {
        ApartmentRepository apartmentRepository = null;

        try {
            apartmentRepository = (ApartmentRepository) webApplicationContext.getBean("apartmentRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnIssueRepositoryBean_Test() {
        IssueRepository issueRepository = null;

        try {
            issueRepository = (IssueRepository) webApplicationContext.getBean("issueRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnMessageIssueRepositoryBean_Test() {
        MessageIssueRepository messageIssueRepository = null;

        try {
            messageIssueRepository = (MessageIssueRepository) webApplicationContext.getBean("messageIssueRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnMessageTopicRepositoryBean_Test() {
        MessageTopicRepository messageTopicRepository = null;

        try {
            messageTopicRepository = (MessageTopicRepository) webApplicationContext.getBean("messageTopicRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnPartnershipRepositoryBean_Test() {
        PartnershipRepository partnershipRepository = null;

        try {
            partnershipRepository = (PartnershipRepository) webApplicationContext.getBean("partnershipRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnPositionRepositoryBean_Test() {
        PositionRepository positionRepository = null;

        try {
            positionRepository = (PositionRepository) webApplicationContext.getBean("positionRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnRoleRepositoryBean_Test() {
        RoleRepository roleRepository = null;

        try {
            roleRepository = (RoleRepository) webApplicationContext.getBean("roleRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnTopicRepositoryBean_Test() {
        TopicRepository topicRepository = null;

        try {
            topicRepository = (TopicRepository) webApplicationContext.getBean("topicRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void shouldReturnUserRepositoryBean_Test() {
        UserRepository userRepository = null;

        try {
            userRepository = (UserRepository) webApplicationContext.getBean("userRepository");
        } catch (NoSuchBeanDefinitionException e) {
            Assert.fail(e.getLocalizedMessage());
        }
    }
}
