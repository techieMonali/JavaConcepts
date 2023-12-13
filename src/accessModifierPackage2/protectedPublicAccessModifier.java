package accessModifierPackage2;

import accessModifierPackage1.publicAccessModifier;

//public class protectedPublicAccessModifier extends defaultAccessModifier{//not possible as default can not 
	//be accessible outside of package

//we can not access private and default variable outside of package
public class protectedPublicAccessModifier extends publicAccessModifier{
	public static void main(String[] args) {
		protectedPublicAccessModifier obj = new protectedPublicAccessModifier();
	//	System.out.println("Private number : "+obj.number); //giving error
		System.out.println("Protected number : "+obj.no); 
		System.out.println("Public number : "+obj.num);
	//	System.out.println("Default number : "+obj.nmbr); //giving error
	}
}
