package com.master.ash.comtroller;

import com.master.ash.model.Client;
import com.master.ash.service.ClientService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("client")
public class ClientController {

    private static final Logger logger = Logger.getLogger(ClientController.class);

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET, value = "load")
    @ResponseBody
    public List<Client> load() {
        List<Client> list = clientService.load();
        if(logger.isDebugEnabled()) {
            logger.debug(list);
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.POST, value = "delete")
    @ResponseBody
    public boolean delete(Client client) {
        try {
            clientService.delete(client);
        } catch (Throwable t) {
            logger.error("Error in deleting client", t);
        }
        return true;
    }

}