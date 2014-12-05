package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int index =0;
		int [] v = new int []{12,33,16,15,7};
		int [] w = new int []{33,34,40};
//		
//	System.out.println("v.length= "+ v.length );
//		System.out.println("v[0]= " + v[0]);
//		System.out.println("v[4]= " + v[4]);
//		System.out.println("visitamos todos: ");
//		
//		show(v);
//		show(w);

//		int menor = Min(v);
//		System.out.println("menor= " +menor);
		int index = indexOf(v, 16);
		System.out.println("index= "+index);
	}
	
	public static void show (int[]vector){
		
		for(int index =0;index<vector.length;index++)
			System.out.println(vector[index]);
		

	}
	
	public static int Min (int[] v){
		int minValue= v[0];
		for(int i=1;i<v.length;i++)
			if(v[i] <minValue)
				minValue=v[i];
			
			return minValue;
		
		
	}
	
	public static int indexOf(int[]v, int value){
//		int index = 0;
//		while(index<v.length && v[index] != value)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
			for (int index=0; index<v.length;index++)
				if(v[index]==value)
					return index;
					return -1;
		
	}
	

}
