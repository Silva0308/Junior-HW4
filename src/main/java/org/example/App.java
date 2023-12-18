package org.example;



public class App extends Thread{
    View view;
    DB db;
    public App() {
        db = new DB();
        view = new View(db);
    }}