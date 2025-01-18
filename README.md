# Tp7CassandraDbApplication

Ce projet est une application Spring Boot qui réalise des opérations CRUD (Create, Read, Update, Delete) pour gérer les produits stockés dans une base de données Cassandra.

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés sur votre système :

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Apache Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Postman](https://www.postman.com/) (facultatif, pour tester l'API)

## Installation

1. Clonez le projet depuis le dépôt Git :

   ```bash
   git clone https://github.com/votre-utilisateur/Tp7CassandraDbApplication.git
   cd Tp7CassandraDbApplication
   ```

2. Lancez la base de données Cassandra avec Docker :

   ```bash
   docker pull cassandra
   docker run --name cassandra-db -p 9042:9042 -d cassandra
   ```

   ![Commande Docker Pull](images/docker-pull.png)
   ![Commande Docker Run](images/docker-run.png)

3. Configurez l'application dans `application.yml` pour vous connecter à Cassandra.

4. Compilez et lancez l'application Spring Boot :

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Fonctionnalités

L'application offre les fonctionnalités suivantes :

- Ajouter un produit
- Consulter la liste des produits
- Modifier un produit
- Supprimer un produit

## Utilisation

### 1. Swagger UI

Accédez à l'interface Swagger pour tester les endpoints de l'API à l'adresse suivante :

```
http://localhost:8080/swagger-ui.html
```

![Swagger UI](images/swagger-ui.png)

### 2. Affichage des produits

Vous pouvez consulter la liste des produits disponibles via l'interface web à :

```
http://localhost:8080/products
```

![Affichage Produits](images/products-view.png)

### 3. Exécution des requêtes CRUD

Voici des exemples de requêtes à effectuer :

#### a) Ajouter un produit

```http
POST /api/products
Content-Type: application/json

{
  "id": "1",
  "name": "Produit A",
  "price": 100.0,
  "quantity": 10
}
```

#### b) Consulter tous les produits

```http
GET /api/products
```

#### c) Modifier un produit

```http
PUT /api/products/1
Content-Type: application/json

{
  "name": "Produit A modifié",
  "price": 120.0,
  "quantity": 15
}
```

#### d) Supprimer un produit

```http
DELETE /api/products/1
```

## Screenshots

### Commandes Docker

![Commande Docker Logs](images/docker-logs.png)

### Affichage des produits sur l'interface

![Produits Web](images/products-view.png)

### Interface Swagger

![Swagger UI](images/swagger-ui.png)

## Structure du projet

```
Tp7CassandraDbApplication
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.tp7cassandradb
│   │   ├── resources
│   │   │   ├── application.yml
│   │   │   └── schema.cql
├── images
│   ├── docker-pull.png
│   ├── docker-run.png
│   ├── docker-logs.png
│   ├── products-view.png
│   ├── swagger-ui.png
├── pom.xml
└── README.md
```

## Licence

Ce projet est sous licence MIT. Vous êtes libre de l'utiliser et de le modifier selon vos besoins.

---

**Auteur :** Racha

Pour toute question, n'hésitez pas à me contacter !
