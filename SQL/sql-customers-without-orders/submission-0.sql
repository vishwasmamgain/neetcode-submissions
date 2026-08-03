select name from customers cs left join orders o on cs.id=o.customer_id
where cs.id not in (select customer_id from orders)