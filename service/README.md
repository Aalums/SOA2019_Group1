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
  * get member - /member/{memberId}	
  * add member - /member/add
* Menu Service	
  * get all category - /menu/category
  * get menu in category - /menu/category/{type}/menu
  * get menu's user - /menu/member/{memberId}/menu
  * get recipe - /menu/menu/{menuId}/menudetail
* Manage Service	
  * create new menu - /Member/{memberId}/Menu/New	
  * update menu - /menu/{menuId}/menuDetail/Update	


 ## DEPLOY	
* http://recipe-235414.appspot.com/
