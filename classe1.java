import java.util.Scanner;


public class classe1 {

	 public static void main(String[] args) {

		    Scanner scan= new Scanner(System.in);
		    
		    char rep=' ';
		    double temp;
		    
		    
do{
		    System.out.println("Bienvenu dans ce convertisseur");
		    System.out.println("Veuilliez choisir 1 pour celsius vers Fahr ou 2 pour fahr vers celsius");
		    int choix = scan.nextInt();
		    while(choix!= 1 && choix!=2) 
		    	{
		    	System.out.println("Choisis 1 ou 2, bordel !");
		    	choix=scan.nextInt();
		    	
		        }
		    if (choix==1)
		    {
		    	System.out.println("Entrer la t° a convertir");
		    	 temp = scan.nextDouble();
		    	temp = ((9.0/5.0) * temp) + 32.0;
		    	System.out.println(temp+ "°F");
		    	
		    	
		    }
		    else
		    {
		    	System.out.println("Entrer la t° a convertir");
		    	temp=  scan.nextDouble();
		    	temp = ((temp - 32) * 5) / 9;
		    	System.out.println(temp+ "°C");
		    }
		 do {
			 scan.nextLine();
			 System.out.println("Continuer ?? o ou n ?");
			 rep= scan.nextLine().charAt(0);
		 }while (rep != 'o' && rep !='n');
		 if (rep == 'n')
		 {
			 System.out.println ("ADIEU");
		 }
		 
		    
 }while (rep == 'o');
		  
}
}