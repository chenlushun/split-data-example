create table logic_db.`order`
(
    id          int auto_increment
        primary key,
    order_no    varchar(64) null,
    user_name   varchar(20) null,
    create_time datetime    null,
    modify_time datetime    null
);
