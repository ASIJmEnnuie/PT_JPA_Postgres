# Welcome to spring-boot-postgres Sample project

## Pre-requis
Java 8  
Maven 3.1.x  
Postgresql instance  


## Postgres Instance Configuration
Il est nécessaire de créer la BD postgresql "asijmennuie" avant toute chose,
ainsi que de définir le mot de passe postgres (et le modifier si nécessaire dans
la dernière ligne du fichier application.properties) ```src/main/resources/dev/application.properties```
```
#
# [ Database Configuration Section ]
#
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.datasource.initialize=true
spring.jpa.hibernate.ddl=none
spring.database.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/asijmennuie
spring.datasource.username=postgres
spring.datasource.password=evasion
```

## Lancer l'application
```mvn spring-boot:run```

## Lancer les tests d'intégration
```mvn test -DhsqldbIntegrationTest=true```

## Fichiers de chargement des données
schema and data are initialized using ```schema-postgres.sql``` and ```data-postgres.sql```

## Utilisation de l'application

### Via navigateur (chrome de préférence)
Télécharger le plug-in : https://chrome.google.com/webstore/detail/rest-console/cokgbflfommojglbmbpenpphppikmonn


Pour ajouter un evenement (méthode POST) utiliser par exemple : ```http://localhost:9095/user/un evenement```
Pour la liste de tous les evenements utiliser : ```http://localhost:9095/evenement```

### Via terminal : Ajout evenement
```curl -X POST "http://localhost:9095/evenement/un%20evenement"```
(ne pas oublier d'encoder les caractères spéciaux et espaces)

### Via terminal : Liste des evenements
```curl "http://localhost:9095/evenement"```

## Visualisation des résultats
http://localhost:9095/evenement
