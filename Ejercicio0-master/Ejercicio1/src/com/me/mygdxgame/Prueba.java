package com.me.mygdxgame;
 class B {
	int x;
	void funcion(){
		System.out.print("herb");
		
	}
	B(){
		System.out.print("Hola ");
		
	}
	B(int num){
		System.out.print("Parametro:" + num);
	}
}
 
public class Prueba {

	public static void main(String[] args) {
		 
		B mi_objeto=new B();
		mi_objeto.x=10;
		System.out.print(mi_objeto.x);
		
		B mi_otro_obj=new B();
		mi_otro_obj.x=20;
		System.out.print(" ");
		System.out.print(mi_objeto.x);
		System.out.print(" ");
		System.out.print(mi_otro_obj.x);
		
		B obj=new B();
		obj.funcion();
		
		B obje=new B();
		B ob=new B(12);
		

	}

}
