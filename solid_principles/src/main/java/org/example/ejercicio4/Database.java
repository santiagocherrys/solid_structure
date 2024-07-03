package org.example.ejercicio4;

public class Database implements DataStorage {
    @Override
    public void save(String data) {
        System.out.println("Esto es lo que guardo " + data);
    }

    public Database() {
    }
}
