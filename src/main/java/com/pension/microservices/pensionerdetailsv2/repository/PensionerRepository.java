package com.pension.microservices.pensionerdetailsv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pension.microservices.pensionerdetailsv2.entity.Pensioner;

public interface PensionerRepository extends JpaRepository<Pensioner,String>
{
	Pensioner getDetailsByAadhaarNumber(String aadhaarNumber);
}