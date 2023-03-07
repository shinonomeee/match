create table tag
(
    id          bigint auto_increment comment 'id'
        primary key,
    tag_name    varchar(256)                       null comment '标签名',
    user_id     bigint                             null comment '用户id',
    parent_id   bigint                             null comment '父标签id',
    is_parent   tinyint                            null comment '是否为父标签，0-否 1-是',
    create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete   tinyint  default 0                 not null comment '逻辑删除',
    constraint uniIdx_tag_name
        unique (tag_name)
)
    comment '标签';

create index idx_userid
    on tag (user_id);

create table user
(
    id           bigint auto_increment comment 'id'
        primary key,
    user_name    varchar(256)                       null comment '用户名',
    user_account varchar(256)                       null comment '账号',
    avatar_url   varchar(1024)                      null comment '头像',
    gender       tinyint                            null comment '性别',
    pwd          varchar(512)                       not null comment '密码',
    phone        varchar(128)                       null comment '电话号码',
    email        varchar(512)                       null comment '电子邮箱',
    user_status  int      default 0                 not null comment '状态：0-正常',
    user_role    int      default 0                 not null comment '用户角色：0-普通用户 1-超管',
    create_time  datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time  datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete    tinyint  default 0                 not null comment '逻辑删除',
    tags         varchar(1024)                      null comment '标签列表'
)
    comment '用户';

