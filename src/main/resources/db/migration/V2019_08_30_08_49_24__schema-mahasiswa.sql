create table mahasiswa
(
    id   int         not null primary key auto_increment,
    nama varchar(50) not null,
    umur int default 20
);

insert into mahasiswa(nama, umur)
values ('Dimas Maryanto', 20),
       ('Muhamad Yusuf', 20),
       ('Abdul', 20),
       ('Nandra', 20),
       ('Hari Sapto Adi', 20);
