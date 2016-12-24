package com.master.ash.comtroller;

import com.master.ash.model.Client;
import com.master.ash.service.ClientService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
@RequestMapping("client")
public class ClientController {

    private static final Logger logger = Logger.getLogger(ClientController.class);

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET, value = "load")
    @ResponseBody
    public Set<Client> load() {
        Set<Client> set = clientService.load();
        if(logger.isDebugEnabled()) {
            logger.debug(set);
        }
        return set;
    }

}