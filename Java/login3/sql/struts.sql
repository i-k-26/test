set names utf8;
set foreign_key_checks = 0;
drop database if exists login3;
create database login3;
use login3;

drop table if exists user;

create table user(
number int,
login_id varchar(16),
login_pass varchar(16)
);

insert into user values
(1,"taro","111"),
(2,"jiro","222"),
(3,"saburo","333");