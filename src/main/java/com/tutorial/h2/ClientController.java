package com.tutorial.h2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;
    
    @RequestMapping("/getAll")
    public String getAll(Model model) {
    	List<Client> clients = clientService.getAll();
    	model.addAttribute("clients", clients);
    	return "clients";
    }
    
    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Client> getOne(Long code) {
    	return clientService.getOne(code);
    }
    
    @PostMapping("/addNew")
    @ResponseBody
    public String addNew(Client client) {
    	clientService.addNew(client);
    	return "redirect:/clients/getAll";
    }
    
    @RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
    	clientService.update(client);
		return "redirect:/clients/getAll";		
	}
	
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Long code) {
		clientService.delete(code);
		return "redirect:/clients/getAll";		
	}
    
    
    
	/*
	 * @GetMapping("/clients") private List<Client> getAllClients() { return
	 * clientService.getAllClients(); }
	 * 
	 * @GetMapping("/clients/{code}") private Client getClient(@PathVariable("code")
	 * Long code) { return clientService.getClientById(code); }
	 * 
	 * @DeleteMapping("/clients/{code}") private void
	 * deletePerson(@PathVariable("code") Long code) { clientService.delete(code); }
	 * 
	 * @PostMapping("/clients") private Long savePerson(@RequestBody Client client)
	 * { clientService.saveOrUpdate(client); return client.getCode(); }
	 */
}