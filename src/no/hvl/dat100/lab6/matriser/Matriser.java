package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j] + " ");
			}
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		

			 String svar = "";
			 for(int i = 0; i < matrise.length; i++) {
					for(int j = 0; j < matrise[i].length; j++) {
						svar += matrise[i][j] + " ";
					}
					svar += "\n";
				}
		return svar;
		}
		
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] ny1 = new int[matrise.length][matrise.length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise.length; j++) {
				ny1[i][j] = matrise[i][j];
			}
		}
		
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				ny1[i][j] = matrise[i][j] * tall;
			}
		}
		
		return ny1;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean lik = true;
		int rad1 = a.length;
		int rad2 = b.length;
		int kolonne1 = a[0].length;
		int kolonne2 = b[0].length;
		
		if(rad1 != rad2 || kolonne1 != kolonne2) {
			lik = false;
		}else {
			for(int i = 0; i < rad1; i++) {
				for( int j = 0; j < kolonne1; j++) {
					if(a[i][j] != b[i][j]) {
						lik = false;
					}
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		
		
		int[][] ny = new int [matrise[0].length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				ny[j][i] = matrise[i][j];
			}
		}
		return ny;
			
		}
		
	
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int kolonne1 = a[0].length;
		int rad1 = b.length;
		int rad2 = a.length;
		
		if(rad1 == kolonne1) {
			int sum[][]= new int [rad1][kolonne1];
			for(int i = 0; i < rad1; i++) {
				for(int j = 0; j < kolonne1; j++) {
					for(int k = 0; k < rad2; k++)
					sum[i][j] += a[i][k] * b[k][j];
				}
			}
			return sum;
		}
		return null;
	 
	}
}
