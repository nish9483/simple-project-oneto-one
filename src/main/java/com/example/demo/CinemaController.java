package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
public class CinemaController {
	
	@Autowired
	private CinemaRepo cinemaRepo;
	
	
	@PostMapping("/ci")
	public ResponseEntity<Cinema>saveCinema(@RequestBody Cinema cinema)
	{
		Cinema c=cinemaRepo.save(cinema);
		return new ResponseEntity<Cinema>(c,HttpStatus.CREATED);
	}
	
	/*@GetMapping("/ci")
	public List<Cinema>getPageOne()
	{
		Pageable p=PageRequest.of(0, 3,Sort.by("id").ascending());
		Page<Cinema> ma=cinemaRepo.findAll(p);
		return ma.getContent();
	}
	
	@PutMapping("/ci/{id}")
	public ResponseEntity<Cinema>updateCinema(@RequestBody Cinema cinema,@PathVariable int id)
	{
		Optional<Cinema>c=cinemaRepo.findById(id);
		if(c.isPresent())
		{
			Cinema s=c.get();
			s.setName(cinema.getName());
			s.setAddress(cinema.getAddress());
			s.setMoviename(cinema.getMoviename());
			s.setSeatno(cinema.getSeatno());
			Cinema k=cinemaRepo.save(s);
			return new ResponseEntity<Cinema>(k,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Cinema>(HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/ci/{id}")
	public ResponseEntity<Cinema>deleteCinema(@PathVariable int id)
	{
		Optional<Cinema>c=cinemaRepo.findById(id);
		if(c.isPresent())
		{
			cinemaRepo.deleteById(id);
			return new ResponseEntity<Cinema>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Cinema>(HttpStatus.OK);
		
		}
	}*/
	
	

}
