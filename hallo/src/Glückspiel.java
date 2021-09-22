
public class Glückspiel {
static byte alter = 15;
static String Name = "Freddy";

	public static void main(String[]args) {

double randomValue = Math.random();
if(alter >= 16) {System.out.println(randomValue * 100);
System.out.print(Name);
if (randomValue <= 0.43){System.out.println(" won");}
else {System.out.println("lost");
}
}else if(alter < 16) {System.out.println("Zu jung");}
}
	}
