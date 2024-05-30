-- 1) Display the name, product line, and buy price of all products.
-- The output columns should display as: “Name,” “Product Line,” and “Buy Price.” 
-- The output should display the most expensive items first. 

select product_name as Name,pl.product_line as Product_Line , p.buy_price as Buy_Price   
from products p,productlines pl
where p.productline_id = pl.id
order by Buy_Price desc;

-- 2) Display the first name, last name, and city name of all customers from Germany. 
-- The output columns should display as: “First Name,” “Last Name,” and “City.” 
-- The output should be sorted by “Last Name” (ascending).

select contact_firstname as First_Name,contact_lastname as Last_Name,city as City
 from customers
 where country = 'Germany';
 
-- 3) Display each of the unique values of the status field in the orders table.
-- The output should be sorted alphabetically, ascending.
select distinct status from orders
order by status;

-- Display all fields from the payments table for payments made on or after January 1, 2005. 
-- The output should be sorted by the payment date from highest to lowest.

select * from payments
where payment_date> '2005-01-01'
order by payment_date desc;

-- 5) Display the last Name, first Name, email address,
-- and job title of all employees working out of the San Francisco office. 
-- The output should be sorted by “Last Name.”

select e.lastname as Last_Name, e.firstname as First_Name, e.email as Email, e.job_title as Job_Title
from offices o, employees e
where e.office_id = o.id and o.city ='San Francisco'
order by Last_Name;

-- Display the name, product line, scale, and vendor of all of the car products
-- – both classic and vintage. The output should display all vintage cars first (sorted alphabetically by name),
 -- and all classic cars last (also sorted alphabetically by name).
 select * from productlines;
 
select product_name as Name,pl.product_line as Product_Line , p.product_scale,p.product_vendor   
from products p,productlines pl
where p.productline_id = pl.id and (pl.id =1 or pl.id = 7)
order by product_line desc,Name;