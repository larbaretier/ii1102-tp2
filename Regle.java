import java.util.Scanner;
public class Regle {
	
	public static void main(String [] arge){

		}
	
	public static void regle()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer longueur");
		int lg= scan.nextInt();
		System.out.println("Entrer graduation");
		int gr= scan.nextInt();
		for (int i=0;i<lg;i++){
			System.out.print('-');
			if((i+1)%gr==0){System.out.print('|');}
			}
	}
	public static double puissance(double a, int n)
	{
			double d = 1;
			for (int i=0;i<n;i++){
				d=a*a;
			}
			return d;
				
	}
	//on fait n multiplications, si n est pair, on peut en faire moins car il suffit de multiplier
	// a par lui même puis par lui même (...) n/2 fois
	
	public static int premier(int n)
	{
			for (int i=2;i<n;i++){
				if (n%i==0){
					return 0;
				}
			}
			return 1;
				
	}
	//on peut renvoyer un bool (true/false)
	
	public static void table1()
	{
			for (int i=0;i<11;i++){
				for (int j=0;j<11;j++){
					System.out.print(i*j);
					System.out.print(' ');
				}
				System.out.println();

			}
				
	}
	
	public static int[] table2(int nb,int max)
	{
		int[] res=new int[max+1];
			for (int i=0;i<max+1;i++){
				res[i]=i*nb;
			}
		return res;	
	}
	
	public static int table2(int val, int[] tab)
	{
			for (int i=0;i<tab.length;i++){
				if(tab[i]==val){
					return i;
				}
			}
			return -1;
				
	}
	//si ne trouve pas, parcours tout le tableau donc ici fait 5 boucles
	//si trouve à la dernière case fait tout le tableau, ici donc 5
	//ici on trouve directe donc une execution
	//ici a la 5 ieme place donc 5 executions
	//le nombre d'execution de la boucle depend de l'endroit dans le tableau où se trouve l'élément cherché pour la 1ere fois
	//
	
	
	
	
	}
