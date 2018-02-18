-- USERS, ROLES

CREATE TABLE users (
  id         BIGSERIAL PRIMARY KEY,
  username   VARCHAR(64) NOT NULL,
  password   VARCHAR(64) NOT NULL,
  name       VARCHAR(64),
  surname    VARCHAR(64),
  patronymic VARCHAR(64),
  phone      VARCHAR(64),
  avatar     VARCHAR(1024)
);

CREATE TABLE roles (
  id    BIGSERIAL PRIMARY KEY,
  title VARCHAR(64)
);

CREATE TABLE users_roles_relations (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id)
);

-- PARTNERSHIPS

CREATE TABLE partnerships (
  id         BIGSERIAL PRIMARY KEY,
  title      VARCHAR(256) NOT NULL,
  country    VARCHAR(256) NOT NULL,
  city       VARCHAR(256) NOT NULL,
  street     VARCHAR(256) NOT NULL,
  apartment  VARCHAR(256) NOT NULL,
  building   VARCHAR(256),
  post_index VARCHAR(256)
);

CREATE TABLE positions (
  id    BIGSERIAL PRIMARY KEY,
  title VARCHAR(256)
);

CREATE TABLE users_partnerships_relations (
  user_id        INT NOT NULL,
  partnership_id INT NOT NULL,
  position_id    INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (partnership_id) REFERENCES partnerships (id),
  FOREIGN KEY (position_id) REFERENCES positions (id)
);

-- APARTMENTS

CREATE TABLE directions (
  id    BIGSERIAL PRIMARY KEY,
  title VARCHAR(256)
);

CREATE TABLE apartments (
  id           BIGSERIAL PRIMARY KEY,
  number       INT,
  rooms        INT,
  floor        INT,
  direction_id INT,
  owner_id     INT,
  FOREIGN KEY (direction_id) REFERENCES directions (id),
  FOREIGN KEY (owner_id) REFERENCES users (id)
  ON DELETE SET NULL
);

CREATE TABLE users_apartments_relations (
  user_id      INT,
  apartment_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (apartment_id) REFERENCES apartments (id)
);

-- POSTS

CREATE TABLE posts (
  id             BIGSERIAL PRIMARY KEY,
  partnership_id INT,
  date           DATE NOT NULL,
  user_id        INT,
  title          VARCHAR(256),
  description    TEXT,
  importance     INT, -- 1 - low, 2 - middle, 3 - high
  FOREIGN KEY (partnership_id) REFERENCES partnerships (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE messages_posts (
  id      BIGSERIAL PRIMARY KEY,
  user_id INT,
  text    TEXT,
  date    DATE NOT NULL,
  post_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (post_id) REFERENCES posts (id)
);

-- ISSUES

CREATE TABLE issues (
  id             BIGSERIAL PRIMARY KEY,
  partnership_id INT,
  date           DATE NOT NULL,
  user_id        INT,
  title          VARCHAR(256),
  description    TEXT,
  importance     INT, -- 1 - low, 2 - middle, 3 - high
  process_status INT  NOT NULL, -- 0 - pending, 1 - in process, 2 - done, -1 - abort
  FOREIGN KEY (partnership_id) REFERENCES partnerships (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE messages_issues (
  id       BIGSERIAL PRIMARY KEY,
  user_id  INT,
  text     TEXT,
  date     DATE NOT NULL,
  issue_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (issue_id) REFERENCES issues (id)
);