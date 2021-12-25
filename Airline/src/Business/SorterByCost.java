/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

public class SorterByCost implements ViableRoutesSorter {
    
    public void sort(ViableRoutes viableRoutes){
        ArrayList<Route> Routes = viableRoutes.getRoutes();
        CostCalculator costCalculator = new CostCalculator();
        for(int i = 0; i < Routes.size();i++){
            int maxi = i;
            float maxCost = costCalculator.returnTotalCost(Routes.get(i));
            for(int j = i+1;j< Routes.size();j++){
                float thisCost = costCalculator.returnTotalCost(Routes.get(j));
                if(thisCost> maxCost){
                    maxCost = thisCost;
                    maxi = j;
                }
            }
            Route temp = Routes.get(i);
            Routes.set(i, Routes.get(maxi));
            Routes.set(maxi, temp);
        }
    
    }
    
    
}
