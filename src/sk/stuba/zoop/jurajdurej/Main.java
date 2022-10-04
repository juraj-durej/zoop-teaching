package sk.stuba.zoop.jurajdurej;

import sk.stuba.zoop.jurajdurej.services.MainService;

public class Main {

    public static void main(String[] args) {
        MainService mainService = new MainService();
        mainService.run();
    }

}