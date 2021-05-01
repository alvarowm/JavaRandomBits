package br.alvaro;

public class BitGenerator {
	
	public long generator (BitByTime bbt) {
		long bit;
		
		//Em Java n�o temos unsigned, logo o bit mais significativo � o segundo e n�o primeiro.
		//O primeiro bit � usado para armazenar o sinal
		
		bit = (bbt.getIseed() >> 18) & 1
				^ (bbt.getIseed() >> 5) & 1
				^ (bbt.getIseed() >> 2) & 1
				^ (bbt.getIseed() & 1);
		
		bbt.setIseed(bbt.getIseed() << 2 | bit);
		
		return  bit;
		
	}

}
