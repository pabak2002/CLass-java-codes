

//interface demo1 {
//	void abc1();
//	static void show1() {System.out.println("static show1(): in demo1");}
//	default void show2() {System.out.println("default show2(): in demo1");}}
//
//class demo1cls implements demo1 {
//	public void abc1() {System.out.println("abc1(): in demo1cls");} 
//	static void show1() {System.out.println("static show1(): in demo1cls");}
//	public void show2() {System.out.println("show2(): in demo1cls");} 
//	public void show3() {System.out.println("show3(): in demo1cls");}}
//
//public class pc_8interface3_defaultstatic {
//	public static void main(String[] args) {
//		demo1 d1 = new demo1cls();
//		d1.abc1();
//		demo1.show1();	demo1cls.show1();
//		d1.show2();
//		demo1cls d2 = new demo1cls();
//		d2.show3();
//		new demo1cls().show3(); 	} }



interface demo1 {
	void abc1();
	static void show1() {System.out.println("static show1(): in demo1");}
	default void show2() {System.out.println("default show2(): in demo1");} }

interface demo2 {
	default void show2() {System.out.println("default show2(): in demo2");}}
//	void show2();}

class demo1cls implements demo1,demo2 {
	public void abc1() {System.out.println("abc1(): in demo1cls");} 
	static void show1() {System.out.println("static show1(): in demo1cls");}
	public void show2() {System.out.println("show2(): in demo1cls");}
//	public void show2() {demo1.super.show2();} 
	public void show3() { System.out.println("show3(): in demo1cls");}}

public class pc_8interface3_defaultstatic {
	public static void main(String[] args) {
		demo1 d1 = new demo1cls();
		d1.abc1();
		demo1.show1();	demo1cls.show1();
		d1.show2();
		new demo1cls().show3();
	} }
