package cis112_week02.lab;

/**
 * Rectangle, which is parallel to axes. Subclass implementation of Rectangle,
 * where Quadrilateral is the parent.
 * 
 * Point pA is the leftmost corner among the lowest corners. Points pA, pB, pC,
 * pD are ordered counterclockwise.
 * 
 * @author bingol
 *
 */
public class Rectangle extends Quadrilateral {

	/**
	 * pA and pC are the corners of a diagonal.
	 * 
	 * @param pA
	 * @param pC
	 */
	public Rectangle(Point pA, Point pC) {
		super(pA, new Point(pC.x, pA.y), pC, new Point(pA.x, pC.y));
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
