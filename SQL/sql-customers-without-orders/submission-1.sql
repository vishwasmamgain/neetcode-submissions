select name from customers cs 
where cs.id not in (select customer_id from orders)