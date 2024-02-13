package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cinema {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String moviename;
	private String seatno;
	
	@OneToOne
	private Customer customer;
	
	Cinema()
	{
		
	}
	
	
	public Cinema( String name, String address, String moviename, String seatno) {
		super();
		
		this.name = name;
		this.address = address;
		this.moviename = moviename;
		this.seatno = seatno;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getSeatno() {
		return seatno;
	}


	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}


	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + ", address=" + address + ", moviename=" + moviename + ", seatno="
				+ seatno + "]";
	}
	
	
	
	

}
