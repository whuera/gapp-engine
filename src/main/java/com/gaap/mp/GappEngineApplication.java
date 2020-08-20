package com.gaap.mp;

import com.gaap.mp.repository.AreaRepository;
import com.gaap.mp.repository.EmployeeRepository;
import com.gaap.mp.repository.VotePeriodsRepository;
import com.gaap.mp.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Gapp engine application.
 */
@SpringBootApplication
public class GappEngineApplication {
	/**
	 * The Area repository.
	 */
	@Autowired
	AreaRepository areaRepository;
	/**
	 * The Employee repository.
	 */
	@Autowired
	EmployeeRepository employeeRepository;
	/**
	 * The Vote repository.
	 */
	@Autowired
	VoteRepository voteRepository;
	/**
	 * The Vote periods repository.
	 */
	@Autowired
	VotePeriodsRepository votePeriodsRepository;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(GappEngineApplication.class, args);
	}

}
