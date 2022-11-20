package chapter8;

import java.util.Arrays;

import static chapter8.Day.FRIDAY;
import static chapter8.Day.TUESDAY;

public class Main {
    public static void main(String[] args) {
      //  Nativee amirah = new Nativee(TUESDAY);
        //amirah.setDayOfBirth(FRIDAY);
        for (Day day: Day.values()){
            System.out.println(day);
        }
   //   Region region = Region.SOUTH_SOUTH;
//        System.out.println(Arrays.toString(region.getStates()));
//        Region region1 = Region.SOUTH_EAST;
//        System.out.println(Arrays.toString(region1.getStates()));
//        Region region2 = Region.SOUTH_North;
//        System.out.println(Arrays.toString(region2.getStates()));
      // System.out.println(Arrays.toString(region.getStates()));
        Region region1 = Region.SOUTH_EAST;
        String [] state = {"Lagos", "Osun", "Ogun", "Ekiti", "Ondo"};
        // region1.setStates(state);
        System.out.println(Arrays.toString(region1.getStates()));

    }
}
