package week10.MoreStreams;

import java.util.List;
import java.util.stream.Collectors;

public class AdvancedStreamExamples {

    public static List <PeekObject> limit_shortCircuiting(List <String> stringList,
                                                          int limit) {
        return stringList.stream()
                .map(PeekObject::new)
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static List <PeekObject> sorted_notShortCircuiting(List <String> stringList, int limit) {
        List <PeekObject> collect = stringList.stream()
                .map(PeekObject::new)
                .sorted((left, right) ->
                        left.getMessage().compareTo(right.getMessage()))
                .limit(limit)
                .collect(Collectors.toList());
        return collect;
    }
}
