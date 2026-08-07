# Write your MySQL query statement below
select  Max(salary) as SecondHighestSalary from employee where( salary NOT IN(select MAX(salary) from Employee));