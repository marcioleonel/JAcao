create table tbl_usuario(
  id_usuario smallint not null,
  nm_usuario varchar(80) not null,
  nm_senha varchar(12) not null
);

alter table tbl_usuario add constraint pk_usuario primary key(id_usuario);