drop table if exists role;
drop table if exists user;
drop table if exists user_roles;

create table tbl_user (id bigint not null auto_increment, business_title varchar(255), email varchar(255), name varchar(255), password varchar(255), phone varchar(255), username varchar(255), primary key (id)) type=MyISAM

create table role (id bigint not null auto_increment, description varchar(255), name varchar(255), primary key (id)) engine=MyISAM;

create table user_roles (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id)) engine=MyISAM;


INSERT INTO role (id, description, name) VALUES (4, 'Admin role', 'ADMIN');
INSERT INTO role (id, description, name) VALUES (5, 'User role', 'USER');


INSERT INTO `cts`.`user_roles` (`user_id`, `role_id`) VALUES ('1', '4');
INSERT INTO `cts`.`user_roles` (`user_id`, `role_id`) VALUES ('2', '5');

localhost:8090/users/register

{ 
	"username":"test1234",
	"password":"test1234",
	"email":"test@gmaillcom",
    	"phone":"9944159844",
	"name":"testing",
	"businessTitle":"Mr"
}


localhost:8090/users/authenticate
{ 
	"username":"test1234",
	"password":"test1234"
}

{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0MTIzNCIsInJvbGVzIjoiUk9MRV9VU0VSIiwiaWF0IjoxNjQzMTA0NjQ3LCJleHAiOjE2NDMxMjI2NDd9.uhaHQFQnGgz-JwBbJAcKSCRM8_-lGocQNZL4xvS1Pio"
}


