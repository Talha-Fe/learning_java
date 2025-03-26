package cis112_week02.lab;

/**
 * Quadrilateral is an object, which contains four Point objects.
 * 
 * Point pA is the leftmost corner among the lowest corners. Points pA, pB, pC,
 * pD are ordered counterclockwise.
 * 
 * @author bingol
 *
 */
public class Quadrilateral extends Polygon {

	private static final boolean DEBUG = true;
	
	Point pA;
	Point pB;
	Point pC;
	Point pD;

	public Quadrilateral(Point pA, Point pB, Point pC, Point pD) {
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
		this.pD = pD;
	}

	@Override
	public double getPerimeter() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		double result = pA.distance(pB)+pB.distance(pC)+pC.distance(pD)+pD.distance(pA);
		
		 return result; 

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public double getArea() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		double d = 0;
		double dAB = pA.distance(pB);
		double dBC = pB.distance(pC);
		double dCD = pC.distance(pD);
		double dDA = pD.distance(pA);
		double dAC = pA.distance(pC);
		d += heron(dAB, dBC, dAC);
		d += heron(dCD, dDA, dAC);
		return d;
	}

	@Override
	public BoundingBox boundingBox() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

	    double minX = Math.min(Math.min(pA.x, pB.x), Math.min(pC.x, pD.x));
	    double maxX = Math.max(Math.max(pA.x, pB.x), Math.max(pC.x, pD.x));
	    double minY = Math.min(Math.min(pA.y, pB.y), Math.min(pC.y, pD.y));
	    double maxY = Math.max(Math.max(pA.y, pB.y), Math.max(pC.y, pD.y));
		
	    double width = maxX - minX;
	    double height = maxY - minY;
	    
		 return new BoundingBox(minX, minY, width, height);

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	private double heron(double a, double b, double c) {
		// https://en.wikipedia.org/wiki/Heron's_formula
		double s = (a + b + c) / 2;
		double x = s * (s - a) * (s - b) * (s - c);
		return Math.sqrt(x);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Quadrilateral q = (Quadrilateral) o;
		return pA.equals(q.pA)//
				&& pB.equals(q.pB)//
				&& pC.equals(q.pC)//
				&& pD.equals(q.pD)//
		;
	}

	@Override
	public String toString() {
		return "[Quadrilateral: "//
				+ "pA=" + pA + ", pB=" + pB//
				+ ", pC=" + pC + ", pD=" + pD + "]";
	}

	public Point getpA() {
		return pA;
	}

	public Point getpB() {
		return pB;
	}

	public Point getpC() {
		return pC;
	}

	public Point getpD() {
		return pD;
	}

}
