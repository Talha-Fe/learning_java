package week02.lab;

import java.io.File;
import java.util.zip.ZipEntry;

import hblib.io.svg.*;

public class CircleTwoV0 {

	public static void main(String[] args) {

		Paper paper = new Paper(0, 0, 2000, 2000);

		int x = 300;
		int y = 300;
		int z = 100; 
			int zPlus = 170; // z*1.7 30* 60* 90*
		
			//Top---------------------------
		
		Circle c1T = new Circle(x, y, z);
		c1T.setColorFill(SVGLib.COLOR_CONIFER);
		c1T.setColorStroke(SVGLib.COLOR_BLACK);
		c1T.setStrokeWidth(5);
		paper.add(c1T);
		
			// Middle---------------------------
		
		Circle c1M = new Circle(x-z, y+3*zPlus, z);
		c1M.setColorFill(SVGLib.COLOR_CONIFER);
		c1M.setColorStroke(SVGLib.COLOR_BLACK);
		c1M.setStrokeWidth(5);
		paper.add(c1M);
	
		Circle c2M = new Circle(x+z, y+3*zPlus, z);
		c2M.setColorFill(SVGLib.COLOR_CONIFER);
		c2M.setColorStroke(SVGLib.COLOR_BLACK);
		c2M.setStrokeWidth(5);
		paper.add(c2M);
		
			//Left---------------------------
		
		Circle c1L = new Circle(x-z, y+zPlus, z);
		c1L.setColorFill(SVGLib.COLOR_CONIFER);
		c1L.setColorStroke(SVGLib.COLOR_BLACK);
		c1L.setStrokeWidth(5);
		paper.add(c1L);
		
		Circle c2L = new Circle(x-2*z, y+2*zPlus, z);
		c2L.setColorFill(SVGLib.COLOR_CONIFER);
		c2L.setColorStroke(SVGLib.COLOR_BLACK);
		c2L.setStrokeWidth(5);
		paper.add(c2L);
		
		Circle c3L = new Circle(x-3*z, y+3*zPlus, z);
		c3L.setColorFill(SVGLib.COLOR_CONIFER);
		c3L.setColorStroke(SVGLib.COLOR_BLACK);
		c3L.setStrokeWidth(5);
		paper.add(c3L);
		
		Circle c4L = new Circle(x-4*z, y+4*zPlus, z);
		c4L.setColorFill(SVGLib.COLOR_CONIFER);
		c4L.setColorStroke(SVGLib.COLOR_BLACK);
		c4L.setStrokeWidth(5);
		paper.add(c4L);
		
		Circle c5L = new Circle(x-5*z, y+5*zPlus, z);
		c5L.setColorFill(SVGLib.COLOR_CONIFER);
		c5L.setColorStroke(SVGLib.COLOR_BLACK);
		c5L.setStrokeWidth(5);
		paper.add(c5L);
		
			//Right---------------------------
		
		Circle c1R = new Circle(x+z, y+zPlus, z);
		c1R.setColorFill(SVGLib.COLOR_CONIFER);
		c1R.setColorStroke(SVGLib.COLOR_BLACK);
		c1R.setStrokeWidth(5);
		paper.add(c1R);
		
		Circle c2R = new Circle(x+2*z, y+2*zPlus, z);
		c2R.setColorFill(SVGLib.COLOR_CONIFER);
		c2R.setColorStroke(SVGLib.COLOR_BLACK);
		c2R.setStrokeWidth(5);
		paper.add(c2R);
		
		Circle c3R = new Circle(x+3*z, y+3*zPlus, z);
		c3R.setColorFill(SVGLib.COLOR_CONIFER);
		c3R.setColorStroke(SVGLib.COLOR_BLACK);
		c3R.setStrokeWidth(5);
		paper.add(c3R);
		
		Circle c4R = new Circle(x+4*z, y+4*zPlus, z);
		c4R.setColorFill(SVGLib.COLOR_CONIFER);
		c4R.setColorStroke(SVGLib.COLOR_BLACK);
		c4R.setStrokeWidth(5);
		paper.add(c4R);
		
		Circle c5R = new Circle(x+5*z, y+5*zPlus, z);
		c5R.setColorFill(SVGLib.COLOR_CONIFER);
		c5R.setColorStroke(SVGLib.COLOR_BLACK);
		c5R.setStrokeWidth(5);
		paper.add(c5R);
		
		String fileName = "CircleManyV0";
		String pathToFile = "_generatedV1" //
				+ File.separator + "week02" //
				+ File.separator;

		paper.toHtml(pathToFile, fileName);
	}

}
