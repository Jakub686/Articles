# Articles

## About
Application has been written in Java 8 and Spring boot framework with JPA, WEB, MYSQL, and LOMBOK Maven dependencies.
 
## How to run 
To run the application, clone the repository into your local computer, use Java 8, import maven dependencies, create a database in MySQL Workbench. To configure a database connection use settings from application.properties.

 
## Endpoints
 
### Create an Article 1

POST url: http://localhost:8080/articles

json: {
"title": "Polskie samochody",
"content": "Nowa Warszawa, nowa Syrenka, pojazd o nazwie Triggo, czy mały, elektryczny dostawczak z Polski To tylko niektóre z przykładów aut, które chcą zbudować lub już konstruują producenci",
"published": "2022-03-04",
"magazineName":"Autoswiat",
"name":"Jan",
"surname":"Kowalski"
}    

### Create an Article 2

POST url: http://localhost:8080/articles

json: {
"title": "Motocylke wojskowe",
"content": "Czasy powszechnego wykorzystania motocykli w zadaniach bojowych, to już przeszłość i nie wydaje się, by mogło się to zmienić.",
"published": "2002-10-05",
"magazineName":"Magazyn wojenny",
"name":"Ela",
"surname":"Nowak"
}  

### Create an Article 3

POST url: http://localhost:8080/articles

json: {
"title": "Wloska kuchnia",
"content": "jedna z dwóch najbardziej popularnych kuchni europejskich obok kuchni francuskiej.",
"published": "2005-07-08",
"magazineName":"100 Przepisow",
"name":"Andrzej",
"surname":"nazwisko autora 3"
}    

### Find all Articles

GET url: http://localhost:8080/articles

### Find an Article by Id

GET url: http://localhost:8080/articles/{id}

### Put An Article by Id

PUT url: http://localhost:8080/articles

json: {
"id":"5",
"title": "zmiana",
"content": "zmiana",
"magazineName":"zmiana",
"name":"zmiana",
"surname":"zmiana"
}     

### Delete an Article by Id

DELETE url: http://localhost:8080/articles/{id}

### Search by title

GET url: http://localhost:8080/articles/search?title=


