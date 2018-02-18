-- POSTS

INSERT INTO posts (partnership_id, date, user_id, title, description, importance) VALUES
  (1, '2018-01-01', 4, 'Отключение горячей воды', 'Внимание, 10.01.2018 с 14:00 до 15:00 будет отключена горячая вода',
   1);

INSERT INTO messages_posts (user_id, text, date, post_id) VALUES
  (1, 'Ok', '2018-01-01', 1),
  (2, 'Ok', '2018-01-01', 1),
  (3, 'Ok', '2018-01-01', 1);

-- ISSUES

INSERT INTO issues (partnership_id, date, user_id, title, description, importance, process_status) VALUES
  (1, '2018-01-01', 1, 'не работает лампочка на коридоре', 'на 23-ем этаже в конце коридора не работает лампочка', 1,
   0);

INSERT INTO issues (partnership_id, date, user_id, title, description, importance, process_status) VALUES
  (1, '2018-01-02', 2, 'нет горячей воды', 'на 4-ом этаже нет горячей воды', 2, 0);

INSERT INTO messages_issues (user_id, text, date, issue_id) VALUES
  (1, 'Ok', '2018-01-02', 1),
  (2, 'Ok', '2018-01-02', 1),
  (3, 'Ok', '2018-01-02', 1);