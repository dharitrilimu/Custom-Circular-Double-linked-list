import java.util.Scanner;
public class CircularlyLinkedList {
public class Player
{
    String name;
	int score;
	Player next;
	Player prev;
	
	public Player(String name,int score) 
	{
		  this.name=name;
		  this.score=score;
	}
}              
public Player head=null;
public Player tail=null;
int counter=0;
public void add(String name,int score) 
{
   Player node=new Player(name,score);
   if (head == null)
         {
			head=node;
			tail=node;
			node.next=head;
			node.prev=head;
         }
	else {
			tail.next=node;
			node.prev=tail;
			tail=node;
			tail.next=head;
			head.prev=node;
		
	      }
counter=counter+1;
}           
public void display()
{  
    Player current = head;  
        if(head == null) 
          {  
            System.out.println("List is empty");  
          }  
        else 
          {  
             
             do{  
                //Prints each node by incrementing pointer.  
            	System.out.print(current.name +" : "+current.score+", ");
            	current = current.next;
                
               }while(current != head);  
            System.out.println();  
          }  
}			  
public void remove(Player player) {
	if(head==null) {
		System.out.println("No player in playerlist");
	}
	else {
		if(player==head) {
			head=player.next;
			
		}
		else if(player==tail){
			tail=player.prev;
			
			
			
		}
		else {
			
		}
		player.prev.next=player.next;
		player.next.prev=player.prev;
		
	}
	
}
public void maximumscore()
{  
    Player current = head;
    String winner = null;
    int max=head.score;
        if(head == null) 
          {  
            System.out.println("List is empty");  
          }  
        else 
          {  
             
             do{ 
            	 if(max<current.score) {
            		max=current.score; 
            		winner=current.name;
            	 }
                
            	current = current.next;
                
               }while(current != head);  
           //Prints each node by incrementing pointer.  
         	System.out.print(winner +" has won the game");  
          }  
}
		
public void game(CircularlyLinkedList list) 
{

	Player current=head;
	int count=counter;
	int flag=0;
	
	
	do {
					
		Scanner sc=new Scanner(System.in);
		System.out.println("roll dice1");
		int diceroll1=sc.nextInt();
		System.out.println("roll dice2");	
		int diceroll2=sc.nextInt();
		System.out.println("roll dice3");		
		int diceroll3=sc.nextInt();
				
			if(diceroll1==1&& diceroll2==1&& diceroll3==1){
				System.out.println(current.name+" rolled snake eyes(three 1's) and has been eliminated :(");
				list.remove(current);
				
			}
			else {
				int total=0;
				total=diceroll1+diceroll2+diceroll3;
				
				if(total==9) {
					System.out.println(current.name+" rolled unlucky 9, score is now "+current.score);
					total=0;
				}
				else {
					
				}
				current.score=current.score+total;
				System.out.println(current.name+" rolled "+current.score+", score is now "+current.score);
			}
			if(current.score>=150) {
				System.out.println("Flag changed");
				flag=1;
			}else {
				flag=0;
			}
			
			current=current.next;
		
	}while(flag!=1 ||count==1);
	System.out.println("Game over");
	if(count==1) {
	
	System.out.println(current.name+" has won the game!:)");
	System.out.println("\n Final scores are "+current.name);
	}
	else {
		maximumscore();
		System.out.println("Final scores are:");
		list.display();
	}
}
	
public static void main(String[] args) {
	CircularlyLinkedList list=new CircularlyLinkedList();
	list.add("Harry", 0);
	list.add("Ron", 0);
	list.add("Hermione", 0);
	list.add("Luna", 0);
	list.game(list);
	
}
}
