DROP TABLE IF EXISTS notes;

CREATE TABLE notes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  date_of_creation DATE,
  note VARCHAR(250) NOT NULL
);

INSERT INTO notes (date_of_creation, note) VALUES
  ('1910-01-03', 'Здоровъ. Интересн[ыя], хорошiя письма. Поправлялъ Народн[ую] бедноту и Сонъ. Письма. Вечеръ ничего особеннаго. Скучно.'),
  ('1910-01-17', 'Пропустилъ. Былъ целый день въ мрачномъ духе, прiехалъ Булгаковъ съ письмомъ и порученiями Ч[ерткова]. Ничего не могъ делать. Ездилъ со всеми детьми по Засеке, М[арья] А[лександровна], Буланже.'),
  ('1910-01-23', 'Нетъ более распространеннаго суеверiя, какъ то, что человекъ съ его теломъ есть нечто реальное. Человекъ есть только центръ сознанiя, воспринимающаго впечатленiя');