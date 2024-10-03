package cz.godless;

import cz.godless.db.DBContactService;

public class Main {
    public static void main(String[] args) {
        DBContactService service = new DBContactService();
        service.readAll().forEach(System.out::println);
    }
}
