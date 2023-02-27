DROP TABLE IF EXISTS leaf_alloc;
create table leaf_alloc
(
    biz_tag     varchar(128)             default ''::character varying not null
        constraint PRIMARY_leaf_alloc
        primary key,
    max_id      bigint                   default '1'::bigint           not null,
    step        integer                                                not null,
    description varchar(256),
    update_time timestamp with time zone default CURRENT_TIMESTAMP     not null
);