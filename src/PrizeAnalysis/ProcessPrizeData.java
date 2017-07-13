package PrizeAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class ProcessPrizeData {

	private ArrayList<SampleCounter> numbercounter = new ArrayList<>();
	double[] percentSet;

	// ---- counstruct -------
	public ProcessPrizeData() {

	}

	// ----- method----
	public void addData(ArrayList<Integer> prizenumber) {
		numbercounter.add(new SampleCounter());
		for (int index = 0; index < prizenumber.size(); index++) {
			for (int inner = 0; inner < numbercounter.size(); inner++) {
				if (numbercounter.get(inner).getNumber() == prizenumber.get(index)) {
					SampleCounter temp = numbercounter.get(inner);
					temp.setCounter();
					numbercounter.remove(inner);
					numbercounter.add(temp);
					break;
				}
				if (inner == (numbercounter.size() - 1)) {
					SampleCounter sc = new SampleCounter();
					sc.setNumber(prizenumber.get(index));
					numbercounter.add(sc);
					break;
				}
			}

		}
	}

	/*
	 * 回傳未處理資料集
	 */
	public ArrayList<SampleCounter> getData() {
		return (ArrayList<SampleCounter>) this.numbercounter.clone();
	}

	/*
	 * 顯示目前開獎號碼機率
	 */
	public void showPrizePercent(int amountrowcounter) {
		StringBuilder sb = new StringBuilder();
		Collections.sort(this.numbercounter);
		if (numbercounter.size() > 10) {
			for (int index = 0; index < 10; index++) {
				SampleCounter temp = this.numbercounter.get(index);
				sb.append(String.format("數字  %2d 目前開獎機率是  %.2f percent \n", temp.getNumber(),
						(100 * (double) temp.getCounter() / amountrowcounter)));
			}
		} else {
			for (int index = 0; index < this.numbercounter.size(); index++) {
				if (numbercounter.get(index).getNumber() == 0) {
					continue;
				}
				SampleCounter temp = this.numbercounter.get(index);
				sb.append(String.format("數字  %2d 目前開獎機率是  %.2f percent \n", temp.getNumber(),
						(100 * (double) temp.getCounter() / amountrowcounter)));
			}
		}

		JOptionPane.showMessageDialog(null, sb);
	}

	/*
	 * 獎項分類
	 */
	public String awardCate(ArrayList<Integer> awardlist, int specialnumber) {
		String cate;
		switch (awardlist.size()) {
		case 6:
			if (awardlist.contains(specialnumber)) {
				// -- 副彩
				cate = "二    獎  ";
			} else {
				// -- 正彩
				cate = "頭     獎 ";
			}
			break;
		case 5:
			if (awardlist.contains(specialnumber)) {
				// -- 副2彩
				cate = "四     獎 ";
			} else {
				// -- 正2彩
				cate = "三     獎 ";
			}
			break;
		case 4:
			if (awardlist.contains(specialnumber)) {
				// -- 6獎 1000
				cate = "六     獎     1000 元";
			} else {
				// -- 5獎
				cate = "五     獎 ";
			}
			break;
		case 3:
			// ---- 都400
			cate = "七     獎  400元";
			break;
		default:
			// --GG
			cate = " 沒 中 獎  ";
			break;
		}
		return cate;
	}
}// ---class end--
