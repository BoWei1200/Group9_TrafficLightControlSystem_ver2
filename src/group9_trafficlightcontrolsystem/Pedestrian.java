/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Pedestrian implements Runnable{
    
    TrafficModel tm ;
    TrafficLightControl trafficControl;
    private String from;
    
    public Pedestrian(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){       
        while(true){
            try {
                Thread.sleep(1000);
                trafficControl.generatePedestrian();
            }catch(InterruptedException ex){
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}