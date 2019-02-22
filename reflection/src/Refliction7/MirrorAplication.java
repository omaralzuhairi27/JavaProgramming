package reflection.src.Refliction7;

public class MirrorAplication {
    public static void main(String[] args) {
        NummberMirror nummberMirror=new NummberMirror();
        Integer number=1000;
        nummberMirror.mirror(number);

        System.out.println(nummberMirror.specialMirror(number));

    }
}
