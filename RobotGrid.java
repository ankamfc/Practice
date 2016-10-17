/*import java.awt.Point;
import java.util.ArrayList;


public class RobotGrid {
	ArrayList<Point> current_path = new ArrayList<Point>();
	
	
	public boolean getPaths(int x, int y){
		
		Point p = new Point(x,y);
		current_path.add(p);
		
		if(0==x && 0==y) return false;
		
		boolean success = false;
		
		if(x>1 && isFree(x-1,y))
			success=getPaths(x-1, y);
		
		if(!sucess && isFree(x, y-1))
			success=getPaths(x,y-1);
		
		if(!success) current_path.remove(p);
		return success;
}
}*/