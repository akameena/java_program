import java.util.*;

class Car{

public static void main(String[] args){

int[] d= {20, 76, 43, 10, 90, 66, 21};

Scanner sc= new Scanner(System.in);
System.out.println("Please enter number to be found");
int num= sc.nextInt();
Arrays.sort(d);

for(int i=0; i< d.length; i++){
System.out.print(d[i]+"    ");
}

int index= Arrays.binarySearch(d, num);
System.out.println();
if(index>= 0)
System.out.println("Index is: "+index);

else
System.out.println("Number not found");

}

}