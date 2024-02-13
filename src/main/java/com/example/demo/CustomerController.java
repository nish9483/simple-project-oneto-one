package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {


	@Autowired
	private CustomerRepo cr;
	
	
	/*@PostMapping("/customer")
	public ResponseEntity<Customer>saveCustomer(@RequestBody Customer customer)
	{
	Customer c=cr.save(customer);
		return new ResponseEntity<Customer>(c,HttpStatus.CREATED);
	}
	*/
	@GetMapping("/customer")
	public List<Customer>getPageTwo()
	{
		Pageable p=PageRequest.of(0, 3,Sort.by("id").ascending());
		Page<Customer> ma=cr.findAll(p);
		return ma.getContent();
	}
	
	/*@PutMapping("/cu/{id}")
	public ResponseEntity<Customer>updateCustomer(@RequestBody Customer customer,@PathVariable int id)
	{
		Optional<Customer>c=cr.findById(id);
		if(c.isPresent())
		{
			Customer s=c.get();
			s.setName(customer.getName());
			
			Customer k=cr.save(s);
			return new ResponseEntity<Customer>(k,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Customer>(HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/cu/{id}")
	public ResponseEntity<Customer>deleteCustomer(@PathVariable int id)
	{
		Optional<Customer>c=cr.findById(id);
		if(c.isPresent())
		{
			cr.deleteById(id);
			return new ResponseEntity<Customer>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Customer>(HttpStatus.OK);
		
		}
	}*/
	
	

}

