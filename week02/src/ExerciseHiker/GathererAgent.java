package week02.src.ExerciseHiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GathererAgent {

    public GathererAgent() {
    }



    Scanner scanner=new Scanner(System.in);

    public String getName(){
        System.out.println("enter the name");
     return scanner.nextLine();
    }
    
    public  List<Hiker> signUp(){
        List<Hiker> nameHiker=new ArrayList<>();
        String name=getName();
        while(!name.isEmpty()){
            Hiker hiker=new Hiker(name);
            nameHiker.add(hiker);
            name=getName();
        }
        AutomaticGatherer automaticGatherer =new AutomaticGatherer();
        List<Hiker> confirmedHikers= automaticGatherer.getConfirmedHikers();
        for(Hiker names:confirmedHikers){
            nameHiker.add(names);
        }
        //System.out.println(nameHiker);
        return nameHiker;
    }


}

