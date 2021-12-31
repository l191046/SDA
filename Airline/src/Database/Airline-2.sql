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
	[SeatId] varchar(5) NOT NULL,
	[Status] varchar(30)
)
GO
ALTER TABLE Flight_Seats
ADD CONSTRAINT PK_Seats PRIMARY KEY (FlightId,SeatId);

CREATE TABLE [Ticket]
(
[TicketId] int NOT NULL,
[CNIC] varchar(13) NOT NULL

)
GO
ALTER TABLE Ticket
ADD CONSTRAINT PK_Ticket PRIMARY KEY (TicketId,CNIC);

CREATE TABLE [FlightTicket]
(
[TicketId] int NOT NULL,
[FlightId] varchar(10) NOT NULL

)
GO
ALTER TABLE FlightTicket
ADD CONSTRAINT PK_FlightTicket PRIMARY KEY (TicketId,FlightID);

--============CREATE CONSTRAINTS===========
ALTER TABLE [Flight_Seats]
ADD CONSTRAINT [Flighttoseat] FOREIGN KEY ([FlightId]) REFERENCES [Flight] ([FlightID]) ON DELETE CASCADE
GO
ALTER TABLE [Customer] ADD CONSTRAINT [PersonToCustomerRef] FOREIGN KEY ([CNIC]) REFERENCES [Person] ([CNIC])
GO
ALTER TABLE [Admin] ADD CONSTRAINT [PersonToAdminRef] FOREIGN KEY ([CNIC]) REFERENCES [Person] ([CNIC])
GO
ALTER TABLE [Ticket] ADD CONSTRAINT [Tickettocust] FOREIGN KEY ([CNIC]) REFERENCES [Customer] ([CNIC])
GO
ALTER TABLE [FlightTicket] ADD CONSTRAINT [Tickettoflight] FOREIGN KEY ([FlightId]) REFERENCES [Flight] ([FlightId])
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

INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('ABC23','US1','PK35','03:00',50000,'On time','11:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('BCD45','PK35','DO60','03:00',40000,'On time','15:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('CDE25','PK35','MCT30','2:00',110000,'On time','16:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('LMN23','US1','LND21','02:30',50000,'On time','16:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('DEF25','MCT30','LND21','1:00',110000,'On time','19:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('EFG25','LND21','DO60','1:00',110000,'On time','21:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('FGH23','US1','SK32','02:30',50000,'On time','11:00')
INSERT Flight([FlightId],[Source],[Destination],[Duration],[Cost],[Status],[Time]) VALUES ('GHI12','SK32','DO60','02:30',50000,'On time','16:00')

INSERT Airport([Code],[Name],[City],[Country]) VALUES ('US1','US International','New York','USA')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('PK35','Jinnah International','Lahore','Pakistan')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('DO60','Doha International','Doha','UAE')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('MCT30','Muscat International','Muscat','Australia')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('LND21','London Airport','London','England')
INSERT Airport([Code],[Name],[City],[Country]) VALUES ('SK32','Skardu Airport','Skardu','Pakistan')

INSERT Flight_Seats ([FlightId],[SeatId],[Status]) VALUES ('ABC23','E1','Vaccant')
INSERT Flight_Seats ([FlightId],[SeatId],[Status]) VALUES ('FGH23','A10','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B2','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D8','Vacant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F9','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C15','Vacant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C4','Taken')

--Inserted by behzad for testing
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C4','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C5','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A1','Taken')

INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C4','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B5','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B1','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B3','Taken')

--=============================
INSERT Ticket([TicketId],[CNIC]) VALUES (1,'3452815234532')
INSERT Ticket([TicketId],[CNIC]) VALUES (2,'3453819234532')

INSERT FlightTicket([TicketId],[FlightId]) VALUES (2,'ABC23')
INSERT FlightTicket([TicketId],[FlightId]) VALUES (2,'CDE25')
INSERT FlightTicket([TicketId],[FlightId]) VALUES (2,'DEF25')
INSERT FlightTicket([TicketId],[FlightId]) VALUES (2,'EFG25')

INSERT FlightTicket([TicketId],[FlightId]) VALUES (1,'ABC23')
INSERT FlightTicket([TicketId],[FlightId]) VALUES (1,'BCD45')


--===========STORED PROCEDURES==========================


--===========CUSTOMER===============
GO
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
		(@cnic,@contact,0)
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

CREATE PROCEDURE flight_customers
@flightID	varchar(10)

AS
	SELECT	[Ticket].CNIC, [Person].FirstName, [Person].LastName,
			[Person].[Address], Customer.Contact
	FROM	Ticket
			inner join FlightTicket on Ticket.TicketID = FlightTicket.TicketId
			inner join Person on Ticket.CNIC = Person.CNIC
			inner join Customer on Ticket.CNIC = Customer.CNIC
	WHERE	FlightTicket.FlightId = @flightID
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
CREATE PROCEDURE add_customer_nofly
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

CREATE PROCEDURE add_customer_0
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
(@cnic,@contact,0)
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

--===========BOOKING===============
Create procedure check_seat
@flightId varchar(10),
@seatId varchar(5),
@taken int output
AS
IF EXISTS
(
	Select *
	FROM [Flight_Seats]
	WHERE 'Taken'=
	(
		Select [Flight_Seats].[Status]
		From Flight_Seats
		Where (FlightId=@flightId) AND (SeatId=@seatId)
	)
  )
  SET @taken =1
  ELSE
  SET @taken=0
GO

Create procedure create_ticket
@ticketid int,
@cnic varchar(13)
AS
Insert into [Ticket] values
(@ticketid,@cnic)
GO

Create procedure create_flighticket
@ticketid int,
@flightid varchar(10)
AS
Insert into [Ticket] values
(@ticketid,@flightid)
GO

Create procedure recent_ticket
AS
Select MAX([Ticket].[ticketId])
FROM [Ticket]


--EXEC flight_customers @flightID = 'ABC23';
--drop procedure flight_customers

/*
drop proc book_seat
Create procedure book_seat
@cnic varchar(13),
@flightId varchar(10),
@seatId varchar(5)
AS
BEGIN
	INSERT INTO Ticket VALUES
	(@cnic,@flightId,@seatId)
END
BEGIN
	UPDATE [Flight_Seats]
	SET [Status]='Taken'
	WHERE [FlightId]=@flightId AND [SeatId]=@seatId
END
GO
Create procedure book_seat
@flightId varchar(10),
@seatId varchar(5)
AS
BEGIN
	INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES (@flightId,@seatId,'Taken')
END
GO
*/
--drop procedure add_flight;
select * from Person;
select * from Admin;
select * from Customer;
select * from Flight;
select * from Flight_Seats;
select * from Airport;
select * from Ticket