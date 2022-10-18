select *from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID

select *from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null