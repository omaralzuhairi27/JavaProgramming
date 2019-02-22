package week04.src.Exercise10;

import week04.src.Exercise9.FileReader;
import week04.src.Exercise7.Topic;



import java.util.HashSet;
import java.util.List;


public class TopicReaderApplication {


    public static void main(String[] args) {
        FileReader reader = new FileReader();
        TopicReader topicReader = new TopicReader();
        // readDoc(reader);
        topicReader.readTopic(reader);
        List <Topic> topics = topicReader.toSetTopic();

        HashSet <Topic> setTopics = new HashSet <>();

        for (Topic topic : topics) {
            setTopics.add(topic);
        }
        for (Topic topic : setTopics) {
            System.out.println("Topic Set: " + topic);
        }


    }


}
