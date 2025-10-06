mysql> CREATE DATABASE StudentManagement;
Query OK, 1 row affected (0.38 sec)

mysql>--  Create Database
mysql> USE StudentManagement;
Database changed

mysql>-- Create Table - Student
mysql> CREATE TABLE Student (
    ->     StudentID INT PRIMARY KEY,
    ->     FirstName VARCHAR(50),
    ->     LastName VARCHAR(50),
    ->     Age INT,
    ->     Department VARCHAR(50)
    -> );
Query OK, 0 rows affected (0.69 sec)

mysql> --Create Table - Enrollment
mysql> CREATE TABLE Enrollment (
    ->     EnrollmentID INT PRIMARY KEY,
    ->     StudentID INT,
    ->     CourseID VARCHAR(20),
    ->     EnrollmentDate DATE,
    ->     FOREIGN KEY (StudentID) REFERENCES Student(StudentID)
    -> );
Query OK, 0 rows affected (0.50 sec)

mysql> -- ==============================================
mysql> INSERT INTO Student (StudentID, FirstName, LastName, Age, Department)
    -> VALUES
    -> (1, 'Riya', 'Sharma', 20, 'Computer Science'),
    -> (2, 'Amit', 'Patil', 22, 'Information Technology'),
    -> (3, 'Neha', 'Kadam', 21, 'Mechanical'),
    -> (4, 'Rahul', 'Deshmukh', 23, 'Electronics');
Query OK, 4 rows affected (0.26 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Enrollment (EnrollmentID, StudentID, CourseID, EnrollmentDate)
    -> VALUES
    -> (101, 1, 'CS101', '2025-01-10'),
    -> (102, 1, 'CS102', '2025-02-15'),
    -> (103, 2, 'IT201', '2025-03-12'),
    -> (104, 3, 'ME101', '2025-04-20'),
    -> (105, 4, 'EE201', '2025-05-05');
Query OK, 5 rows affected (0.08 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> --  Retrieve All Student and Enrollment Details using INNER JOIN
mysql> SELECT
    ->     s.StudentID,
    ->     s.FirstName,
    ->     s.LastName,
    ->     e.EnrollmentID,
    ->     e.CourseID,
    ->     e.EnrollmentDate
    -> FROM
    ->     Student AS s
    -> INNER JOIN
    ->     Enrollment AS e
    -> ON
    ->     s.StudentID = e.StudentID;
+-----------+-----------+----------+--------------+----------+----------------+
| StudentID | FirstName | LastName | EnrollmentID | CourseID | EnrollmentDate |
+-----------+-----------+----------+--------------+----------+----------------+
|         1 | Riya      | Sharma   |          101 | CS101    | 2025-01-10     |
|         1 | Riya      | Sharma   |          102 | CS102    | 2025-02-15     |
|         2 | Amit      | Patil    |          103 | IT201    | 2025-03-12     |
|         3 | Neha      | Kadam    |          104 | ME101    | 2025-04-20     |
|         4 | Rahul     | Deshmukh |          105 | EE201    | 2025-05-05     |
+-----------+-----------+----------+--------------+----------+----------------+
5 rows in set (0.13 sec)