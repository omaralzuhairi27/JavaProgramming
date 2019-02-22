package week05.src.Example2;

import week05.src.Exercise1.Step;

public class AddSeat implements Step {
    @Override
    public void perform(Chair chair) {
        System.out.println("Adding the seat");
        chair.setSeat(true);
    }
}
