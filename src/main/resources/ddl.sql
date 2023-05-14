create table t_fans_info
(   id   int primary key auto_increment,
    name text(100) null,
    time datetime default current_timestamp on update current_timestamp,
    primary key pk_id  (id,name),
    unique key  (name),
    key idx_time (time)
);
create table t_fans_info_1
(   id   int primary key auto_increment,
    name text(100) null,
    time datetime default current_timestamp on update current_timestamp,
    primary key pk_id  (id,name),
    unique key  (name,time),
    key idx_time (time)
) comment='测试1';
