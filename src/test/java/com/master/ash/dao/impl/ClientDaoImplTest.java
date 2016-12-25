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
import java.util.HashSet;
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

//    @Ignore
    @Test
    public void save() throws Exception {
        Set<Client> set = new HashSet<Client>();
        set.add(new Client("Lily", "女", sdf.parse("1991-02-21"), "北京", "SAP", "lily@sap.com", "15082301546"));
        set.add(new Client("Lucy", "女", sdf.parse("1992-03-25"), "上海", "SAP", "Lucy@sap.com", "15082385984"));
        set.add(new Client("Keven", "女", sdf.parse("1993-01-11"), "武汉", "SAP", "Keven@sap.com", "15082312345"));
        set.add(new Client("Jacky", "女", sdf.parse("1994-05-22"), "天津", "SAP", "Jacky@sap.com", "15082389547"));
        set.add(new Client("Poly", "女", sdf.parse("1995-06-16"), "北京", "SAP", "Poly@sap.com", "15082385415"));
        set.add(new Client("Hatti", "女", sdf.parse("1996-11-26"), "武汉", "SAP", "Hatti@sap.com", "15082396321"));
        set.add(new Client("Jim", "女", sdf.parse("1997-08-23"), "上海", "SAP", "Jim@sap.com", "15082399999"));
        set.add(new Client("Lilei", "女", sdf.parse("1996-09-29"), "北京", "SAP", "Lilei@sap.com", "15082344444"));
        set.add(new Client("Hanmeimei", "女", sdf.parse("1997-10-18"), "天津", "SAP", "Hanmeimei@sap.com", "15082374120"));
        set.add(new Client("Alex", "女", sdf.parse("1998-11-17"), "武汉", "SAP", "Alex@sap.com", "15082385411"));
        set.add(new Client("Alan", "女", sdf.parse("1998-05-12"), "上海", "SAP", "Alan@sap.com", "15082311115"));
        set.add(new Client("Kate", "女", sdf.parse("1999-03-14"), "天津", "SAP", "Kate@sap.com", "15082399884"));

        for(Client client : set) {
            clientDao.save(client);
        }
    }

}