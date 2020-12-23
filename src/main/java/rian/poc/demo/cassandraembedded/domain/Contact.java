package rian.poc.demo.cassandraembedded.domain;

import java.util.UUID;

import org.springframework.cassandra.core.Ordering;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "contacts")
public class Contact {

	@PrimaryKeyColumn(name = "contact_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	private UUID id;

}
