package cz.godless;

import cz.godless.db.DBContactService;
import cz.godless.service.CRUDManager;

public class Main {
    public static void main(String[] args) {
        new CRUDManager().printOptions();
    }
}
