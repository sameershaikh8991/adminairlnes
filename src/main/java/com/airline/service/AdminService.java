package com.airline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.Flight;
import com.airline.repository.AdminRepository;



@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Flight saveFlight(Flight flight) {
		
		return adminRepository.save(flight);
	}
	
	public long deleteById(Long id) {
		adminRepository.deleteById(id);
		return id;
    }
//	public Flight updateFlight(Flight flight) {
//		return adminRepository;
//		
//	}
	
	public Optional<Flight> getFlightById(long flightNo) {
		return adminRepository.findById(flightNo);
		
	}
	
	public List<Flight> allFilight(Flight flight) {
		return adminRepository.findAll();
	}
	public Optional<Flight> updateFlightById(Flight flight,Long id) {
		
		return adminRepository.findById(id);
		
    }
	
	
}
