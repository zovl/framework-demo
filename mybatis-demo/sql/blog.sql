create table blog
(
    id                   bigint auto_increment
        primary key,
    title                varchar(256)          null comment '博客标题',
    content              longtext              null comment '博客内容'
)
    comment '博客表';

