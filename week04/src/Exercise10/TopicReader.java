package week04.src.Exercise10;

import week04.src.Exercise7.Topic;
import week04.src.Exercise9.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {
 /*   public  List<String> readDoc(FileReader reader) {
        List<String> lines=reader.getLine("Exercise10/​ topics.txt ​");
        for (String line:lines) {
            System.out.println("Topic list:"+line);

        }
        return lines;
    }*/

    private static Topic toTopic(String line) {
        return new Topic(line);
    }

    public void readTopic(FileReader reader) {

        List <String> lines = reader.getLine("Exercise10/​ topics.txt ​");
        List <Topic> topics = toTopics(lines);
        for (Topic topic : topics) {
            System.out.println("Topic list: " + topic);
        }
    }

    public List <Topic> toTopics(List <String> lines) {
        List <Topic> topics = new ArrayList <>();
        for (String line : lines) {
            Topic topic = toTopic(line);
            topics.add(topic);

        }
        return topics;

    }

    public List <Topic> toSetTopic() {
        FileReader reader = new FileReader();
        List <String> lines = reader.getLine("Exercise10/​ topics.txt ​");
        List <Topic> topics = toTopics(lines);
        return topics;
    }
}
