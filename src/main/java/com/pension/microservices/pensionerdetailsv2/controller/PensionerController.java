package com.pension.microservices.pensionerdetailsv2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pension.microservices.pensionerdetailsv2.entity.Pensioner;
import com.pension.microservices.pensionerdetailsv2.repository.PensionerRepository;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin("*")
public class PensionerController
{
	@Autowired
	private PensionerRepository pensionerRepository;

	@GetMapping("/pension/test")
	public String check()
	{
		return "It works";
	}

	// Using Pensioner Repository
	@PostMapping("/pension/save-pensioner-details")
    public ResponseEntity<Pensioner> createPensioner(@RequestBody Pensioner pensioner)
    {
		return new ResponseEntity<Pensioner>(pensionerRepository.save(pensioner), HttpStatus.CREATED);
    }

	@GetMapping(value = "/pension/pensioner-details-by-aadhaar/{id}")
	public ResponseEntity<Optional<Pensioner>> getPensionerDetailByAadhaar(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(pensionerRepository.findById(id));
	}
}