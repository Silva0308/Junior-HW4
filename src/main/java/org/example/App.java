package org.example;

import java.util.List;

public class App extends Thread{
    View view;
    DB db;
    public App() {
        db = new DB();
        view = new View(db);
    }
}