package week13.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {
    Map <String, String> opposites = getOpposites();

    private Map <String, String> getOpposites() {

        return Map.of("NORTH", "SOUTH",
                "SOUTH", "NORTH",
                "EAST", "WEST",
                "WEST", "EAST");
       /* Map <String, String> opposites = new HashMap <>();
        opposites.put("NORTH", "SOUTH");
        opposites.put("SOUTH", "NORTH");
        opposites.put("EAST", "WEST");
        opposites.put("WEST", "EAST");
        return opposites;*/
    }

    public List <String> dirReduc(List <String> directions) {
        if (directions.isEmpty()) {
            return new ArrayList <>();
        }
        if (directions.size() == 1) {
            return directions;
        }
        int position = 0;
        while (canRemoveElements(directions, position)) {
            position = removeElements(directions, position);
            position++;
        }
        return directions;
    }

    private int removeElements(List <String> directions, int position) {
        String element1 = directions.get(position);
        String element2 = directions.get(position + 1);
        if (areOpposite(element1, element2)) {
            directions.remove(position);
            directions.remove(position);
            position = 0;
        }
        return position;
    }

    private boolean canRemoveElements(List <String> directions, int position) {
        int numberOfElements = directions.size();
        return numberOfElements >= 2 && position < numberOfElements - 1;
    }

    private Boolean areOpposite(String element1, String element2) {
        String opposite = opposites.get(element1);
        return opposite.equals(element2);

    }

}
