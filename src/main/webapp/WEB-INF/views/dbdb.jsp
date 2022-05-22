create table member(
id varchar2(20) not null  primary key,
pw varchar2(20),
name varchar2(20),
tel varchar2(20),
email varchar2(40),
address varchar2(100)
);


create table gift(
giftnum number(7) not null  primary key,
gifttitle varchar2(40),
giftpart varchar2(20),
giftimg varchar2(100),
giftprice number(10),
giftstocks number(7),
giftstockm number(7),
giftstockl number(7),
giftstockxl number(7),
gifttumimg varchar2(100),
readcnt number(7)
);


create table giftorder(
id varchar2(20) not null primary key,
giftnum number(7),
orderstatus varchar2(20),
orders number(7),
orderm number(7),
orderl number(7)
);




    insert into giftorder values('asd', 1, 'cart', 1,2,1);
    insert into giftorder values('asd', 2, 'cart', 1,1,3);
    insert into giftorder values('asd', 3, 'cart', 1,1,10);
    insert into giftorder values('asd', 1, 'cart', 1,1,1);
    insert into giftorder values('asd', 2, 'cart', 1,12,1);
    insert into giftorder values('asd', 3, 'cart', 1,11,1);
    insert into giftorder values('asd', 1, 'cart', 12,1,1);
    insert into giftorder values('asd', 2, 'cart', 1,13,1);
    insert into giftorder values('asd', 3, 'cart', 1,1,1);
    
INSERT INTO gift VALUEs(gift_seq.nextval,'아이유옷','top','m-404.jpeg','9990','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'내옷','bottom','m-404.jpeg','100000','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'니옷','out','m-404.jpeg','59990','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'3color 여자 여성 핀턱 버뮤다 팬츠','top','m-404.jpeg','124345','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'4color 여름 여자 여성 트레이닝 세트 츄리닝 운동복','bottom','m-404.jpeg','124333','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'하이웨스트 A라인 미니 겨울 스커트','out','m-404.jpeg','126346','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'벨벳 왕 리본핀 헤어핀 머리핀 2종','top','m-404.jpeg','6434','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'여성 퍼 겨울 털 슬리퍼','bottom','m-404.jpeg','76587568','1','2','3','5','sdetail.jpg',0);
INSERT INTO gift VALUEs(gift_seq.nextval,'브이넥 여자 여성 니트 가디건 골지 가을 봄','out','m-404.jpeg','12435','1','2','3','5','sdetail.jpg',0);    
    
    
    
    
    
    