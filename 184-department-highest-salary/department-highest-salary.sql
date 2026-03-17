# Write your MySQL query statement below


select dept as "Department",emp as "Employee",Salary from( 
select e1.name as "emp",d.name as "dept",salary,max(salary) over(partition by departmentId) as sal   from Employee e1 left join Department d on e1.departmentId=d.id) t

where salary=sal ;