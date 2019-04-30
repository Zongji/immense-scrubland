--DROP TABLE IF EXISTS user;

CREATE TABLE user
(
  id BIGINT NOT NULL,
  name VARCHAR(30) NULL DEFAULT NULL,
  age INT NULL DEFAULT NULL,
  email VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (id)
);


create table ticks
(
	id bigserial not null
		constraint ticks_pk
			primary key,
	tick timestamp
)
;

alter table ticks owner to postgres
;

create table anniversary
(
	id serial not null
		constraint table_name_pkey
			primary key,
	title char(100),
	content varchar(1024) not null,
	date_at date,
	creator varchar(50) not null,
	updator varchar(50) not null,
	create_at timestamp default CURRENT_TIMESTAMP,
	update_at timestamp default CURRENT_TIMESTAMP
)
;

alter table anniversary owner to postgres
;

