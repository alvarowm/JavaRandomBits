package br.alvaro;

public class BitGenerator {
	
	public long generator (BitByTime bbt) {
		long bit;
		
		//Em Java não temos unsigned, logo o bit mais significativo é o segundo e não primeiro.
		//O primeiro bit é usado para armazenar o sinal
		
		bit = (bbt.getIseed() >> 18) & 1
				^ (bbt.getIseed() >> 5) & 1
				^ (bbt.getIseed() >> 2) & 1
				^ (bbt.getIseed() & 1);
		
		bbt.setIseed(bbt.getIseed() << 2 | bit);
		
		return  bit;
		
	}

}
