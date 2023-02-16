create database demo;
use demo;
create table users (
id int primary key auto_increment,
name varchar(55) not null,
email varchar(55) not null,
country varchar(55)
);
insert into users  (name,email,country) values ('Nghia', 'abc', 'bcd'), ('Phong', 'abc', 'bcd'), ('Truong', 'abc', 'bcd');
select * from users;	