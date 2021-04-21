class Rectangle {
	int x, y, width, height;
	public Rectangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this. width = width;
		this. height = height;
	}
	public static Rectangle intersectRectangle(Rectangle R1 , Rectangle R2) {
		if (!isIntersect(R1,R2)) {
			return new Rectangle(0,0,-1,-1);
		}
		return new Rectangle(
				Math.max(R1.x , R2.x), Math.max(R1.y , R2.y),
				Math.min(R1.x + R1.width, R2.x + R2.width) - Math.max(R1.x , R2.x),
				Math.min(R1.y + R1.height, R2.y + R2.height) - Math.max(R1.y , R2.y));
	}
	public static boolean isIntersect(Rectangle R1 , Rectangle R2) {
		return R1.x <= R2.x + R2.width && R1.x + R1.width >= R2.x
				&& R1.y <= R2.y + R2.height && R1.y + R1.height >= R2.y;
	}
	public static void display() {
		Rectangle r=Rectangle.intersectRectangle(new Rectangle(0,0,1,2),new Rectangle(2,2,1,2));
		System.out.println(r.x+" "+r.y+" "+r.width+" "+r.height);
	}
}

public class A1qno16 {
    public static void main(String[] args) {
        Rectangle.display();
    }
}
