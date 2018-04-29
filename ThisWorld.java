  /* import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ThisWorld {
    public final String OBSTACLESYMBOL="#";
    public final String CLEARSYMBOL=".";
    public final String BLACKBUGHOMESYMBOL="-";
    public final String  REDBUGHOMESYMBOL="+";

    private String name;
    private int sizeX;
    private int sizeY;
    public char[][] worldMapData = new char[sizeX][sizeY];
    public  Cell[][] cells ;// = new Cell[sizeX][sizeY]; // 2-dimensional array to store cell object
    public ThisWorld(){

    }
    public ThisWorld(int xDimension,int yDimension){
        this.setSizeX(xDimension);
        this.setSizeY(yDimension);
        this.worldMapData = new char[xDimension][yDimension];
    }
    // accessor method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {

        this.sizeY=sizeY;
    }
    public void loadThisWorldMapData(){

    }
    public void displayWorldData (){
        try {
            for (int i = 0; i < this.sizeY; i++) {
                for(int j = 0 ; j < this.sizeX; j++){
                    System.out.println("Cell[" + i + "][" + j + "] => " + this.worldMapData[i][j]);
                }
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }


    public void loadWorldMap(char[][] woldData) {
        cells = new Cell[this.getSizeX()][this.getSizeY()];
        // this method reads the character data from a 2-dimensional arrays and populates the 2-dimensional array that holds the Cell object references
        String  readSymbol="."; // holds the value read from the array where the data from the text file with world map was
        // read into
        try {
            int xDimension = this.getSizeX();
            int yDimension = this.getSizeY();
            for (int i = 0; i < yDimension; i++) {
                for (int j = 0; j < xDimension; j++) {
                    readSymbol = Character.toString(woldData[i][j]);
                    //System.out.println("Cell[" + i + "][" + j + "] :" + woldData[i][j]);

                    if (readSymbol.equals(OBSTACLESYMBOL)) {
                        cells[i][j] = new Cell(i, j, true);
                    } else if (readSymbol.equals(CLEARSYMBOL)) {
                        //System.out.println("Creating Clear cell" + i + j );
                        cells[i][j] = new Cell(i, j);
                    } else if (readSymbol.equals(BLACKBUGHOMESYMBOL)) {
                        //System.out.println("Home for red Black bug is true at " + i + " " + j);
                        cells[i][j] = new Cell(i, j,BLACKBUGHOMESYMBOL);
                        //homeForBlackBug.add(cells[i][j]);
                    } else if (readSymbol.equals(REDBUGHOMESYMBOL)) {
                        //System.out.println("Home for red Bug is true at " + i + " " + j);
                        cells[i][j] = new Cell(i, j,REDBUGHOMESYMBOL);
                        // homeForRedBug.add(cells[i][j]);
                    } else if (Integer.valueOf(readSymbol) instanceof Integer) {
                        cells[i][j] = new Cell(i, j, Integer.parseInt(readSymbol));
                    }


                }
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }
    public void displayWorldCellData (){
        for( int yCounter = 0 ; yCounter < this.cells.length; yCounter++){
            for( int xCounter = 0;xCounter < this.cells.length; xCounter++) {
                //System.out.println("Cell[" + yCounter + "][" + xCounter + "] :");
                //System.out.println("X-Coordinate: "  + cells[yCounter][xCounter].getCoordinateY());
                //System.out.println("Y-Coordinate: " + cells[yCounter][xCounter].getCoordinateX());
                if(cells[yCounter][xCounter].getNumberOfFoodParticles()!= 0){
                    System.out.print("Cell[" + yCounter + "][" + xCounter + "] :");
                    System.out.println(" has " + cells[yCounter][xCounter].getNumberOfFoodParticles()+ " Food Paticles"  );
                } else if (cells[yCounter][xCounter].isHasObstacle()){
                    System.out.print("Cell[" + yCounter + "][" + xCounter + "] :");
                    System.out.println("an Obstacle");
                }else if (cells[yCounter][xCounter].isHomeForBlacks()) {
                    System.out.print("Cell[" + yCounter + "][" + xCounter + "] :");
                    System.out.println("Cell is home to Black Bugs");
                }else if (cells[yCounter][xCounter].isHomeForReds()){
                    System.out.print("Cell[" + yCounter + "][" + xCounter + "] :");
                    System.out.println("Cell is home to Red Bugs");
                }else{
                    System.out.print("Cell[" + yCounter + "][" + xCounter + "] :");
                    System.out.println("Cell is clear");
                }
                //System.out.println("Food Particles" + cells[yCounter][xCounter].getNumberOfFoodParticles());
                //System.out.println("Obstacle Status (T|F):" + cells[yCounter][xCounter].isHasObstacle());
            }

        }
    }


    public boolean occupied(int xCoordinate,int yCoordinnate) {return false;};
    //public Bug  bug_at(int xCoordinate,int yCoordinnate) { return null;};
   // public int[][] place_at(Bug bug){ int[][] pos= new int[0][0]; return pos;};
    public boolean free(int xCoordinate,int yCoordinnate) {return false;};
    public int set_food_at( int xCoordinate, int yCoordinnate){ return 0;}


}
*/