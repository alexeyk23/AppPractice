create table "User_Role"  (
    "Id_user" int  not null,
    "Role_id" int  not null
  );

create table "Role"  (
    "Role_id" int autoinc unique,
    "Role_Name" varchar (50)
  );

create table "User"  (
    "Id_user" int  autoinc unique not null,
    "Name" varchar (50),
    "Surname" varchar (50),
    "mail" varchar (50),
    "data_reg" date default to_date('00.00.0000', 'dd.dd.yyyy'),
    "Div_id" int
  );
create index "Div_id" on "SYSTEM"."User";

create table "Privileges"  (
    "Privileges_id" int  autoinc unique,
    "Application_id" int not null,
    "Priv_Name" varchar (50)
  );
create index "Application_id" on "SYSTEM"."Privileges";

create table "Role_Privileges"  (
    "Privileges_id" int,
    "Role_id" int 
  );

create table "Application"  (
    "Application_id" int autoinc unique not null,
    "App_name" varchar (50)
  );

create table "Company"  (
    "Company_id" int unique not null,
    "Com_name" varchar (50)
  );

create table "Division"  (
    "Company_id" int not null,
    "Div_name" varchar (50),
    "Div_id" int unique not null
  );
  alter table "User_Role" add foreign key ("Id_user") references "User"("Id_user");
alter table "User_Role" add foreign key ("Role_id") references "Role"("Role_id");
  
  alter table "Role" add primary key("Role_id");


alter table "User" add primary key("Id_user");
alter table "User" add foreign key ("Div_id") references "Division"("Div_id");
  
  alter table "Privileges" add primary key("Privileges_id");
alter table "Privileges" add foreign key ("Application_id") references "Application"("Application_id");

alter table "Role_Privileges" add foreign key ("Privileges_id") references "Privileges"("Privileges_id");
alter table "Role_Privileges" add foreign key ("Role_id") references "Role"("Role_id");
  
  alter table "Application" add primary key("Application_id");
  
  alter table "Company" add primary key("Company_id");
  
alter table "Division" add primary key("Div_id");
alter table "Division" add foreign key ("Company_id") references "Company"("Company_id");
