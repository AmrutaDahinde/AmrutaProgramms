package Interface;

public interface Shine extends Clean,Wash {
        default void polishing() {

        System.out.println("It is polishing");
        }
}