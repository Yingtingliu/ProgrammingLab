package ttest;

import java.nio.file.Watchable;

public class ExamPrac_Quiz3 {
	
	private int a;
	public ExamPrac_Quiz3(int b) {
		a = b;
	}
	
	private int getA() {
		return a;
	}
	
	private void setA(int b) {
		a=b;
	}
	
	public static void add(int s) {
		s+=3;
	}
	
	public static void add3Obj(ExamPrac_Quiz3 e) {
		e.setA( 3 + e.getA());
	}
	
	//Main method
	public static void main(String[] args) {
		//Q1-7
//		int a = 5;
//		ExamPrac_Quiz3 ee = new ExamPrac_Quiz3(a);
//		add(10);
//		System.out.println(a);
//		add3Obj(ee); //setA 
//		System.out.println(ee.getA());
		
		//Q8-9		
		ExamPrac_Quiz3 e1 = new ExamPrac_Quiz3(0);
		System.out.println(e1);
		e1.getA();
//		ExamPrac_Quiz3 e2 = new ExamPrac_Quiz3();
//		int b = e2.setA(3);

	}

}
