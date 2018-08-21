import java.util.Arrays;

class Car{

public static void main(String[] args){

int[] d= {20, 76, 43, 10, 90, 66, 21};
for(int i=0; i< d.length; i++){
System.out.print(d[i]+"    ");
}
Arrays.sort(d);
System.out.println();
System.out.println("After Sorting");

for(int i= (d.length-1); i>= 0; i--){
System.out.print(d[i]+"    ");
}

}

}