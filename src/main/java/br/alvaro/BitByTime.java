package br.alvaro;

public class BitByTime {
	
	private long iseed; 
	
	BitByTime (){
		this.iseed = System.currentTimeMillis();
	}

	public long getIseed() {
		return iseed;
	}

	public void setIseed(long iseed) {
		this.iseed = iseed;
	}
	
	

}
