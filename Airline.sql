CREATE DATABASE Airline

GO

USE Airline

GO
 
CREATE TABLE Person(
	[Firstname] [varchar](30)  NULL,
	[LastName] [varchar](30) NULL,
	[CNIC] [char] (13) NOT NULL,
	[Address] [varchar] (80) NULL,
) 
GO
ALTER TABLE Person
ADD CONSTRAINT PK_Person PRIMARY KEY (CNIC);
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Sukhan','Amir','3453819234532','Johartown,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Rana','Muneem','3452815234532','NFC,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Razi','Ahmed','5930219384320','Johartown,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Behzad','Khokhar','3029473829134','Wapda Town,Lahore')


CREATE TABLE Customer(
[Contact] [char] (11) NULL
)
INSERT Customer ([Contact]) VALUES ('29304532910')
INSERT Customer ([Contact]) VALUES ('93043219342')

CREATE TABLE ADMIN(
[Salary] [int] NULL,
[Employementdate] [date] NULL
)
INSERT ADMIN ([Salary],[Employementdate]) VALUES (54000,'2000-04-20')
INSERT ADMIN ([Salary],[Employementdate]) VALUES (400000,'2020-01-19')
INSERT ADMIN ([Salary],[Employementdate]) VALUES (705000,'2007-11-01')

CREATE TABLE FLIGHT(
[FlightID] [int] NOT NULL,
[Source] [varchar](30)  NULL,
[Destination] [varchar](30) NULL,
[Duration] [varchar] (20) NULL,
[Cost] [int] NULL,
[Status] [varchar] (20) NULL,
[Time] [time] NULL
)

ALTER TABLE Flight
ADD CONSTRAINT PK_Fight PRIMARY KEY (FlightID);

INSERT FLIGHT([FlightID],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES (2,'Lahore','Abu Dhabi','2.5 hours',50000,'Delayed','11:00')
INSERT FLIGHT([FlightID],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES (1,'Lahore','Paris','2.5 hours',40000,'On time','23:00')
INSERT FLIGHT([FlightID],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES (3,'Karachi','New York','12 hours',110000,'Cancelled','16:00')



CREATE TABLE Airport(
[Code] [int] NOT NULL,
[Name] [varchar] (30) NULL,
[City] [varchar] (20) NULL,
[Country] [varchar] (20) NULL
)

ALTER TABLE Airport
ADD CONSTRAINT PK_Airport PRIMARY KEY (Code);
INSERT Airport([Code],[Name],[City],[Country]) VALUES (1,'US International','New York','USA')
INSERT Airport([Code],[Name],[City],[Country]) VALUES (2,'Jinnah International','Lahore','Pakistan')
INSERT Airport([Code],[Name],[City],[Country]) VALUES (3,'Doha International','Doha','UAE')

Select * From Person
Select * From Customer
Select * From [ADMIN]
Select * From FLIGHT
Select * from Airport