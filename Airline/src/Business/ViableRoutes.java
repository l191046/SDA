/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

public class ViableRoutes {
    ArrayList<Route> Routes;
    
    public ViableRoutes(){
        Routes = new ArrayList<Route>();
    }

    public ArrayList<Route> getRoutes() {
        return Routes;
    }

    public void setRoutes(ArrayList<Route> Routes) {
        this.Routes = Routes;
    }
    
    public void addRoute(Route obj){
        Routes.add(obj);
    }
    
    public void printRoutes(){
        
        for(int i  =0; i< Routes.size();i++){
            int size = Routes.get(i).getFlights().size();
            for(int j = 0; j < Routes.get(i).getFlights().size();j++){
                System.out.print(Routes.get(i).getFlights().get(j).getSource().getCode().toString() + " ");
            }
            System.out.print(Routes.get(i).getFlights().get(size-1).getDestination().getCode());
            System.out.println();
        }
        
    }
    
}
