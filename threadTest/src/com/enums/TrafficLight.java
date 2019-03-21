package com.enums;

public class TrafficLight {
    enum Signal{GREEN, YELLOW, RED};
    Signal color = Signal.RED;

    public void chang(){
        System.out.println(color);
        switch (color){
            case RED: color = Signal.GREEN; break;
            case GREEN: color = Signal.YELLOW; break;
            case YELLOW: color = Signal.RED; break;
        }
    }
    public String toString(){
        return "The Trffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i=0; i<7; i++){
            System.out.print(i+" : ");
            trafficLight.chang();
        }
    }
}
