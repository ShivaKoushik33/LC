# Write your MySQL query statement below
-- SELECT (
--   SELECT DISTINCT salary
--   FROM Employee
--   ORDER BY salary DESC
--   LIMIT 1 OFFSET 1
-- ) AS SecondHighestSalary;


-- select salary from Employee as e1 join Employee as e2  on e1.salary>=e2.salary

-- select salary as  SecondHighestSalary from Employee where Secondh=2
with temp as (select salary ,dense_rank() over(order by salary desc )  as rnk from Employee)
select max(salary) as SecondHighestSalary from temp where rnk=2;