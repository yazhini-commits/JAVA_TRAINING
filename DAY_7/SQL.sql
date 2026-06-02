CREATE DATABSE employee;CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    age INT CHECK (age >= 18),
    location VARCHAR(50) DEFAULT 'Chennai'
);
INSERT INTO Employee (emp_id, emp_name, email, age, location)
VALUES
(101, 'Rahul', 'rahul@gmail.com', 21, 'Chennai'),
(102, 'Priya', 'priya@gmail.com', 212, 'Coimbatore'),
(103, 'Karthik', 'karthik@gmail.com', 23, 'Madurai'),
(104, 'Ananya', 'ananya@gmail.com', 24, 'Trichy'),
(105, 'Vignesh', 'vignesh@gmail.com', 25, 'Salem');
SELECT * FROM Employee;