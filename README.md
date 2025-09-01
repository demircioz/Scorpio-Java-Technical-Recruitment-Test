# Scorpio Recruitment Test – Java

## 📌 Contexte

Ce projet est un test technique qui consiste à **gérer l’arbre de données d’un automate**.
L’arbre est décrit dans un fichier JSON (`plcTree.json`) et est organisé en **catégories** (et sous-catégories) contenant des **mesures**.

## 📌 Objectifs du test

J’ai choisi la version **Java** (plutôt que TypeScript, language qui m'est inconnu).
Les fonctionnalités demandées :

* Charger l’arbre depuis le fichier JSON (`loadPlcTree` dans `Plc.java`).
* Rechercher des mesures par **nom** (`searchByName` dans `Category.java`).
* Rechercher des mesures par **type** (`searchByDataType` dans `Category.java`).
* Tester unitairement le code avec **JUnit**.

## 📌 Implémentation

* J’ai utilisé **Jackson** (déjà présent dans le `pom.xml`) pour lire le JSON.
* Le parcours de l’arbre est fait de manière **récursive (DFS)**.
* Les résultats sont retournés sous forme de **List<String>**, ce qui facilite les tests et l’affichage.
* J’ai écrit des **tests JUnit simples**

## 📌 Version

Java 17
Apache Maven 3.9.11


## 📌 Commandes utiles

* Installer les dépendances :

```bash
mvn install
```

* Compiler :

```bash
mvn package
```

* Lancer les tests :

```bash
mvn test
```

* Lancer le programme (main dans `Plc.java`) :

```bash
Exécuter simplement depuis l'IDE (Visual Studio Code dans mon cas)
```
