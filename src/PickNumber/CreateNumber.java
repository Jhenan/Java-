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
	 * �r����S�w�Ʀr
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
	 * �H������ 1~49���Ʀr
	 */

	public int getRandomNumber() {
		return (int) (Math.random() * 48 + 1);
	}

	/*
	 * ���ͶüƸ��X 7�� --> �}�����X
	 */
	public ArrayList getPrizeNumber() {
		// --- �M�w�F �i�ӥ��M�� -----
		prize_numbers = new ArrayList<Integer>();
		// ---- �}�l���� ------------
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
	 * �üƲ����`��6�� --->�ۿ︹�X
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
	 * �}�����X�Ƨ�
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
	 * �T�{��J�ȬO�_����
	 */
	public boolean isDuplicate(ArrayList picklist, int picknumner) {
		return !picklist.contains(picknumner);
		// --�ϦV--> ���]�t FALSE �S���]�t TRUE
	}

	/*
	 * ���}�C���ͱo�����X
	 */
	public ArrayList<Integer> getAwardNumbers(ArrayList<Integer> prizenumber, ArrayList<Integer> picknumber) {
		ArrayList<Integer> awardnumbers = (ArrayList<Integer>) prizenumber.clone();
		awardnumbers.retainAll(picknumber);
		return awardnumbers;
	}

}// ---class end
