# Articles

## About
User can do CRUD operations, also search articles by keyword in title and in content using a custom query.
Application has been written in Java 8 and Spring boot framework with JPA, WEB, POSTGRESQL, VALIDATION and LOMBOK Maven dependencies.
 
## How to run 
To run the application use heroku urls or clone the repository into your local computer, use Java 8, import maven dependencies, create a database in PostgreSQL. To configure a database connection use settings from application.properties.



## Endpoints
 
### Create an Article 1

POST url: https://articles-jc.herokuapp.com/articles , http://localhost:8080/articles

json: {
"title": "Polskie samochody",
"content": "Nowa Warszawa, nowa Syrenka, pojazd o nazwie Triggo, czy mały, elektryczny dostawczak z Polski To tylko niektóre z przykładów aut, które chcą zbudować lub już konstruują producenci",
"published": "2022-03-04",
"magazineName":"Autoswiat",
"name":"Jan",
"surname":"Kowalski",
"attachments":[{
    "id":2,
    "title": "zalacznik tytul",
    "content": "zalacznik zawartosc"
    }]
}  
    

### Create an Article 2

POST url: https://articles-jc.herokuapp.com/articles , http://localhost:8080/articles

json: {
"title": "Motocylke wojskowe",
"content": "poo powszechnego wykorzystania motocykli w zadaniach bojowych, to już przeszłość i nie wydaje się, by mogło się to zmienić.",
"published": "2002-10-05",
"magazineName":"Magazyn wojenny",
"name":"Ela",
"surname":"Nowak",
"attachments":[{
    "id":4,
    "title": "zalacznik tytul",
    "content": "zalacznik zawartosc"
    }]
}   

### Create an Article 3

POST url: https://articles-jc.herokuapp.com/articles , http://localhost:8080/articles

json: {
"title": "Wloska kuchnia",
"content": "jedna z dwóch najbardziej popularnych kuchni europejskich obok kuchni francuskiej.",
"published": "2005-07-08",
"magazineName":"100 Przepisow",
"name":"Andrzej",
"surname":"nazwisko autora 3",
"attachments":[{
    "id":7,
    "title": "zalacznik tytul",
    "content": "zalacznik zawartosc"
    }]
}

### Find all Articles

GET url: https://articles-jc.herokuapp.com/articles , http://localhost:8080/articles

### Find an Article by Id

GET url: https://articles-jc.herokuapp.com/articles/{id} , http://localhost:8080/articles/{id}

### Put an Article by Id

PUT url: https://articles-jc.herokuapp.com/articles , http://localhost:8080/articles

json: {
"id":"5",
"title": "zmiana",
"content": "zmiana",
"magazineName":"zmiana",
"name":"zmiana",
"surname":"zmiana"
}     

### Delete an Article by Id

DELETE url: https://articles-jc.herokuapp.com/articles/{id} , http://localhost:8080/articles/{id}

### Search by TEXT in column title and column content

GET url: https://articles-jc.herokuapp.com/articles/search?title=TEXT&content=TEXT , http://localhost:8080/articles/search?title=TEXT&content=TEXT
