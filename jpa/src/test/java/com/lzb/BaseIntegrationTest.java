package com.lzb;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Transactional
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class BaseIntegrationTest {

}