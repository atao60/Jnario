package linking;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class ExampleSpecATable extends ExampleTableRow {
  public ExampleSpecATable(final List<String> cellNames, final int x, final int y) {
    super(cellNames);
    this.x = x;
    this.y = y;
    
  }
  
  private int x;
  
  public int getX() {
    return this.x;
  }
  
  private int y;
  
  public int getY() {
    return this.y;
  }
}
