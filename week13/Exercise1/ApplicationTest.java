package week13.Exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ApplicationTest {
    private List<String> input = new ArrayList <>(Arrays.asList("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"));

    @Test
    void dirReduc() {
        Application application = new Application();
        List <String> reduc = application.dirReduc(input);
        List <String> expected = Arrays.asList("NORTH", "WEST");
    }
}