package rian.poc.demo.cassandraembedded.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import rian.poc.demo.cassandraembedded.domain.Contact;

@Repository
public interface ContactsRepository extends CassandraRepository<Contact> {

}
