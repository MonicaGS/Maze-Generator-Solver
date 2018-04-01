
public class Point {
		public int x;
		public int y;
		
		Point()
		{
			x = -1;
			y = -1;
		}
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public Point getPoint()
		{
			Point p = new Point(this.x, this.y);
			return p;
		}
}
