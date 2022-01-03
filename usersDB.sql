create table roles(
code varchar(10) primary key not null,
name varchar(255) not null
);

create table users(
username varchar(255) primary key not null,
password varchar(255) not null,
address varchar(255) not null,
enabled int not null);

create table users_roles(
username varchar(255) not null,
role_code varchar(10) not null,
primary key(username,role_code));

ALTER TABLE `users_roles` ADD FOREIGN KEY (`username`) REFERENCES `users` (`username`);
ALTER TABLE `users_roles` ADD FOREIGN KEY (`role_code`) REFERENCES `roles` (`code`);

insert into users(username, password, address, enabled)
values('admin99','123456','Ha Noi',1),
('user01','123456','Da Nang',1),
('user02','123456','Bac Ninh',1),
('user03','123456','Lao Cai',1);

insert into roles(code, name)
values('AD1','ROLE_ADMIN'),
('US1','ROLE_USER');

insert into users_roles(username,role_code)
values('admin99','AD1'),
('user01','US1'),
('user02','US1'),
('user03','US1');