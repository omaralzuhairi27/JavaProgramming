package week02.src.ExerciseHiker;


import java.util.ArrayList;
import java.util.List;

public class Hikeagent {

   /*/ List<Hiker> hikers=new ArrayList<>();

    public void showHikers(List<Hiker> hikers){
      //  GathererAgent gathererAgent=new GathererAgent();
      // hikers= gathererAgent.signUp();
        for (Hiker name:hikers) {
            System.out.print("["+name.getName()+"]");
        }

    }
*/
   private List<Hiker> hikers = new ArrayList<>();
    public void signUp() {
        GathererAgent gathererAgent = new GathererAgent();
        hikers.addAll(gathererAgent.signUp());
    }
    public void showHikers() {
        for (Hiker hiker : hikers) {
            System.out.println(hiker.getName());
        }
    }
   // gathererAgent.signUp();


}
