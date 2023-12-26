package com.example.onemoretimejava.Hashmap;

public class MapUsingHash {
    //here we are generating our own hashmap

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String Value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, Value);
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        } else {
            return null;
        }
    }

    private void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();
        map.put("mango", "king of fruits");
        map.put("gauva", "king of malaysi");
        map.put("pine", "king of itely");
        map.put("apple", "king of swizserlad");

        System.out.println( map.get("mango"));

    }
}
