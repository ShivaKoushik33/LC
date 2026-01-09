# Write your MySQL query statement below
select e1.name as Employee from Employee as e1 left join Employee as e2 on e2.id=e1.managerId and e1.managerId is not null where e1.salary>e2.salary; 