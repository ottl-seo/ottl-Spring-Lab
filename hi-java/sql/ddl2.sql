drop table if exists post CASCADE;
create table post
(
 id bigint generated by default as identity,
 title varchar(255),
 contents varchar(255),
 primary key (id)
);