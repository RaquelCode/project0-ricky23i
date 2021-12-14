create table pet(
id serial primary key,
age integer not null,
species varchar(25) not null,
description varchar(250) not null,
price integer not null,
color varchar(25) not null,
breeder varchar(30) not null,
microchipable bit not null
);