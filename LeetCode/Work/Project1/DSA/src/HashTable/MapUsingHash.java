/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.HashMap;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author SOFTWARE
 */
public class MapUsingHash {

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

        if (entities[hash] != null && entities[hash].Key.equals(key)) {
            return entities[hash].Value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].Key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {

        public Entity(String Key, String Value) {
            this.Key = Key;
            this.Value = Value;
        }
        String Key;
        String Value;

    }

    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();
        map.put("Mango", "King of Fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "My favourite Fruit");

        System.out.println(map.get("Apple"));

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("shailesh", 99);
//        map.put("Kunal", 89);
//        map.put("Rahuk", 79);
//
//        System.out.println(map.get("Kunal"));
//        System.out.println(map.getOrDefault("approv", 78));
    }
}
