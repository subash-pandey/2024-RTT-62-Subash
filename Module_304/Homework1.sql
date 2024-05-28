---- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line

select productline_id,  pl.product_line,count(productline_id) 
from products p, productlines pl
where p.productline_id = pl.id
group by productline_id;


-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name

select e.id as employee_id, e.firstname as employee_first_name, e.lastname as employee_last_name,c.contact_firstname,c.contact_lastname
from customers c ,employees e
where e.id = c.sales_rep_employee_id
order by e.id;

-- question 0.3
-- I want to see a list of employees in each office.   Show the office name and the employee name
select o.id, o.city,e.firstname,e.lastname
from employees e,offices o 
where e.office_id = o.id;

-- question 0.4
-- I want to see the totaly number of each employee type based on job title.. result should the job title and the number of employess with that job title.
select  job_title, count(job_title)
from employees
group by job_title;

-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending
select c.customer_name,sum(od.quantity_ordered*od.price_each) as total_cost_price
from orderdetails od, orders o, customers c
where c.id = o.customer_id and o.id = od.order_id
group by c.customer_name
order by c.customer_name;

select c.customer_name,sum(od.quantity_ordered*od.price_each) as total_cost_price
from orderdetails od, orders o, customers c
where c.id = o.customer_id and o.id = od.order_id
group by c.customer_name
order by total_cost_price desc;


-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
select * from products where id not in ( select product_id from orderdetails ); 

-- question 0.7
-- are there any customers that have never made an order
select * from customers where id not in (select customer_id from orders);

-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.
select o.city, count(c.id) as customer_handled
from customers c, employees e , offices o 
where e.id = c.sales_rep_employee_id and e.office_id = o.id
group by o.city;


-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSRP - buy_price) 
select product_name,buy_price,msrp, msrp-buy_price as margin
from products
order by margin desc;

-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 

select customer_name,country, state, total_margin, ranking
from(
select c.customer_name,c.state,c.country, sum( (p.msrp - buy_price) *od.price_each)as total_margin,
rank() over(partition by c.state order by sum( (p.msrp - buy_price) *od.price_each)desc) as ranking
from customers c,orders o, orderdetails od, products p
where c.id = o.customer_id and o.id = od.order_id and od.product_id = p.id and c.state is not null 
group by c.state,c.customer_name,c.country) as ranked_customers
where
ranking<=5;


-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold

select firstname, lastname, total_sales
from(
select e.firstname,e.lastname, sum(od.price_each*od.quantity_ordered) as total_sales
from employees e, customers c, orders o , orderdetails od
where e.id = c.sales_rep_employee_id and c.id = o.customer_id and o.id = od.order_id
group by e.firstname,e.lastname
order by total_sales desc) as employee_ranking
limit 5;

-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)

select e.firstname,e.lastname,sum( (p.msrp - buy_price) *od.price_each) as total_margin
from employees e, customers c , orders o, orderdetails od, products p
where e.id = c.sales_rep_employee_id and c.id = o.customer_id and o.id = od.order_id and p.id = od.product_id
group by e.firstname,e.lastname
order by total_margin desc
LIMIT 5;

-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004
select *
from orders
where year(order_date) =2004;

-- Question 6
-- I want to see the total amount of all orders grouped by the year
select year(order_date) ,sum(od.price_each*od.quantity_ordered) as total_amount_sales
from orders o , orderdetails od
where o.id = od.order_id
group by year(order_date);

-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders
select  p.product_name  ,sum(quantity_ordered) as quantity_sold
from products p, orderdetails od
where p.id = od.product_id
group by p.product_name
order by quantity_sold desc
limit  5;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.
select  p.id,p.product_name, sum(quantity_ordered) as total_quantity_ordered
from products p, orderdetails od, orders o 
where p.id = od.product_id and o.id = od.order_id
group by p.id,p.product_name
order by p.id;

-- question 7.6
-- how many products would be out of stock based on the amount sold acrosss item.  -- not sure if the data will support this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
select p.product_name,sum(od.quantity_ordered) as ordered , sum(p.quantity_in_stock)as in_stock
from orderdetails od join products p
ON od.product_id = p.id
group by p.product_name
having ordered>=in_stock;

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
select distinct status as order_status
from orders
order by order_status;


-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  
select  distinct pl.product_line,ofs.city
from productlines pl, products p,orderdetails od, orders o,customers c , employees e, offices ofs
where pl.id = p.productline_id and p.id = od.product_id and od.order_id = o.id and o.customer_id = c.id and c.sales_rep_employee_id = e.id and ofs.id = e.office_id
order by ofs.city;





