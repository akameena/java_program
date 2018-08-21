class Obama extends Citizen implements Politician,Father{

public void winPoll(){
System.out.println("Obama wins poll");
}
public void care(){
System.out.println("Obama care for his child");
}
public static void main(String[] args){

Obama o= new Obama();
o.winPoll();
o.care();
o.usCitizen();
System.out.println("Obama having votes: "+o.totalVotes);
}
}

interface Politician{
void winPoll();
void care();
int totalVotes= 500000;
}

interface Father{
void care();
}

class Citizen{
void usCitizen(){
System.out.println("Obama is US Citizen");
}
}
