/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class Genericos {
    public static class Lista<T extends Persona> {
        T a;
        public int dameId() {
            return a.getId();
        }
        public void add(T a) {
            this.a = a;
        }
    }
    
    public static class Elemento<K, V> {

        K key;
        V value;

        public Elemento(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

    }

   /*
    public static class Elemento {

        Object key;
        String value;

        public Elemento(Object key, String value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
     public static class Elemento {
        int key;
        String value;

        public Elemento(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
    public static class ElementoChar {
        char key;
        String value;

        public ElementoChar(char key, String value) {
            this.key = key;
            this.value = value;
        }

        public char getKey() {
            return key;
        }

        public void setKey(char key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
     */
}
