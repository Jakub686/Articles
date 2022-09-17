# Articles

## About
Application has been written in Java 8 and Spring boot framework with JPA, WEB, MYSQL, and LOMBOK Maven dependencies.
 
## How to run 
To run the application, clone the repository into your local computer, use Java 8, import maven dependencies, create a database in MySQL Workbench. To configure a database connection use settings from application.properties.

 
## Endpoints
 
### Create an Article 1

url: http://localhost:8080/articles

json: {
"title": "Polskie samochody",
"content": "Nowa Warszawa, nowa Syrenka, pojazd o nazwie Triggo, czy mały, elektryczny dostawczak z Polski To tylko niektóre z przykładów aut, które chcą zbudować lub już konstruują producenci",
"published": "2022-03-04",
"magazineName":"Autoswiat",
"name":"Jan",
"surname":"Kowalski"
}    

### Create an Article 2

url: http://localhost:8080/articles

json: {
"title": "Motocylke wojskowe",
"content": "Czasy powszechnego wykorzystania motocykli w zadaniach bojowych, to już przeszłość i nie wydaje się, by mogło się to zmienić.",
"published": "2002-10-05",
"magazineName":"Magazyn wojenny",
"name":"Ela",
"surname":"Nowak"
}  

### Create an Article 3

url: http://localhost:8080/articles

json: {
"title": "Wloska kuchnia",
"content": "jedna z dwóch najbardziej popularnych kuchni europejskich obok kuchni francuskiej.",
"published": "2005-07-08",
"magazineName":"100 Przepisow",
"name":"Andrzej",
"surname":"nazwisko autora 3"
}    

Find all Articles

![image](https://user-images.githubusercontent.com/80157748/189675498-df9ac1f5-80ec-44a4-84e3-3d840bd69214.png)

Find an Article by Id

![image](https://user-images.githubusercontent.com/80157748/189675723-d925d4b4-4fa9-4d5a-98b0-123772f38abe.png)

Put An Article by Id

![image](https://user-images.githubusercontent.com/80157748/189676014-ee4aa59e-2ae5-45f0-a974-7f5afe2bcda3.png)

result

![image](https://user-images.githubusercontent.com/80157748/189676097-5bb62388-3ed7-4d05-80b0-0b7f2c52c6ee.png)

Delete an Article by Id

![image](https://user-images.githubusercontent.com/80157748/189676224-2cda819c-f3ab-48bd-be5b-e8a23c03f301.png)

result

![image](https://user-images.githubusercontent.com/80157748/189676286-98364c34-3c42-451a-ac6c-705d7a9bac0e.png)

Search by title

![image](https://user-images.githubusercontent.com/80157748/189978951-d202cfdd-a583-4c2f-b252-8e87bc03b872.png)


