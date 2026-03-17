# Write your MySQL query statement below

select Department,Employee,Salary from(
select e1.name as "Employee",salary,d.name as "Department",
 dense_rank() over(partition by departmentId order by salary desc) as rnk
  from 
  Employee e1 join Department d 
  on e1.departmentId=d.id) t


  where rnk<=3
  
  
  ;