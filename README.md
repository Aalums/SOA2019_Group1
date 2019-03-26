# SOA2019_Group1

## How to RUN Project
* clone project
  * git clone https://github.com/Aalums/SOA2019_Group1.git
* compile
  * mvnw clean package
* run project 
  * mvnw spring-boot:run
  
## API
* Member Service
  * get member - /Member/{memberId}
  * add member - /Register
* Menu Service
  * get all category - /Category
  * get menu in category - /Category/{type}/Menu
  * get menu's user - /Member/{memberId}/Menu
  * get recipe - /Menu/{menuId}/MenuDetail
  * get menu by search - /Menu/search/{menuName}
* Manage Service
  * create new menu - /Member/{memberId}/Menu/New
  * update menu - /Menu/{menuId}/MenuDetail/Update
  * delete menu - /DeleteMenu

## DEPLOY
* http://recipe-235414.appspot.com/
