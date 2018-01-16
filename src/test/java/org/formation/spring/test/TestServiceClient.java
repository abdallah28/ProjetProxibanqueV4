package org.formation.spring.test;

import static org.junit.Assert.*;
import org.formation.spring.service.IServiceClient;
import org.formation.spring.service.ServiceClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceClient.class)
public class TestServiceClient {

	@Autowired
	private IServiceClient serviceClient;

	@Test
	public void testListClients() {
		assertNotNull(serviceClient);
		
	}

	@Test
	public void testDeleteClient(int idClient) {
		assertNotNull(serviceClient);
		
	}

}
