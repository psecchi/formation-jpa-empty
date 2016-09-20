package com.proxiad.formation.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;

@DatabaseSetup("classpath:data/client.xml")
@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = "classpath:data/client.xml")
public class ClientRepositoryTest extends AbstractRepositoryTest {

	@Autowired
	private ClientRepository clientRepository;

}
