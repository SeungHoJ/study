-- 코드를 입력하세요
SELECT FACTORY_ID,	FACTORY_NAME,	ADDRESS
    from food_factory
    where substr(address,1,4) = "강원도"