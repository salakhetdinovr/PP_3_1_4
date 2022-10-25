CREATE TABLE User(
                     id int PRIMARY KEY AUTO_INCREMENT NOT NULL ,
                     username varchar(100) not NULL,
                     email varchar(100) NOT NULL,
                     password varchar(30) NOT NULL
);

CREATE TABLE Roles(
                      id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
                      username varchar(100) not NULL
);


CREATE TABLE User_roles(
                           user_id int NOT NULL ,
                           role_id int NOT NULL,

                           FOREIGN KEY (user_id) REFERENCES user (id),
                           FOREIGN KEY (role_id) REFERENCES roles (id),

                           UNIQUE (user_id, role_id)
);


INSERT  INTO roles VALUES (1, 'ADMIN');
INSERT  INTO roles VALUES (2, 'USER');

insert into user_roles values (1, 2);