CREATE KEYSPACE IF NOT EXISTS "my_keyspace"
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};


CREATE TABLE "my_keyspace"."contacts" (
contact_id uuid,
first_name text,
last_name text,
phone_number text,
PRIMARY KEY(contact_id)
);


INSERT INTO
"my_keyspace"."contacts" (contact_id, first_name, last_name, phone_number)
VALUES (uuid(), 'John', 'Doe', '559912341234');
INSERT INTO
"my_keyspace"."contacts" (contact_id, first_name, last_name)
VALUES (uuid(), 'Mary', 'Jane');
INSERT INTO
"my_keyspace"."contacts" (contact_id, first_name, phone_number)
VALUES (uuid(), 'Will', '441239876543');
