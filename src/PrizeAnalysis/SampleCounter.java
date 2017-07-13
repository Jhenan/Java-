package PrizeAnalysis;

import java.util.Comparator;

public class SampleCounter implements Comparable<SampleCounter>{
	private int counter = 0;
    private int snumber;
	// ------- construct --------
	public SampleCounter() {
           this.setCounter();
	}

	// -------- Method ----------
	public void setCounter() {
		this.counter++;
	}

	public int getCounter() {
		return this.counter;
	}

	public void clean() {
		this.counter = 0;
	}
    public void setNumber(int number){
    	this.snumber= number;
    }
	public int getNumber(){
		return this.snumber;
	}

	@Override
	public int compareTo(SampleCounter o) {
		// TODO Auto-generated method stub
		return (this.getCounter()-o.getCounter())*-1;
		
	}
}//-----------class end
