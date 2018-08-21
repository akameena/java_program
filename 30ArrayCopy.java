import java.util.Arrays;

class Car{

public static void main(String[] args){

int[] d= {20, 76, 43, 10, 90, 66, 21, 89, 90};
int[] d2= {20, 76, 43, 20, 90, 66, 21, 89};
System.out.print("Equal: "+Arrays.equals(d, d2));
for(int i=0; i< d.length; i++){
System.out.print(d[i]+"    ");
}
int[] newArr= new int[5];
System.arraycopy(d, 2, newArr, 0, 5);

System.out.println();
System.out.println("Copied Array");

for(int i=0; i< 5; i++){
System.out.print(newArr[i]+"    ");
}



}

}