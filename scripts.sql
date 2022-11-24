create table COR(
    id bigint auto_increment primary key,
    descricao varchar(60)
);



create table MODELO(
    id bigint auto_increment primary key,
    descricao varchar(200),
    ano int,
    cor_id int, foreign key (cor_id) references COR(id),
    portas int,
    combustivel varchar(50)
);



create table MARCA(
    id bigint auto_increment primary key,
    descricao varchar(100), 
    modelo_id int,
    foreign key (modelo_id) references MODELO(id)
);