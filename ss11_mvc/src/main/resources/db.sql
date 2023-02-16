create table class (
                       id int primary key auto_increment,
                       name varchar(50)
);

create table if not exists c1022g1_db.student
(
    id    int auto_increment
    primary key,
    name  varchar(50) null,
    score float       null,
    class_id int,
    foreign key (class_id) references class(id)
    );


insert into class(name) values ('C1022G1');
insert into class(name) values ('C0822G1');

insert into student (name, score, class_id) VALUES ('Anh Thắng', 4.99, 1);
insert into student (name, score, class_id) VALUES ('Anh Kỳ', 4.99, 1);
use c1022g1_db;

select s.id, s.name, s.score, c.name from student s inner join class c on s.class_id = c.id
where s.name like concat('%', ?, '%');