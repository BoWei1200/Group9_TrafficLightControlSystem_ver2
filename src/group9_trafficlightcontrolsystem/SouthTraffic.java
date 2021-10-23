/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group9_trafficlightcontrolsystem;

/**
 *
 * @author user
 */
public class SouthTraffic extends Thread{
     TrafficLightControl trafficControl;
    
    public SouthTraffic(TrafficLightControl trafficControl){
        this.trafficControl = trafficControl;
    }
    
    public void run(){
        try{
            
            while(true){
                trafficControl.allowSouth();
                Thread.sleep(1000);
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }   
    }
}
