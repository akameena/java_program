class Car{


public static void main(String[] args){

int[][] data= new int[3][3];

for(int i= 0; i< data.length; i++){
for(int j= 0; j< data[i].length; j++){

data[i][j]= (int)(Math.random()*100);
//System.out.println("Value at["+i+"]["+j+"] index is: "+data[i][j]+"    ");
System.out.print(data[i][j]+"       ");

}
System.out.println("");
}



}

}