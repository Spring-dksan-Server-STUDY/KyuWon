![image](https://user-images.githubusercontent.com/80209277/200580902-366f6ccc-9f09-4aa7-8688-8d2a810b151f.png)

## SELECT
```
SELECT FIRST_HALF.flavor FROM FIRST_HALF
LEFT JOIN ICECREAM_INFO ON FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR
WHERE ingredient_type = 'fruit_based' and total_order > 3000
ORDER BY total_order DESC;
```
LEFT JOIN과 WHERE를 이용하여 테이블을 합한 뒤 조건으로 찾아주었습니다.

## SUM MAX MIN
```
SELECT MAX(price) MAX_PRICE from product
```
MAX(price) 를 통해 최대값을 계산한 칼럼을 MAX_PRICE라고 alias 해주었습니다.
## GROUP BY
```
SELECT mcdp_cd '진료과코드', COUNT(apnt_no) '5월예약건수' FROM APPOINTMENT A
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY mcdp_cd
ORDER BY COUNT(apnt_no) , mcdp_cd;
```
GROUP BY를 통해 필요한 코드를 찾고 WHERE LIKE로 string 조건문을 썼습니다.
## ISNULL
```
SELECT warehouse_id, warehouse_name, address, IFNULL(freezer_yn, 'N') FREEZER_YN FROM food_warehouse
WHERE address like '경기도%';
```
isnull 이 안되어 ifnull로 null인 데이터를 대체했습니다.
## JOIN
```
SELECT product_code as PRODUCT_CODE, price * SUM(sales_amount) AS SALES FROM product p
RIGHT JOIN offline_sale off ON p.product_id = off.product_id 
GROUP BY p.product_id
ORDER BY SALES DESC, PRODUCT_CODE ASC;
```
RIGHT JOIN으로 테이블을 이어주었씁니다.
그리고 가격 계산을 위해 곱하기를 해주는 칼럼을 새로 만들었습니다.
## STRING DATE
```
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
```
WHERE IN를 통해 필요한 이름의 데이터를 찾았습니다.
