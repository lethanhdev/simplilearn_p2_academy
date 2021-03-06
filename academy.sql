drop   database academydb;
create database academydb;
use    academydb;

CREATE TABLE `instructor` (
   `id` int(3) NOT NULL auto_increment,
   `firstName` varchar(20) DEFAULT NULL,
   `lastName` varchar(20) DEFAULT NULL,
   `username` varchar(250) DEFAULT NULL,
   `password` varchar(20) DEFAULT NULL,
   `address` varchar(45) DEFAULT NULL,
   `contact` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE `student` (
   `id` int(3) NOT NULL auto_increment,
   `firstName` varchar(20) DEFAULT NULL,
   `lastName` varchar(20) DEFAULT NULL,
   `username` varchar(250) DEFAULT NULL,
   `password` varchar(20) DEFAULT NULL,
   `address` varchar(45) DEFAULT NULL,
   `contact` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE `class` (
   `id` int(3) NOT NULL auto_increment,
   `className` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE `subject` (
   `id` int(3) NOT NULL auto_increment,
   `subjectName` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE `teach` (
   `id` int(3) NOT NULL auto_increment,
   `instructorName` varchar(20) DEFAULT NULL,
   `className` varchar(20) DEFAULT NULL,
   `subjectName` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`id`)

);

CREATE TABLE `learn` (
   `id` int(3) NOT NULL auto_increment,
   `studentName` varchar(20) DEFAULT NULL,
   `className` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

insert into instructor (firstName, lastName) values ('John', 'Doe');
insert into instructor (firstName, lastName) values ('Mary', 'Jane');
insert into instructor (firstName, lastName) values ('Tony', 'Barry');
insert into student (firstName, lastName) values ('Hanna', 'Chang');
insert into student (firstName, lastName) values ('Ada', 'Smith');
insert into student (firstName, lastName) values ('Amber', 'Lee');
insert into class (className) values ('Math');
insert into class (className) values ('Science');
insert into class (className) values ('Computer');
insert into subject (subjectName) values ('Algebra');
insert into subject (subjectName) values ('Physics');
insert into subject (subjectName) values ('Data Structure');
insert into teach (instructorName, className, subjectName) values ('John', 'Math', 'Algebra');
insert into teach (instructorName, className, subjectName) values ('Mary', 'Science', 'Computer');
insert into teach (instructorName, className, subjectName) values ('Tony', 'Computer', 'Data Structure');
insert into learn (studentName, className) values ('Ada', 'Computer');
insert into learn (studentName, className) values ('Amber', 'Art');
SELECT * FROM academydb.instructor;
SELECT * FROM academydb.student;
SELECT * FROM academydb.class;
SELECT * FROM academydb.subject;
SELECT * FROM academydb.teach;
SELECT * FROM academydb.learn;
SELECT instructorName, instructor.lastName, className, subjectName from teach left join instructor on teach.instructorName=instructor.firstName;
SELECT studentName, student.lastName, className from learn left join student on learn.studentName=student.firstName;
