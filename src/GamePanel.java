// imports
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    final int OriginalTileSize = 16;
    final int scale = 3;

    final int TileSize = OriginalTileSize * scale;
    final int MaxScreenCol = 16;
    final int MaxScreenRow = 12;
    
    final int ScreenWidth = TileSize * MaxScreenCol;
    final int ScreenHeight = TileSize * MaxScreenRow;

    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setDoubleBuffered(true);
    }
}
