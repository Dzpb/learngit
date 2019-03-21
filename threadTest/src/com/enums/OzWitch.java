package com.enums;

public enum OzWitch {

    WEST("west"),NORTH("north"),EAST("east"),SOUTH("south");

    private String description;
    private OzWitch(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()){
          // System.out.println(witch.getDescription());
            System.out.println(witch);
        }
    }
}
