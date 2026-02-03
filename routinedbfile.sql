create database if not exists routinedb;
use routinedb;

create table if not exists tarefa(
	id int primary key auto_increment,
    titulo varchar(255) not null,
    descricao text(500),
    ativa boolean default true
);



insert into tarefa(titulo, descricao) values ('Teste1', 'Teste1'), ('Teste2', 'Teste2');
select * from tarefa;