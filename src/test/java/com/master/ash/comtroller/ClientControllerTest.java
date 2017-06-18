package com.master.ash.comtroller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class ClientControllerTest {

    @Autowired
    private ClientController clientController;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void load() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void paginationLoad() throws Exception {
        clientController.paginationLoad(request, response, 10, 2);
    }

}