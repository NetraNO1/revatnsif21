package com.netra.statical;
class Static{
	static int a=20;
	private int  b=30;
	
	void read() {
		
		System.out.println(b);
		
	}
}
	class StaticDemo{
		static int h;
		public int c;
		
		
  		void display() {
  			c=10;
  			h=20;
  			
  			
  		}
  		static {
  			h=40;
  			System.out.println(h);
  			
  			
  		}
  		
	}
	

public class StaticProgram {

	public static void main(String[] args) {
		Static st=new Static();
		st.read();
		System.out.println(st.a);
	
	
		StaticDemo sd=new StaticDemo();
		
		sd.display();
		System.out.println(sd.c);
	}
}
