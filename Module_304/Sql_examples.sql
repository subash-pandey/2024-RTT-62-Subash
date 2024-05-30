SELECT * FROM projectsdb.employee_project_mapping;
select * from employees where job_title ="Sales Rep" order by firstname limit 5;
select * from employees where job_title ="Sales Rep" order by firstname desc limit 5;
select distinct country from offices;
select distinct firstname from employees order by firstname;
select count(distinct country) from offices;
select count(*) as count from offices;
select count(*) as count
from offices as o
where o.country ='USA';
select * from offices;

-- values ('Denver','555-1212','123 Main Strt','CO','USA','80203','MW');
-- delete from offices where id>8;
update offices set address_line2 ='line2' where id =8;
-- I want  to see all employees working in USA
select * from offices;
select * from employees;
select e.*,o.city from employees e, offices o
where e.office_id =o.id and o.country ='USA';
-- lets just  start looking into the tables

select * from orders;

select od.*,(quantity_ordered*price_each) as total_price
 from orderdetails od
 where order_id =10425
 order by order_line_number;
 -- Add  product name
 
 select od.*,(quantity_ordered*price_each) as total_price,p.product_name
 from orderdetails od, products p
 where order_id =10425 and od.product_id =p.id
 order by order_line_number;
 
 -- Now lets add the date of the order
 select od.*,(quantity_ordered*price_each) as total_price,p.product_name,o.order_date
 from orderdetails od, products p,orders o
 where order_id =10425 and od.product_id =p.id and od.order_id = o.id
 order by order_line_number;
 
 --  now lets add customer name
 select od.*,(quantity_ordered*price_each) as total_price,p.product_name,o.order_date,c.customer_name
 from orderdetails od, products p,orders o, customers c
 where order_id =10425 and od.product_id =p.id and od.order_id = o.id and c.id= o.customer_id
 order by order_line_number;
 -- this is new 
 
 -- 
 select e.* from employees e;
 
 -- this is a new query
 -- I want to see the sum  total cost for all line for order 10425
 
select sum(quantity_ordered*price_each) as total_price, max(quantity_ordered), min(quantity_ordered),avg( quantity_ordered*price_each),count(*) as number_of_products
 from orderdetails od
 group by order_id;
 
 -- I want to see the total order cost of all orders
 select * from orderdetails;
 select order_id, sum(quantity_ordered*price_each),count(*) 
 from orderdetails where order_id in( 10103,10104)
 group by order_id ;
 
 -- Now I want to see total amount the customer has spent
 select c.customer_name,o.id as  order_id,od.product_id
 from customers c , orders o, orderdetails od
 where c.id = o.customer_id and o.id =od.order_id
 order by c.customer_name,order_id;
 
 select c.id,c.customer_name,o.id as  order_id,od.product_id, (od.quantity_ordered*od.price_each) as line_item_cost
 from customers c , orders o, orderdetails od
 where c.id = o.customer_id and o.id =od.order_id
 order by c.customer_name,order_id;

 select c.id, c.customer_name,o.id as order_id, sum(od.quantity_ordered*od.price_each) as total_customer_spend
 from customers c , orders o, orderdetails od
 where c.id = o.customer_id and o.id =od.order_id
 group by c.id,o.id
 order by c.customer_name ;
 
 -- I want to see orders over 50 k
 select c.id, c.customer_name,o.id as order_id, sum(od.quantity_ordered*od.price_each) as total_customer_spend
 from customers c , orders o, orderdetails od
 where c.id = o.customer_id and o.id =od.order_id
 group by c.id,o.id
 having total_customer_spend>60000
 order by c.customer_name ;
 
 
