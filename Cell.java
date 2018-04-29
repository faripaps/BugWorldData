import javax.swing.*;

public class Cell extends JPanel {
    private int positionX;
    private int positionY;
    private int coordinateX;
    private int coordinateY;


    public final String BLACKBUGHOMECHAR="-";
    public final String  REDBUGHOMECHAR="+";
    public static final int MARKER_ON = 1;
    public static final int MARKER_OFF = 0 ;
    private boolean hasObstacle;
    private int numberOfFoodParticles ;
    private boolean isHomeForRedbugs ;
    private boolean isHomeForBlackbugs;



    public Cell() {

    }

    public Cell(int coordinateX, int coordinateY,boolean hasObstacle, int numberOfFoodParticles) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.hasObstacle = hasObstacle ;
        this.isHomeForBlackbugs = false;
        this.isHomeForRedbugs = false;
        this.numberOfFoodParticles = numberOfFoodParticles;
        //bug = null;
    }
    public Cell(int coordinateX, int coordinateY, int numberOfFoodParticles) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.hasObstacle = false ;
        this.numberOfFoodParticles = numberOfFoodParticles;
        this.isHomeForRedbugs=false;
        this.isHomeForBlackbugs=true;
        //bug = null;

    }

    public Cell(int coordinateX, int coordinateY,boolean hasObstacle) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.hasObstacle = hasObstacle ;
        this.numberOfFoodParticles = 0;
        this.isHomeForRedbugs=false;
        this.isHomeForBlackbugs=true;
        //bug = null;

    }
    public Cell(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.hasObstacle = false ;
        this.numberOfFoodParticles = 0;
        this.isHomeForRedbugs=false;
        this.isHomeForBlackbugs=false;
        //bug = null;

    }

    public Cell(int coordinateX, int coordinateY, String readSymbol) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.hasObstacle = false ;
        this.numberOfFoodParticles = 0;
        //bug = null;
        // to change this
        if (readSymbol.equals(BLACKBUGHOMECHAR) && !readSymbol.equals(".")){
            this.isHomeForBlackbugs= true;
        }else if(readSymbol.equals(REDBUGHOMECHAR) && !readSymbol.equals(".")) {
            this.isHomeForRedbugs = true;
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    //getter and setter for Cell data. These require cell object as an augument


    public boolean isHasObstacle() {
        return hasObstacle;
    }

    public void setHasObstacle(boolean hasObstacle) {
        this.hasObstacle = hasObstacle;
    }

    public int getNumberOfFoodParticles() {
        return numberOfFoodParticles;
    }

    public void setNumberOfFoodParticles(int numberOfFoodParticles) {
        this.numberOfFoodParticles = numberOfFoodParticles;
    }

    public boolean isHomeForReds() {
        return isHomeForRedbugs;
    }

    public void setHomeForReds(boolean homeForReds) {
        isHomeForRedbugs = homeForReds;
    }

    public boolean isHomeForBlacks() {
        return isHomeForBlackbugs;
    }

    public void setHomeForBlacks(boolean homeForBlacks) {
        isHomeForBlackbugs = homeForBlacks;
    }



}

