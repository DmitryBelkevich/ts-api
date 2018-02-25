-- USERS, ROLES

INSERT INTO users (username, password, surname, name, patronymic, phone) VALUES
  ('user1', '1234', 'Белькевич', 'Дмитрий', 'Анатольевич', '+375297026000'),
  ('user2', '1234', 'Барейша', 'Олег', 'Г', '+375296340737'),
  ('user3', '1234', 'Барейша', 'Светлана', NULL, NULL),
  ('user4', '1234', 'Савич', 'Александр', NULL, '+375296929001');

INSERT INTO users_roles_relations (user_id, role_id) VALUES
  (1, 2),
  (2, 1),
  (3, 1),
  (4, 1);

UPDATE apartments
SET owner_id = 1
WHERE number = 183;

UPDATE apartments
SET owner_id = 2
WHERE number = 5;

INSERT INTO users_apartments_relations (user_id, apartment_id) VALUES
  (1, 183),
  (2, 5),
  (3, 5);

INSERT INTO users_partnerships_positions_relations (user_id, partnership_id, position_id) VALUES
  (1, 1, 1),
  (1, 1, 8),
  (2, 1, 1),
  (3, 1, 1),
  (4, 1, 2),
  (4, 2, 2);