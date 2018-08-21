class Car{

public static void main(String[] args){

int[] marks= new int[5];

/*marks[0]= 10;
marks[1]= 20;
//marks[2]= 30;
marks[3]= 40;
marks[4]= 50;
*/


String[] str= {"Hi","Hello","Java","Nikhil","Android"};



for(int i= 0; i< 5; i++){
marks[i]= (int)(Math.random()*10000);
System.out.println("int Value at "+i+" index is: "+marks[i]);
System.out.println("String Value at "+i+" index is: "+str[i]);

}

}

}