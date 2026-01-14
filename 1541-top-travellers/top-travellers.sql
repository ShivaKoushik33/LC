# Write your MySQL query statement below
select name,case when sum(distance)>0 then sum(distance)
        when sum(distance) is null then 0
end as travelled_distance from Rides as r right join Users as u on r.user_id=u.id group by
r.user_id order by travelled_distance desc, name asc;