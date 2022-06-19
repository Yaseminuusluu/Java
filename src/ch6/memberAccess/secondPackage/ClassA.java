package ch6.memberAccess.secondPackage;

class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassP p = new ClassP();
		System.out.println(p.x);
		System.out.println(p.y);//ayný pakette olduðu için eriþilir
		System.out.println(p.z);//ayný pakette olduðu için eriþilir
		//System.out.println(p.t);
		
		p.publicMethod();
		p.privateMethod();
		p.protectedMedhot();
		 

	}

}
