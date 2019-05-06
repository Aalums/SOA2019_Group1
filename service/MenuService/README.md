# MenuService


$ mvn clean package

$ mvn sping-boot:run

---
http://localhost:8080/menu/

**Menu Service**

GET all category 
- http://localhost:8080/menu/category

GET menu in category 
- http://localhost:8080/menu/category/{type}/menu

GET menu's user 
- http://localhost:8080/menu/member/{memberId}/menu

GET recipe 
- http://localhost:8080/menu/menu/{menuId}/menuDetail

GET menu by search 
- http://localhost:8080/menu/menu/search/{menuName}

