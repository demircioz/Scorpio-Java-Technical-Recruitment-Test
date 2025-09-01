package com.scorpio;

import lombok.extern.slf4j.Slf4j;

// import com.fasterxml.jackson.core.json.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.io.File;


@Slf4j
public class Plc {

    /**
     * main function of the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Plc plc = new Plc();
        Category category = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        System.out.println("=== Vérification de l'arbre chargé ===");
        System.out.println("Catégorie racine : " + category.getName());

        System.out.println("\n=== Recherche par nom ===");
        List<String> nameResults = category.searchByName("Piece-counter");
        for (String path : nameResults) {
            System.out.println(path);
        }

        System.out.println("\n=== Recherche par type (BOOLEAN) ===");
        List<String> typeResults = category.searchByDataType(DataType.BOOLEAN);
        for (String path : typeResults) {
            System.out.println(path);
        }

        System.out.println("\n=== Fin du programme ===");


    }

    /**
     * Load the data tree of the Plc from a json file
     *
     * @param filePath - the tree file path
     * @return the root category of the tree
     */
     Category loadPlcTree(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(filePath), Category.class);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur lors du chargement du fichier JSON : " + filePath, e);
        }
    }
}