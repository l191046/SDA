USE master
GO
drop database SDA
GO
CREATE DATABASE SDA
GO
USE SDA
GO

--============CREATE TABLES===========
CREATE TABLE [Person] (
  [FirstName] nvarchar(255),
  [LastName] nvarchar(255),
  [CNIC] varchar(13) NOT NULL,
  [Address] nvarchar(255)
)
GO
ALTER TABLE Person
ADD CONSTRAINT PK_Person PRIMARY KEY (CNIC);

CREATE TABLE [Customer] (
  [CNIC] varchar(13) NOT NULL,
  [Contact] char(11),
  [No_Fly] BIT
)
GO
ALTER TABLE Customer
ADD CONSTRAINT PK_Customer PRIMARY KEY (CNIC);

CREATE TABLE [Admin] (
  [CNIC] varchar(13) NOT NULL ,
  [EmploymentDate] date,
  [Salary] float,
  [Username] varchar(30),
  [Password] varchar(20)
)
GO
ALTER TABLE Admin
ADD CONSTRAINT PK_Admin PRIMARY KEY (CNIC);

CREATE TABLE [Flight] (
  [FlightId] varchar(10)  NOT NULL ,
  [Source] varchar(30) NOT NULL,
  [Destination] varchar(30),
  [Duration] time,
  [Cost] int,
  [Status] varchar(20),
  [Time] datetime
)
GO
ALTER TABLE Flight
ADD CONSTRAINT PK_Flight PRIMARY KEY (FlightId);

CREATE TABLE [Airport] (
  [Code] varchar(30) NOT NULL ,
  [Name] varchar(30),
  [City] varchar(20),
  [Country] varchar(20)
)
GO
ALTER TABLE Airport
ADD CONSTRAINT PK_Airport PRIMARY KEY (Code);
CREATE TABLE [Flight_Seats]
(
[FlightId] varchar(10) NOT NULL,
[SeatId] int NOT NULL,
[Status] varchar(30)
)
GO

--============CREATE CONSTRAINTS===========
ALTER TABLE Flight_Seats
ADD CONSTRAINT PK_Seats PRIMARY KEY (FlightId,SeatId);
ALTER TABLE [Flight_Seats]
ADD CONSTRAINT [Flighttoseat] FOREIGN KEY ([FlightId]) REFERENCES [Flight] ([FlightID]) ON DELETE CASCADE
GO
ALTER TABLE [Customer] ADD CONSTRAINT [PersonToCustomerRef] FOREIGN KEY ([CNIC]) REFERENCES [Person] ([CNIC])
GO
ALTER TABLE [Admin] ADD CONSTRAINT [PersonToAdminRef] FOREIGN KEY ([CNIC]) REFERENCES [Person] ([CNIC])
GO

--=============POPULATE MOCK VALUES===========
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Sukhan','Amir','3453819234532','Johartown,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Rana','Muneem','3452815234532','NFC,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Razi','Ahmed','5930219384320','Johartown,Lahore')
INSERT Person([Firstname], [LastName], [CNIC], [Address]) VALUES ('Behzad','Khokhar','3029473829134','Wapda Town,Lahore')

INSERT Customer ([CNIC],Contact, No_Fly) VALUES ('3453819234532','29304532910', 1)
INSERT Customer ([CNIC],Contact, No_Fly) VALUES ('3452815234532','93043219342', 0)

INSERT ADMIN ([CNIC],[Username],[Password],[Salary],[EmploymentDate]) VALUES ('3453819234532','sukhanamir','crunchyroll',54000,'2000-04-20')
INSERT ADMIN ([CNIC],[Username],[Password],[Salary],[EmploymentDate]) VALUES ('3452815234532','admin','admin',400000,'2020-01-19')

INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('LHE23','US1','DO60','02:30',50000,'On time','11:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('LHE45','PK35','DO60','02:30',40000,'On time','23:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('KHI25','PK35','US1','12:00',110000,'Cancelled','16:00')

INSERT Airport([Code],[Name],[City],[Country]) VALUES ('US1','US International','New York','USA')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('PK35','Jinnah International','Lahore','Pakistan')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('DO60','Doha International','Doha','UAE')

INSERT Flight_Seats ([FlightId],[SeatId],[Status]) VALUES ('LHE23',30,'Vaccant')
INSERT Flight_Seats ([FlightId],[SeatId],[Status]) VALUES ('KHI25',45,'Taken')
GO

--===========STORED PROCEDURES==========================

--===========CUSTOMER===============
Create PROCEDURE search_customer
@cnic		varchar(13),
@found		int output
AS
BEGIN
IF	EXISTS (
		   SELECT	*
		   FROM		Customer
		   WHERE	Customer.CNIC=@cnic
		   )
	SET @found = 1
ELSE
	SET @found = 0
END
GO
--===========ADMIN==================
CREATE PROCEDURE admin_signin
@username	varchar(20),
@password	varchar(20)
AS
	SELECT	[Person].FirstName, [Person].LastName, [Person].CNIC,
			[Person].Address, [Admin].EmploymentDate, [Admin].Salary
	FROM	[Admin] inner join [Person] on [Admin].CNIC = [Person].CNIC
	WHERE	[Admin].Username = @username AND [Admin].Password = @password
GO
CREATE PROCEDURE edit_admin
@fname	varchar(20),
@lname	varchar(20),
@address	nvarchar(255),
@cnic	char(13)
AS
	UPDATE	[Person]
	SET		FirstName = @fname,
			LastName = @lname,
			[Address]=@address
	WHERE	CNIC = @cnic
GO
--===========FLIGHTS================
CREATE PROCEDURE get_flights
AS
	SELECT	Flight.FlightId, Flight.[Source] as [From], Flight.[Destination] as [To],
			Flight.[Time],  Flight.Duration, Flight.[Status], Flight.Cost
	FROM	Flight
GO
CREATE PROCEDURE delete_flight
@flightid	 varchar(10)  
AS
	DELETE 
	FROM	 Flight
	WHERE	 Flight.FlightId=@flightid
GO

CREATE PROCEDURE add_flight
@flightID	varchar(10),
@source		varchar(30),
@destination	varchar(30),
@duration	time,
@cost		int,
@status		varchar(20),
@dDate		date,
@dTime		time
AS
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time])
VALUES (@flightID,@source, @destination, @duration, @cost, @status, cast(@dDate as datetime) + cast(@dTime as datetime))
GO
CREATE PROCEDURE update_status
@flightID	varchar(10),
@status		varchar(20)
AS
	UPDATE	[Flight]
	SET		[Status] = @status
	WHERE	FlightId = @flightID
GO

--===========NO FLY=================
CREATE PROCEDURE get_nofly
AS
	SELECT	[Person].FirstName, [Person].LastName, [Person].CNIC,
			[Person].[Address], [Customer].Contact
	FROM	[Customer] inner join [Person] on [Customer].CNIC = [Person].CNIC
	WHERE	[Customer].[No_Fly]=1
GO
CREATE PROCEDURE Add_nofly
@cnic	varchar(13)
AS
	UPDATE	[Customer]
	SET		Customer.No_Fly=1
	WHERE	CNIC = @cnic
GO
CREATE PROCEDURE Remove_nofly
@cnic	varchar(13)
AS
	UPDATE	[Customer]
	SET		Customer.No_Fly=0
	WHERE	CNIC = @cnic
GO
--add customer directly to nofly
CREATE PROCEDURE add_customer
@cnic	varchar(13),
@contact	char(11),
@fname		nvarchar(255),
@lname		nvarchar(255),
@address	varchar(255)

AS
BEGIN
INSERT INTO Person VALUES
(@fname,@lname,@cnic,@address)

END
BEGIN 
INSERT INTO Customer VALUES
(@cnic,@contact,1)
END
GO
--===========AIRPORT===============
CREATE PROCEDURE get_airport_list
AS
	SELECT*
	FROM [Airport]
GO
CREATE PROCEDURE get_airport
@airport varchar(20)
AS
	SELECT*
	FROM [Airport]
	WHERE [Airport].Code = @airport
GO


--drop procedure add_flight;
--EXEC admin_signin @username = 'abdulmuneem', @password = 'dancingfajita';

select * from Person;
select * from Admin;
select * from Customer;
select * from Flight;
select * from Flight_Seats;
select * from Airport;
