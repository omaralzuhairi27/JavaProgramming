package week02.src.ExerciseHiker;


public class HikeApplication {
    public static void main(String[] args) {
       // GathererAgent gathererAgent=new GathererAgent();
       // List<Hiker> newHiker= gathererAgent.signUp();
      //  Hikeagent print=new Hikeagent();
       // print.showHikers(newHiker);
        Hikeagent hikeagent=new Hikeagent();
       hikeagent.signUp();
       hikeagent.showHikers();

    }
}
