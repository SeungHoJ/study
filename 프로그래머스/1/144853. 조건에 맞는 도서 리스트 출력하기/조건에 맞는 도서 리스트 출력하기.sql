-- 코드를 입력하세요
SELECT BOOK_ID,	DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
    from book
    where category = "인문" and substr(PUBLISHED_DATE,1,4) = "2021"
    order by PUBLISHED_DATE desc