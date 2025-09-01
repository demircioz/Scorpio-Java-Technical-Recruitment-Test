package com.scorpio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlcTest {

    @Test
    void loadPlcTree_rootNotNull() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        assertNotNull(root, "Le root ne doit pas être null");
    }

    @Test
    void loadPlcTree_rootNameIsCorrect() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        assertEquals("root", root.getName(), "Le nom de la racine doit être 'root'");
    }

    @Test
    void loadPlcTree_rootHasCategories() {
        Plc plc = new Plc();
        Category root = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");

        assertNotNull(root.getCategories(), "Le root doit contenir des sous-catégories");
        assertTrue(root.getCategories().size() > 0, "Le root doit contenir au moins une sous-catégorie");
    }

    @Test
        void loadPlcTree_invalidFilePathThrowsException() {
            Plc plc = new Plc();

            assertThrows(RuntimeException.class,
                () -> plc.loadPlcTree("chemin/qui/n/existe/pas.json"),
                "Un mauvais chemin a été rentré en argument"
            );
        }
    
}
