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
  user_id BIGSERIAL NOT NULL,
  role_id BIGSERIAL NOT NULL,
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

CREATE TABLE users_partnerships_positions_relations (
  user_id        BIGSERIAL NOT NULL,
  partnership_id BIGSERIAL NOT NULL,
  position_id    BIGSERIAL NOT NULL,
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
  user_id      BIGSERIAL,
  apartment_id BIGSERIAL,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (apartment_id) REFERENCES apartments (id)
);

-- TOPICS

CREATE TABLE topics (
  id             BIGSERIAL PRIMARY KEY,
  partnership_id INT,
  date           TIMESTAMP NOT NULL,
  author_id      INT,
  title          VARCHAR(256),
  description    TEXT,
  FOREIGN KEY (partnership_id) REFERENCES partnerships (id),
  FOREIGN KEY (author_id) REFERENCES users (id)
);

CREATE TABLE messages_topics (
  id      BIGSERIAL PRIMARY KEY,
  user_id INT,
  text    TEXT,
  date    TIMESTAMP NOT NULL,
  topic_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (topic_id) REFERENCES topics (id)
);

-- ISSUES

CREATE TABLE issues (
  id             BIGSERIAL PRIMARY KEY,
  partnership_id INT,
  date           TIMESTAMP NOT NULL,
  author_id      INT,
  title          VARCHAR(256),
  description    TEXT,
  importance     INT, -- 1 - low, 2 - middle, 3 - high
  process_status INT  NOT NULL, -- 0 - pending, 1 - in process, 2 - done, -1 - abort
  FOREIGN KEY (partnership_id) REFERENCES partnerships (id),
  FOREIGN KEY (author_id) REFERENCES users (id)
);

CREATE TABLE messages_issues (
  id       BIGSERIAL PRIMARY KEY,
  user_id  INT,
  text     TEXT,
  date     TIMESTAMP NOT NULL,
  issue_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (issue_id) REFERENCES issues (id)
);