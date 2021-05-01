package br.alvaro;

public class Main {
	
	public static void main (String args []) {
		
		BitByTime bbt = new BitByTime();
		
		int contadorZeros = 0;
		int contadorUns = 0;
		
		for (;;) {
			System.out.println("Semente: " + bbt.getIseed());
			
			long bit = new BitGenerator().generator(bbt);
			
			if (bit == 0l)
				contadorZeros++;
			else
				contadorUns++;
			
			System.out.println("0s: " + contadorZeros);
			System.out.println("1s: " + contadorUns);
			
			System.out.println("%0s: " + (Double.valueOf(contadorZeros) / (contadorZeros + contadorUns)) * 100);
			System.out.println("%1s: " + (Double.valueOf(contadorUns) / (contadorZeros + contadorUns)) * 100);
			
			System.out.println("Bit randomizado: " + new BitGenerator().generator(bbt));
			System.out.println("--------------------------------------------------------");
		}
		
	}

}

