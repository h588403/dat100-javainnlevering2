package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int i = 0; i < tabell.length; i++) {
	    System.out.println(tabell[i] + ", ");
		
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String svar = "";
		
		for(int i = 0; i < tabell.length; i++) {
			if(i < (tabell.length - 1)) {
			
			svar += (tabell[i] + ",");
		}
			else {
				svar += tabell[i];
			}
		}
		return ("["+ svar + "]");
	}

	// c)
	public static int summer(int[] tabell) {

		
		int sum = 0;
		for(int i = 0; i < tabell.length; i++ ) {
			sum += tabell[i];
		}
		return sum;
		
		/* 
		 
			Utvidet for-løkke
		 
		 
		 int sum = 0;
		 for (int tab: tabell) {
			sum += tab;
			
		}return sum;
		
			While løkke
		
		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
		*/
		
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
		
			}else {
				i++;}
			} return funnet;
	    		
	    	}
	    
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		int i = 0;
		
		while(i < tabell.length) {
			if(tabell[i] == tall) {
				return i;
			}else {
				i = i +1;
				
			}
		}return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] nytab = new int[tabell.length];
		for (int i = 0; i <tabell.length; i++) {
			nytab[i] = tabell[i];
		} 
		
		
		for(int i = 0; i < nytab.length/2; i++) {
			int a = nytab[i];
			nytab[i] = nytab[nytab.length -i -1];
			nytab[nytab.length - i -1] = a;
		}
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean sortert = true;
	    
	    for(int i = 0; i < tabell.length -1; i++) {
	    	if(tabell[i] > tabell[i + 1]) {
	    		sortert = false;
	    	}
	    }
	    return sortert;
	    
	    
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell=new int[tabell1.length + tabell2.length];	
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int i = 0; i< tabell2.length; i++) {
			nyTabell[tabell1.length + i] = tabell2[i];
		}
		return nyTabell;
		}
	}

