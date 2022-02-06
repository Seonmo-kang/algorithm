# Write your MySQL query statement below
SELECT e.name as Employee FROM Employee as e, (SELECT * FROM Employee) as tmp 
    WHERE e.managerId=tmp.id AND e.salary>tmp.salary;