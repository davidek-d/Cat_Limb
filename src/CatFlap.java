import java.util.ArrayList;



public class CatFlap {
    private flapState flapState;
    private ArrayList<Cat> registeredCats;

    public static void main(String[] args) {
        CatFlap system = new CatFlap();
        // Vi tilføjer lige nogle katte
        system.populateCatList();
    }

    public CatFlap() {
        this.flapState = flapState.LUKKET;
    }

    public flapState getMode() {
        return flapState;
    }
    public void setMode(flapState flapState) {
        this.flapState = flapState;
    }

    public boolean canEnter(Cat cat ) {
        int catId = cat.getChipId();
        for (Cat entry : registeredCats) {
            // Hvis katten som vi tjekker efter findes i listen
            if (cat.getChipId() == catId);
        }
        // Så returner at den godt må åbne
        return true;
    }

    public boolean canExit (Cat cat) {
        return false;
    }
    /**
     * Er katten registeret
     * @param cat
     * @return
     */
    public boolean catRegistered(Cat cat) {

    }


    public void registerCat(Cat cat) {
        registeredCats.add(cat);

        // Kun registrerede katte må komme ind, men alle katte (registrerede eller ej) må gå ud
        // hvis indstillingen tillader det.

    }

    public void getRegisteredCatsCount() {}

    private void populateCatList () {
        registeredCats.addAll(java.util.List.of(
                new Cat( 1),
                new Cat( 2),
                new Cat( 3)));
    }

}
