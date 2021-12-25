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
}
