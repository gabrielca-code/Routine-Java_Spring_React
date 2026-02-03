drop database if exists routinedb;
create database if not exists routinedb;
use routinedb;

create table if not exists usuario(
	id int primary key auto_increment,
    login varchar(30) not null unique,
    senha varchar(30) not null,
    nome varchar(255) not null,
    ativa boolean default true
);

create table if not exists tarefa(
	id int primary key auto_increment,
    titulo varchar(255) not null,
    descricao text(500),
    ativa boolean default true,
    idUsuario int not null,
    foreign key (idUsuario) references usuario (id)
);

create table if not exists subtarefa(
	id int primary key auto_increment,
    titulo varchar(255) not null,
    idTarefa int not null,
    foreign key (idTarefa) references tarefa(id)
);

insert into usuario(login, senha, nome) values
('admin', 'admin', 'Usuario 1'),
('login', 'senha', 'Usuario 2');

insert into tarefa(titulo, descricao, idUsuario) values
('Teste1', 'Teste1', 1), 
('Teste2', 'Teste2', 1),
('Teste3', 'Teste3', 2);
select * from tarefa;

insert into subtarefa(titulo, idTarefa) values
('Subtarefa 1', 1),
('Subtarefa 2', 1),
('Subtarefa 3', 1),
('Subtarefa 4', 2),
('Subtarefa 5', 3);
select * from subtarefa;