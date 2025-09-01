package com.scorpio;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void searchByName_foundPieceCounter() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        List<String> results = root.searchByName("Piece-counter");

        assertFalse(results.isEmpty(), "La recherche par nom ne doit pas être vide");
        assertTrue(results.get(0).contains("Piece-counter"), 
                   "Le résultat doit contenir 'Piece-counter'");
    }

    @Test
    void searchByName_notFound() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        List<String> results = root.searchByName("toto");

        assertTrue(results.isEmpty(), "La recherche d'un nom inexistant doit renvoyer une liste vide");
    }

    @Test
    void searchByDataType_booleanMeasuresExist() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        List<String> resultsBoolean = root.searchByDataType(DataType.BOOLEAN);

        assertFalse(resultsBoolean.isEmpty(), "Il devrait y avoir des mesures de type BOOLEAN");
    }

    @Test
    void searchByDataType_notFound() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        List<String> results = root.searchByDataType(DataType.STRING);
        assertTrue(results.isEmpty(), "La recherche d'un type inexistant (STRING) doit renvoyer une liste vide");
    }

    @Test
    void searchByDataType() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        List<String> resultsBoolean = root.searchByDataType(DataType.BOOLEAN);
        assertFalse(resultsBoolean.isEmpty(), "Il devrait y avoir des mesures de type BOOLEAN");

    }
}