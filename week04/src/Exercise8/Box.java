package week04.src.Exercise8;

public class Box {

    private String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content='" + content + '\'' +
                '}';
    }
}
