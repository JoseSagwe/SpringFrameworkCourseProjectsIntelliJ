create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)

);

create table phone
(
    id bigint not null,
    name varchar(255) not null,
    price bigint not null,
    primary key (id)

);