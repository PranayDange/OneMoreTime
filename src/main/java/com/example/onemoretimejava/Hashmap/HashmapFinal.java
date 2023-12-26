package com.example.onemoretimejava.Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashmapFinal<K, V> {
    ArrayList<LinkedList<Entity2>> list;

    private int size = 0;
    private float lf = 0.5f;

    public HashmapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity2> entities = list.get(hash);
        for (Entity2 entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }

        }
        if ((float) (size) / list.size() > lf) {
            reHash();
        }
        entities.add(new Entity2(key, value));
        size++;
    }

    public void reHash() {
        System.out.println("we are now rehashing");
        ArrayList<LinkedList<Entity2>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity2> entities : old) {
            for (Entity2 entry : entities) {
                put((K) entry.key, (V) entry.value);
            }
        }
    }


    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity2> entities = list.get(hash);
        for (Entity2 entity : entities) {
            if (entity.key.equals(key)) {
                return (V) entity.value;
            }

        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity2> entities = list.get(hash);
        Entity2 target = null;
        for (Entity2 entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }

        }
        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        return "HashmapFinal{" +
                "list=" + list +
                ", size=" + size +
                ", lf=" + lf +
                '}';
    }

    public static void main(String[] args) {
        //here we are building hashmap using linked list for better optimization
        HashmapFinal map = new HashmapFinal();
        map.put("cena", "player1");
        map.put("broack", "player2");
        map.put("edge", "player3");
        System.out.println(map.get("egde"));
    }
}
