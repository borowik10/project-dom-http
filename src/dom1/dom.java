package dom1;


public class dom {
    public static void main(String[] args) {
        System.out.println("Czysty Dom");
        byte numberOfRomms = 10;
        System.out.println("Ilość pokoji w mieszkaniu: " + numberOfRomms);
        System.out.println("Ilość czystych pokoji w mieszkaniu: " + (numberOfRomms - 3));
        System.out.println("Ilość brudnych pokoji w mieszkaniu: " + (numberOfRomms - 7));

    }
}
