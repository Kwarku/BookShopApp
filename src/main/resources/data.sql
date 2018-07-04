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
INSERT INTO book_authors (book_id, authors_id) VALUES (5,5);YYYY-MM-DD HH:MI:SS

INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (1,'test1','2015-04-06T12:30:15','NEW');
INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (2,'test2','2017-07-23T23:20:58','DONE');
INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (3,'test3','2018-07-04T15:15:01','CANCEL');
INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (4,'test4','2018-01-15T18:26:37','IN_REALIZATION');
INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (5,'test5','2017-07-24T03:39:41','WAITING');
INSERT INTO shop_order (id, comment, crete_time, order_status) VALUES (6,'test6','2017-07-12T08:16:17','NEW');

INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (1,1);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (1,2);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (1,3);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (1,4);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (1,5);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (2,1);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (2,2);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (6,3);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (3,4);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (4,3);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (5,1);
INSERT INTO shop_order_books (shop_order_id, books_id) VALUES (5,5);