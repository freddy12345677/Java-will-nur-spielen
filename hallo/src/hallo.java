

public class hallo {
	
	
 static void abfrage () {if(alter < 18 || geschlecht == 2) {
		System.out.println(" Hallo " + Name + "!");}
		else if (geschlecht == 1) {System.out.println("Guten Tag Herr " + Name + "!");
		}
		else if (geschlecht == 0) {System.out.println("Herzlich Willkommen Frau " + Name + "!");}
 }
	
 static void spiel () {double randomValue = Math.random();
 if(alter >= 18) {System.out.println(randomValue * 100);
 System.out.print("du hast ");
 if (randomValue <= 0.43){System.out.println("gewonnen");}
 else {System.out.println("verloren ");
 }
 }else if(alter < 16) {System.out.println("nicht das ausreichende Alter");}
 }
 
 
 
 static byte alter = 19;
	static String Name = "Freddy";
	static byte geschlecht = 1;

		public static void main(String[]args) {

abfrage(); spiel();




}
	


}
