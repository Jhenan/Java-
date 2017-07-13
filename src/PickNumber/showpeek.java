package PickNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

import PrizeAnalysis.ProcessPrizeData;
import PrizeAnalysis.SampleCounter;

public class showpeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CreateNumber cn= new CreateNumber();
     
   //-----------------------------------  
   /*  for(int count=0;count<1000;count++){
    	 int temp = cn.getRandomNumber();
    	 if(temp <= 0 || temp>=50){
    	 System.out.println(temp);
    	 }
     }*/
  //------------------------------------
     ArrayList<Integer> temp = cn.getPrizeNumber();
     ArrayList<Integer> pick = new ArrayList<>();
     
     pick = cn.getPickNumber(pick);
    System.out.println(pick +" pick");
  //-------------------------------------
    System.out.println(temp);
    System.out.println(cn.getSortPrize(temp)+" sort");
    System.out.println("--------- ¤ñ¹ï«á ----------"); 
    System.out.println(cn.getAwardNumbers(temp, pick));
    //----------------------------------------------------
    ProcessPrizeData analysis = new ProcessPrizeData();
    ArrayList<Integer> testnumber = new ArrayList();
    testnumber.add(8);
    testnumber.add(7);
    testnumber.add(7);
    testnumber.add(8);
    testnumber.add(8);
    testnumber.add(7);
    testnumber.add(7);
    testnumber.add(7);
    testnumber.add(17);testnumber.add(15);testnumber.add(49);
    analysis.addData(testnumber);
    ArrayList<SampleCounter> rows = analysis.getData();
    Collections.sort(rows);
    System.out.println(rows.size());
    for(SampleCounter ss:rows){
    	System.out.println(ss.getNumber() +" " +ss.getCounter());
    }
    analysis.showPrizePercent(2);
    
    
    
    
	}//-----main method end

}//--- class end
