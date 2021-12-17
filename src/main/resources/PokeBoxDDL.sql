--create schema poke_box;
create table if not exists trainer(
	username varchar(50) primary key not null UNIQUE,
	t_name varchar(50) not null,
	lv integer , --will be set in java if null is sent
	t_age integer not null
);
create table if not exists pokemon(
	id serial primary key,
	p_name varchar(50) not null,
	p_type varchar(50) not null,
	hp integer not null,
	p_exp integer not null,
	lv integer not null,
	item varchar(50),
	trainer varchar(50) not null
);

