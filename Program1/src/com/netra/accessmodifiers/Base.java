package com.netra.accessmodifiers;

class Method{
	
	int varDefault =10;
	public int varPublic =20;
	private int varPrivate =30;
	protected int varProtected =50;
	
	
	void defaultMethod() {
		System.out.println("Default variable "+varDefault);
		System.out.println("Default Method");
	}
	
    public void publicMethod() {
    	 System.out.println("Public variable"+varPublic);
    	 System.out.println("Public Method");
    	 
     }
    private void privateMethod() {
    	System.out.println("Private variable" +varPrivate);
    	System.out.println("Private Method");
    }
    protected void protectedMethod() {
    	System.out.println("Protected variable" +varProtected);
        System.out.println("Protected Method");
    }
}
  public class Base {
  
	  public static void main(String[] args) {
		Method M=new Method();
		M.defaultMethod();
		M.publicMethod();
		M.protectedMethod();
		
	}
  }