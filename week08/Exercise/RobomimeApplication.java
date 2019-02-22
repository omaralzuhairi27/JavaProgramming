package week08.Exercise;

import java.util.List;

public class RobomimeApplication {

        public static void main(String[] args) {
            FileReader fileReader = new FileReader();
            Sensor sensor = new Sensor();
            List<String> text = fileReader.getLines("week08/Exercise/robomime.txt");
            System.out.println(sensor.decryptTheText(text));


    }
}
