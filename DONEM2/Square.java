package cis112_week02.lab;

/**
 * Square, which is parallel to axes.
 * 
 * Point pA is the leftmost corner among the lowest corners. Points pA, pB, pC,
 * pD are ordered counterclockwise.
 * 
 * @author bingol
 */
public class Square extends Rectangle {

	public Square(Point pA, Point pB) {
		super(pA, new Point(pB.x, pA.distance(pB)));
	}

	@Override
	public double getPerimeter() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		Quadrilateral quad = new Quadrilateral(pA, pB, pC, pD);
		
		 return quad.getPerimeter(); // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/*
	 * commented out
	 */
	@Override
	public double getArea() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		Quadrilateral quad = new Quadrilateral(pA, pB, pC, pD);
		
		 return quad.getArea(); 

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public BoundingBox boundingBox() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		

		
		 return super.boundingBox();

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
