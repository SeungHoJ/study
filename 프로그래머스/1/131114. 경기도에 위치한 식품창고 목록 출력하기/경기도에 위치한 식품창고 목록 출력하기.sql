-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,ifnull(freezer_yn,"N") as FREEZER_Y
    from FOOD_WAREHOUSE
    where substr(address,1,3) = "경기도"
    order by WAREHOUSE_ID;
    