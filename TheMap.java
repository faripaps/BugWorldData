
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class TheMap extends JPanel {
    public World world = new World(); // to be able to access the Cell[][] cells object so that the map can render object as a function of Cell attributes

    public static final Color CELL_EMPTY = new Color(255,255,255);
    public static final Color CELL_HAS_OBSTACLE = new Color(0,0,0);
    public static final Color BLACK_BUG_HOME_CELL = new Color(102,102,255);
    public static final Color CELL_HAS_FOOD = new Color(51,153,0);

    public static final Color RED_BUG_HOME_CELL = new Color(0, 153, 153);

    public static final Color[] TERRAIN = {
            CELL_EMPTY,
            CELL_HAS_OBSTACLE,
            BLACK_BUG_HOME_CELL,
            RED_BUG_HOME_CELL,
            CELL_HAS_FOOD
    };

    public static final int NUM_ROWS = 10;//  take value of the sizeY
    public static final int NUM_COLS =10 ;//take value of the sizeX

    public static final int PREFERRED_GRID_SIZE_PIXELS = 10;

    // In reality you will probably want a class here to represent a map tile,
    // which will include things like dimensions, color, properties in the
    // game world.  Keeping simple just to illustrate.
    private final Color[][] terrainGrid;

    public TheMap(){
        this.terrainGrid = new Color[NUM_ROWS][NUM_COLS];
        Random r = new Random();
        // Randomize the terrain
        Color randomColor = TERRAIN[0];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                // this is where cell object such as foodParticle, objetcs will be displayed.
                int randomTerrainIndex = r.nextInt(TERRAIN.length);
                randomColor = TERRAIN[randomTerrainIndex];
                this.terrainGrid[i][j] = randomColor;
                // System.out.println("[" + i + "]" + "[" + i +"]");
            }
        }
        int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXELS;
        int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXELS;
        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
    }

    @Override
    public void paintComponent(Graphics g) {
        // Important to call super class method
        super.paintComponent(g);
        // Clear the board
        g.clearRect(0, 0, getWidth(), getHeight());
        // Draw the grid
        int rectWidth = getWidth() / NUM_COLS;
        int rectHeight = getHeight() / NUM_ROWS;

        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                // Upper left corner of this terrain rect
                int x = i * rectWidth;
                int y = j * rectHeight;
                Color terrainColor = terrainGrid[i][j];
                g.setColor(terrainColor);
                g.fillRect(x, y, rectWidth, rectHeight);
                //it is here where cell object has to be rendered  as a function of the x,y  cell addressing
                System.out.println("[" + i + "]" + "[" + i +"]");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("The Bug World Game");
                TheMap map = new TheMap();
                frame.add(map);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
