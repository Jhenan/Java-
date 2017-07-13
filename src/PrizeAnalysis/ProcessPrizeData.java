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
	 * �^�ǥ��B�z��ƶ�
	 */
	public ArrayList<SampleCounter> getData() {
		return (ArrayList<SampleCounter>) this.numbercounter.clone();
	}

	/*
	 * ��ܥثe�}�����X���v
	 */
	public void showPrizePercent(int amountrowcounter) {
		StringBuilder sb = new StringBuilder();
		Collections.sort(this.numbercounter);
		if (numbercounter.size() > 10) {
			for (int index = 0; index < 10; index++) {
				SampleCounter temp = this.numbercounter.get(index);
				sb.append(String.format("�Ʀr  %2d �ثe�}�����v�O  %.2f percent \n", temp.getNumber(),
						(100 * (double) temp.getCounter() / amountrowcounter)));
			}
		} else {
			for (int index = 0; index < this.numbercounter.size(); index++) {
				if (numbercounter.get(index).getNumber() == 0) {
					continue;
				}
				SampleCounter temp = this.numbercounter.get(index);
				sb.append(String.format("�Ʀr  %2d �ثe�}�����v�O  %.2f percent \n", temp.getNumber(),
						(100 * (double) temp.getCounter() / amountrowcounter)));
			}
		}

		JOptionPane.showMessageDialog(null, sb);
	}

	/*
	 * ��������
	 */
	public String awardCate(ArrayList<Integer> awardlist, int specialnumber) {
		String cate;
		switch (awardlist.size()) {
		case 6:
			if (awardlist.contains(specialnumber)) {
				// -- �Ʊm
				cate = "�G    ��  ";
			} else {
				// -- ���m
				cate = "�Y     �� ";
			}
			break;
		case 5:
			if (awardlist.contains(specialnumber)) {
				// -- ��2�m
				cate = "�|     �� ";
			} else {
				// -- ��2�m
				cate = "�T     �� ";
			}
			break;
		case 4:
			if (awardlist.contains(specialnumber)) {
				// -- 6�� 1000
				cate = "��     ��     1000 ��";
			} else {
				// -- 5��
				cate = "��     �� ";
			}
			break;
		case 3:
			// ---- ��400
			cate = "�C     ��  400��";
			break;
		default:
			// --GG
			cate = " �S �� ��  ";
			break;
		}
		return cate;
	}
}// ---class end--
