package rian.poc.demo.cassandraembedded;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rian.poc.demo.cassandraembedded.config.CassandraConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CassandraConfig.class)
public class ContactsRepositoryTests {

	@Autowired
	private ContactsRepositoryTests contactsRepositoryTests;

	@BeforeClass
	public static void init() {
		System.out.println("INICIO.....");
	}

	@Test
	public void listAllContactsTest() {
		contactsRepositoryTests.listAllContactsTest();

	}

}
