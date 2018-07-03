INSERT INTO author (id,date_of_birth, last_name, name, nationality) VALUES (1,'1958-06-04','Mickiewicz','Adam','Poland');
INSERT INTO author (id,date_of_birth, last_name, name, nationality) VALUES (2,'1957-08-27','Grubb','Jeff','USA');
INSERT INTO author (id,date_of_birth, last_name, name, nationality) VALUES (3,'1958-06-04','Stross','Charles','Great Britain');
INSERT INTO author (id,date_of_birth, last_name, name, nationality) VALUES (4,'1846-05-05','Sienkiewicz','Henryk','Poland');
INSERT INTO author (id,date_of_birth, last_name, name, nationality) VALUES (5,'1926-11-25','Anderson','Poul','USA');

INSERT INTO book (id, book_type, release_date, title) VALUES (1,'DRAMA','2001-06-18','Harry Potter');
INSERT INTO book (id, book_type, release_date, title) VALUES (2,'SCI_FI','2012-02-05','Obcy izolacja');
INSERT INTO book (id, book_type, release_date, title) VALUES (3,'COMEDY','1991-08-10','Bolek i Lolek');
INSERT INTO book (id, book_type, release_date, title) VALUES (4,'OTHER','2016-09-15','Filozofia Kaizen');
INSERT INTO book (id, book_type, release_date, title) VALUES (5,'DRAMA','1999-09-13','Wzorce projektowe');


INSERT INTO book_authors (book_id, authors_id) VALUES (1,1);
INSERT INTO book_authors (book_id, authors_id) VALUES (1,2);
INSERT INTO book_authors (book_id, authors_id) VALUES (1,3);
INSERT INTO book_authors (book_id, authors_id) VALUES (2,3);
INSERT INTO book_authors (book_id, authors_id) VALUES (2,4);
INSERT INTO book_authors (book_id, authors_id) VALUES (2,5);
INSERT INTO book_authors (book_id, authors_id) VALUES (3,1);
INSERT INTO book_authors (book_id, authors_id) VALUES (4,4);
INSERT INTO book_authors (book_id, authors_id) VALUES (5,2);
INSERT INTO book_authors (book_id, authors_id) VALUES (5,4);
INSERT INTO book_authors (book_id, authors_id) VALUES (5,5);