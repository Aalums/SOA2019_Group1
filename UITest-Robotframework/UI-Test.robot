*** Settings ***
Library  SeleniumLibrary

*** Variable ***

*** Test Cases ***
UITest
    เปิดเว็บRecipe
    เลือกประเภทต้ม
    เลือกเมนู
    เข้าสู่ระบบ
    ดูเมนูอาหารของฉัน
    เพิ่มเมนูอาหาร
    กรอกข้อมูล
    บันทึกข้อมูล
    ออกจากระบบ

*** Keywords ***
เปิดเว็บRecipe
    Open Browser  localhost:8080/  browser=chrome
    Maximize Browser Window

เลือกประเภทต้ม
    Click Element  id:cat-1

#เลือกเมนู
#เข้าสู่ระบบ
#ดูเมนูอาหารของฉัน
#เพิ่มเมนูอาหาร
#กรอกข้อมูล
#บันทึกข้อมูล
#ออกจากระบบ

#ค้นหาคำว่าสอบ
    #Click Element  xpath://div/div[2]/span[1]/a[1]
    #Input Text  id:search-form  สอบ
    #Press Keys  None  RETURN

#ต้องเจอข้อมูลในหน้าแรกจำนวน 10 เรื่อง
    #${count}=  Get Element Count  xpath://div/div/article
    #Should Be True  ${count} == 10
    #Page Should Contain Element  xpath://div/div/article  limit=11  #บอกว่าfailค่าอะไร และในreportจะcaptureหน้าที่พบให้