import org.junit.Test;

public class TraitementTest {

    public static Traitement traitement;

    @Test
    public void runAndWrite(){
        try {
            traitement.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
