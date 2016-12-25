package com.master.ash.service.impl;

import com.master.ash.model.Client;
import com.master.ash.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.List;

@Rollback(false)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void save() throws Exception {
        Client client = new Client("Lucy", "女", sdf.parse("1990-12-15"), "Shanghai", "Google", "lucy@google.com", "15082383821");
        clientService.save(client);
    }

    @Test
    public void delete() throws Exception {
        List<Client> clients = clientService.findByName("Lucy");
        for(Client client : clients) {
            clientService.delete(client);
        }
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void findByName() throws Exception {
        List<Client> clients = clientService.findByName("Lucy");
        System.out.println(clients);
    }

    @Test
    public void load() throws Exception {
        List<Client> clients = clientService.load();
        System.out.println(clients);
    }

}