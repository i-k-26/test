set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb2;
create database logindb2;
use logindb2;

drop table if exists user;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","111"),
(2,"jiro","222"),
(3,"saburo","333");
