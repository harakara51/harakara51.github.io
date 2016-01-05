package examples;

import java.util.TreeSet;

public class SortPoints
{
	public static void main(String[] args)
	{
		Point p1 = new Point(2,4);
		Point p2 = new Point(2,3);
		Point p3 = new Point(5,1);
		Point p4 = new Point(2,4);
		Point p5 = new Point(6,3);
		Point p6 = new Point(1,4);
		
		
		TreeSet <Point> points = new TreeSet<>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		points.add(p6);
		
		for (Point point : points)
		{
			System.out.println(point);
		}
	}
}