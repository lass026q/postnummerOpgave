package com.company;

public class Postnummer {

        private String by;
        private int postnummer;

        public Postnummer(String by, int postnummer){
            this.by=by;
            this.postnummer=postnummer;
        }

        public String getBy() {
            return by;
        }

        public int getPostnummer() {
            return postnummer;
        }

        @Override
        public String toString() {
            return "By: " + by + ", postnummeret er: " + postnummer;
        }
    }

