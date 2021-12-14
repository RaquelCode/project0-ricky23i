--DML
insert into pet(id, age, species, description, price, color, breeder, microchipable) values
	(default,60,'Dog','Shiba inu that is full of energy',1800,'Black/Tan','Ricky','1');
	
commit;


--DQL

select * from pet;
--select species from pet;
--select  * from Pet where  species='cat';
--select * from Pet where species='Dog' and color='Cream';