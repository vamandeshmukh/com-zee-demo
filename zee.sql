select * from employee;

insert into employee (employee_id, first_name, salary) values (101, 'Sonu', 50000);
insert into employee (employee_id, first_name, salary) values (102, 'Monu', 60000);
insert into employee (employee_id, first_name, salary) values (103, 'Tonu', 40000);
insert into employee (employee_id, first_name, salary) values (104, 'Ponu', 70000);
insert into employee (employee_id, first_name, salary) values (105, 'Gonu', 80000);

rollback;
commit; 
