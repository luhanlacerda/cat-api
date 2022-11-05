USE master;
GO

CREATE DATABASE CAT_API_SERVICE;
GO

EXEC sp_configure 'CONTAINED DATABASE AUTHENTICATION', 1
GO

RECONFIGURE
GO

ALTER DATABASE CAT_API_SERVICE SET RESTRICTED_USER WITH ROLLBACK IMMEDIATE;
ALTER DATABASE CAT_API_SERVICE SET containment=partial;
ALTER DATABASE CAT_API_SERVICE SET MULTI_USER;
GO

USE CAT_API_SERVICE;
GO

CREATE LOGIN CAT_API_APP_USER WITH PASSWORD = 'C@t-@p1-S3rv1c3';
GO

CREATE USER CAT_API_APP_USER FOR LOGIN CAT_API_APP_USER;
GO

GRANT VIEW DEFINITION ON SCHEMA :: dbo TO CAT_API_APP_USER;
GRANT CREATE TABLE ON DATABASE :: CAT_API_SERVICE TO CAT_API_APP_USER;
GRANT CONTROL ON DATABASE :: CAT_API_SERVICE TO CAT_API_APP_USER;
GO