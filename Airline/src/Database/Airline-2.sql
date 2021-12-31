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
  [No_Fly] int
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

CREATE TABLE [Booking]
(
	[TicketId]	varchar(20) NOT NULL,
	[FlightId] varchar(10) NOT NULL,
	[SeatId] varchar(5) NOT NULL,
	[CNIC] varchar(13) NOT NULL
)
GO
ALTER TABLE Booking
ADD CONSTRAINT PK_Booking PRIMARY KEY (FlightId, SeatId, CNIC);

--============CREATE CONSTRAINTS===========
ALTER TABLE [Booking]
ADD CONSTRAINT [BookingToFlightSeat] FOREIGN KEY ([FlightId],[SeatId]) REFERENCES [Flight_Seats] (FlightId,SeatId) ON DELETE CASCADE
ALTER TABLE [Booking]
ADD CONSTRAINT [BookingToCustomer]	FOREIGN KEY ([CNIC]) REFERENCES [Customer] (CNIC) ON DELETE CASCADE


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

--FLIGHT ABC23
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C4','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C5','Taken')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('ABC23','F15','Vaccant')
GO

--FLIGHT BCD45
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('BCD45','F15','Vaccant')
GO

--FLIGHT CDE25
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('CDE25','F15','Vaccant')
GO

--FLIGHT LMN23
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('LMN23','F15','Vaccant')
GO

--FLIGHT DEF25
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('DEF25','F15','Vaccant')
GO

--FLIGHT EFG25
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('EFG25','F15','Vaccant')
GO

--FLIGHT FGH23
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('FGH23','F15','Vaccant')
GO

--FLIGHT GHI12
GO
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','A15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','B15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','C15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','D15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','E15','Vaccant')
--
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F1','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F2','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F3','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F4','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F5','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F6','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F7','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F8','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F9','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F10','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F11','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F12','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F13','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F14','Vaccant')
INSERT Flight_Seats([FlightId],[SeatId],[Status]) VALUES ('GHI12','F15','Vaccant')
GO


--=============================
INSERT Booking([TicketId],[FlightId], [SeatId], [CNIC]) VALUES ('11110','ABC23', 'C4', '3452815234532')
INSERT Booking([TicketId],[FlightId], [SeatId], [CNIC]) VALUES ('11110','BCD45', 'C4', '3452815234532')
INSERT Booking([TicketId], [FlightId], [SeatId], [CNIC]) VALUES ('11111', 'ABC23', 'C5', '3452815234532')
INSERT Booking([TicketId],[FlightId], [SeatId], [CNIC]) VALUES ('11111','CDE25', 'C5', '3452815234532')
INSERT Booking([TicketId],[FlightId], [SeatId], [CNIC]) VALUES ('11111','DEF25', 'C5', '3452815234532')
INSERT Booking([TicketId],[FlightId], [SeatId], [CNIC]) VALUES ('11111','EFG25', 'C5', '3452815234532')
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
@cnic varchar(13),
@firstname varchar(255),
@lastname varchar(255),
@address varchar(255),
@contact varchar(11),
@nofly	int
AS
	BEGIN
		INSERT into Person Values
		(@firstname,@lastname,@cnic,@address);
	END
	BEGIN
		INSERT into Customer VALUES
		(@cnic,@contact, @nofly);
	END
GO
CREATE PROCEDURE get_customers
AS
	SELECT	*
	FROM	[Person] inner join [Customer] on Person.CNIC = Customer.CNIC
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

CREATE PROCEDURE get_seats
@flightID	varchar(10)
AS
	Select	Flight_Seats.SeatId, Flight_Seats.Status
	FROM	Flight_Seats
	WHERE	Flight_Seats.FlightId = @flightID
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

CREATE PROCEDURE add_booking
@flightId	varchar(10),
@seatId		varchar(5),
@cnic		varchar(13)
AS
	INSERT Booking([FlightId], [SeatId], [CNIC]) VALUES (@flightId, @seatId, @cnic)
GO

CREATE PROCEDURE get_bookings
AS
	SELECT	*
	FROM	Booking
	ORDER BY Booking.TicketId
GO


CREATE PROCEDURE cancel_ticket
@ticket_id varchar(20)
AS
	DELETE FROM Booking Where @ticket_id=Booking.TicketId
GO
--EXEC flight_customers @flightID = 'ABC23';
--drop procedure get_bookings

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