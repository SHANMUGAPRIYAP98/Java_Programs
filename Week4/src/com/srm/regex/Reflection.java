package com.srm.regex;
class Reflex{}
class Reflection {
	public static void main(String[] args)   {
	 Reflex r=new Reflex();
	 Class cls;
	try {
		 cls=r.getClass();
		 System.out.println(cls.getPackageName());
		 System.out.println(cls.isArray());
		 System.out.println(cls.getName());
		 System.out.println(cls.isPrimitive());
		 System.out.println(cls.getTypeName());
		 System.out.println(cls.isInterface());
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
