CREATE TABLE IF NOT EXISTS message
(
    id   VARCHAR(60) DEFAULT RANDOM_UUID() PRIMARY KEY,
    text VARCHAR NOT NULL
);