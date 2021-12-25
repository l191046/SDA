package Business;

import java.util.ArrayList;

public class SorterByTime implements ViableRoutesSorter {
    
    public void sort(ViableRoutes viableRoutes){
        ArrayList<Route> Routes = viableRoutes.getRoutes();
        TimeCalculator timeCalculator = new TimeCalculator();
        for(int i = 0; i < Routes.size();i++){
            int maxi = i;
            float maxTime = timeCalculator.returnTotalTime(Routes.get(i));
            for(int j = i+1;j< Routes.size();j++){
                float thisCost = timeCalculator.returnTotalTime(Routes.get(j));
                if(thisCost> maxTime){
                    maxTime= thisCost;
                    maxi = j;
                }
            }
            Route temp = Routes.get(i);
            Routes.set(i, Routes.get(maxi));
            Routes.set(maxi, temp);
        }
    
    }
  
}
