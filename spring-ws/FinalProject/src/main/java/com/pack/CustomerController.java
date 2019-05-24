package com.pack;

import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.form.Customer;
import com.pack.service.CustomerService;

@Controller
public class CustomerController {
	private static Logger logger=Logger.getLogger(CustomerController.class);
	
	
	private CustomerService customerService;
	
	
	@Autowired(required=true)
	@Qualifier(value="customerService")
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	@RequestMapping("/index1")
	public String listCustomer(Map<String,Object> map) 
	{
		logger.info("log customer");
		System.out.println("aswa");
		map.put("customer", new Customer());
		return "customer";
	}
	
	
	@RequestMapping( value="Customer/add", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer")@Validated Customer customer,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors()) 
		{
			logger.info("validation error");
			return "customer";
		}
		else 
		{
			if(null==customer.getId()) 
			{
				Random rand=new Random();
				int num=rand.nextInt(900000)+100000;
				customer.setId(num);
				logger.info("inside add customer");
				customerService.addCustomer(customer);
			}
			else 
			{
				customerService.addCustomer(customer);
			}
			return "redirect:/index1";
		}
	}
	
}
