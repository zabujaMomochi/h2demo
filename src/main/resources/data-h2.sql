insert into author(id, first_name, last_name) values(1, 'Dan', 'Vega');
insert into post(id, title, body, author_id, posted_on) values(1,'Spring Boot is awesome', 'Blog Post Content...', 1, CURRENT_DATE());
insert into post(id, title, body, author_id, posted_on) values(1,'Spring Boot Rocks!', 'Blog Post Content...', 1, CURRENT_DATE());
