-- 코드를 입력하세요
SELECT f.flavor 
    from first_half f join ICECREAM_INFO i on f.flavor = i.flavor 
    where TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE = "fruit_based";
    