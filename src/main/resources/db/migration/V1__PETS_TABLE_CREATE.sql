CREATE TABLE PET
(
    ID           INT GENERATED ALWAYS AS IDENTITY,
    NAME         varchar(20) not null,
    SPECIES      varchar(20) not null,
    BREED        varchar(20) not null,
    AGE          INT         not null,
    DESCRIPTION  text        not null,
    PICTURE_URLS text        not null,
    PRIMARY KEY (ID)
);