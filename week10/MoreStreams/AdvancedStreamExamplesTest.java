package week10.MoreStreams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdvancedStreamExamplesTest {

    @Test
    void limit_shortCircuiting() {
        System.out.println("limit_shortCircuiting");

        List<String> stringList = Arrays.asList("a", "b", "a", "c", "d", "a");

        List<PeekObject> result = AdvancedStreamExamples
                .limit_shortCircuiting(stringList, 4);
        System.out.println("test result: "+result.size());
             assertEquals(result.size(),4);
             //asserThat

    }

    @Test
    void sorted_notShortCircuiting() {
        System.out.println("sorted_notShortCircuiting");

        List<String> stringList = Arrays.asList("a", "b", "a", "c", "d", "a");

        List<PeekObject> result = AdvancedStreamExamples
                .sorted_notShortCircuiting(stringList, 2);
        System.out.println("test result: "+result.size());
        assertEquals(result.size(),2);

    }
}