import java.util.ArrayList;



public class CatFlap {
    private static flapState flapState;
    private ArrayList<Cat> catsInTheHouse;


    public static void main(String[] args) {
        CatFlap system = new CatFlap(flapState.LUKKET);
    }


    public CatFlap(flapState flapState) {
        this.flapState = flapState.LUKKET;
    }

    public flapState getMode() {
        return flapState;
    }
    public void setMode(flapState flapState) {
        this.flapState = flapState;
    }

    public boolean canEnter(Cat cat ) {
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
        return true;
    }


    public void registerCat(int chipId) {
        // tilføj
    }

    public void getRegisteredCatsCount() {}

    private void populateCatList () {
        catsInTheHouse.addAll(java.util.List.of(
                new Cat("Tom", 1),
                new Cat("Jerry", 2),
                new Cat("Torben", 3)));
    }

}
