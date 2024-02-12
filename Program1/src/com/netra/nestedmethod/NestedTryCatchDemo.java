package com.netra.nestedmethod;

 class NestedTryCatch {

	public static void check() {
		String str = "TNS";
		int slength = str.length();
		System.out.println("String length: " + slength);
		String anotherString = null;
		int y = 6;
		try {
			
			try {

				System.out.println(str.charAt(y)); 

			} catch (StringIndexOutOfBoundsException ex) {
				System.err.println("index is out of bounds" + ex.getMessage());

			}
			System.out.println("String length: " + anotherString.length());

		} catch (NullPointerException npe) {
			System.err.println("Exception is thrown " + npe.getMessage());
		}
	}
}
public class NestedTryCatchDemo {
	
		public static void main(String[] a) {
			
			NestedTryCatch.check();
		}
		
	}

