package PickNumber;

import java.util.ArrayList;
import java.util.Collections;

public class CreateNumber {
	private ArrayList<Integer> prize_numbers;

	// --- construct area-----
	public CreateNumber() {

	}

	// ---------- method area
	/*
	 * 字串轉特定數字
	 * 
	 * @Paramater snumber
	 */
	public Integer stringConvertToInteger(String snumber) {
		try {
			int temp = Integer.parseInt(snumber);
			if (temp > 0 && temp < 50) {
				return temp;
			} else {
				return 0;
			}
		} catch (NumberFormatException nfe) {
			return 0;
		}

	}
	/*
	 * 隨機產生 1~49的數字
	 */

	public int getRandomNumber() {
		return (int) (Math.random() * 48 + 1);
	}

	/*
	 * 產生亂數號碼 7位 --> 開獎號碼
	 */
	public ArrayList getPrizeNumber() {
		// --- 決定了 進來先清空 -----
		prize_numbers = new ArrayList<Integer>();
		// ---- 開始產生 ------------
		while (this.prize_numbers.size() < 7) {
			int r_number = this.getRandomNumber();
			if (prize_numbers.contains(r_number)) {

			} else {
				this.prize_numbers.add(r_number);
			}
		}
		return this.prize_numbers;
	}

	/*
	 * 亂數產生總數6位 --->自選號碼
	 */
	public ArrayList getPickNumber(ArrayList<Integer> fillit) {
		if (fillit.size() != 6 || fillit.size() < 7) {
			while (fillit.size() < 6) {
				int r_number = this.getRandomNumber();
				if (fillit.contains(r_number)) {

				} else {
					fillit.add(r_number);
				}
			}
			return fillit;

		} else if (fillit.size() >= 7) {
			System.exit(0);
			return null;
		} else {
			return fillit;
		}
	}

	/*
	 * 開獎號碼排序
	 */
	public ArrayList getSortPrize(ArrayList prizeNumber) {
		ArrayList temp = (ArrayList) prizeNumber.clone();
		int number6 = (int) temp.get(6);
		temp.remove(6);
		Collections.sort(temp);
		temp.add(number6);
		return temp;
	}

	/*
	 * 確認輸入值是否重複
	 */
	public boolean isDuplicate(ArrayList picklist, int picknumner) {
		return !picklist.contains(picknumner);
		// --反向--> 有包含 FALSE 沒有包含 TRUE
	}

	/*
	 * 比對陣列產生得獎號碼
	 */
	public ArrayList<Integer> getAwardNumbers(ArrayList<Integer> prizenumber, ArrayList<Integer> picknumber) {
		ArrayList<Integer> awardnumbers = (ArrayList<Integer>) prizenumber.clone();
		awardnumbers.retainAll(picknumber);
		return awardnumbers;
	}

}// ---class end
