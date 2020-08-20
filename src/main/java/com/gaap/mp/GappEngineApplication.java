package com.gaap.mp;

import com.gaap.mp.repository.AreaRepository;
import com.gaap.mp.repository.EmployeeRepository;
import com.gaap.mp.repository.VotePeriodsRepository;
import com.gaap.mp.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GappEngineApplication {
	@Autowired
	AreaRepository areaRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	VoteRepository voteRepository;
	@Autowired
	VotePeriodsRepository votePeriodsRepository;
	public static void main(String[] args) {
		SpringApplication.run(GappEngineApplication.class, args);
	}

}
