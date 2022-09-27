# Baseball 프로그램 생성



### 테이블 생성
```sql
USE greendb;

CREATE TABLE genre(
id INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(20),
created_at TIMESTAMP);

CREATE TABLE agency(
id INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(20),
location VARCHAR(20),
created_at TIMESTAMP);

CREATE TABLE singer(
id INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(20),
age INT,
genre_id INT,
agency_id INT,
created_at TIMESTAMP);


### 더미데이터 추가
```sql
INSERT INTO genre(NAME, created_at)VALUES("힙합", NOW());
INSERT INTO genre(NAME, created_at)VALUES("발라드", NOW());
INSERT INTO genre(NAME, created_at)VALUES("락", NOW());

INSERT INTO agency(NAME, location ,created_at)VALUES("SM","서울",NOW());
INSERT INTO agency(NAME, location ,created_at)VALUES("JYP","부산",NOW());
INSERT INTO agency(NAME, location ,created_at)VALUES("YG","대구",NOW());

INSERT INTO singer(NAME, age ,genre_id, agency_id, created_at)VALUES("매드클라운",20,1,1,NOW());
INSERT INTO singer(NAME, age ,genre_id, agency_id, created_at)VALUES("김종국",40,2,2,NOW());
INSERT INTO singer(NAME, age ,genre_id, agency_id, created_at)VALUES("노라줘",30,3,3,NOW());
```

###TIP

####마이바티스 카멜세팅
```
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setMapUnderscoreToCamelCase(true);
        sessionFactory.setConfiguration(config);
```
#### 마리아DB 오토커밋 설정해제
