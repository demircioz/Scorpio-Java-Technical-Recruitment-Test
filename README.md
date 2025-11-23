# Scorpio Recruitment Test – Java

## 📌 Context

This project is a technical test that involves **managing the data tree of a PLC (programmable logic controller)**.
The tree is described in a JSON file (`plcTree.json`) and is organized into **categories** (and sub-categories) containing **measurements**.

---

## 📌 Test Objectives

I chose the **Java version** (instead of TypeScript, a language I am not familiar with).
The required features are:

* Load the tree from the JSON file (`loadPlcTree` in `Plc.java`).
* Search measurements by **name** (`searchByName` in `Category.java`).
* Search measurements by **data type** (`searchByDataType` in `Category.java`).
* Write unit tests using **JUnit**.

---

## 📌 Implementation

* I used **Jackson** (already included in `pom.xml`) to read the JSON file.
* The tree traversal is implemented using a **recursive approach (DFS)**.
* Results are returned as a **List<String>**, making them easier to test and display.
* I wrote **simple JUnit tests**.

---

## 📌 Versions

* Java 17
* Apache Maven 3.9.11

---

## 📌 Useful Commands

* Install dependencies:

```bash
mvn install
```

* Build the project:

```bash
mvn package
```

* Run the tests:

```bash
mvn test
```

* Run the program (main method in `Plc.java`):

```bash
Simply run it from your IDE (Visual Studio Code in my case)
```
