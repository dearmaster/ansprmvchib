package com.master.ash.dao.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Set;

@Transactional
@Rollback(false)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ClientDaoImplTest {

    @Autowired
    private ClientDao clientDao;
    private static final Logger logger = Logger.getLogger(ClientDaoImplTest.class);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void load() throws Exception {
        Set<Client> clients = clientDao.load();
        logger.info(clients.size());
        Assert.assertNotNull(clients);
    }

    @Ignore
    @Test
    public void save() throws Exception {
        Client client = new Client("Lily", "女", sdf.parse("1995-11-30"), "Beijing", "SAP", "lily@sap.com", "15082383821");
        clientDao.save(client);
    }

}