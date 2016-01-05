package Comparator;

import java.util.Arrays;

public class MainComparatorExample
{

	public static void main(String args[])
	{
		Student student[] = new Student[5];

		student[0] = new Student();
		student[0].setName("Nick");
		student[0].setGrade(19);

		student[1] = new Student();
		student[1].setName("Helen");
		student[1].setGrade(12);

		student[2] = new Student();
		student[2].setName("Ross");
		student[2].setGrade(16);
		
		student[3] = new Student();
		student[3].setName("David");
		student[3].setGrade(13);
		
		student[4] = new Student();
		student[4].setName("John");
		student[4].setGrade(9);

		System.out.println("Order of students before sorting is: ");

		for (int i = 0; i < student.length; i++)
		{
			System.out.println(student[i].getName() + "\t" + student[i].getGrade());
		}

		Arrays.sort(student, new GradeComparator());
		System.out.println("Order of students after sorting by student grade is");

		for (int i = 0; i < student.length; i++)
		{
			System.out.println(student[i].getName() + "\t" + student[i].getGrade());
		}

		Arrays.sort(student, new NameComparator());
		System.out.println("Order of students after sorting by student name is");

		for (int i = 0; i < student.length; i++)
		{
			System.out.println(student[i].getName() + "\t" + student[i].getGrade());
		}
	}

}
