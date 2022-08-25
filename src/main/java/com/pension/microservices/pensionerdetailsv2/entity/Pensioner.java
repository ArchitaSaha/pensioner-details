package com.pension.microservices.pensionerdetailsv2.entity;

// import java.util.Date;
import java.sql.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Pensioner")
public class Pensioner
{
	@Id
	@Column(name = "aadhaar_Number")
	private String aadhaarNumber;
	@Column(name = "p_Name", nullable = false)
	private String name;
	@Column(name = "dob", nullable = false)
	private Date dob;
	@Column(name = "pan", nullable = false)
	private String pan;
	@Column(name = "salary", nullable = false)
	private long salaryEarned;
	@Column(name = "allowances", nullable = false)
	private long allowances;
	@Column(name = "pension_Type", nullable = false)
	private String pensionType;
	@Column(name = "bank_Type", nullable = false)
	private String bankType;
}