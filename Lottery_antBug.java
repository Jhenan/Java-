package GUISkin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import ListenerHandle.TxtBoxLintener;
import PickNumber.CreateNumber;
import PrizeAnalysis.ProcessPrizeData;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Lottery extends JFrame {

	private JPanel contentPane;
	private JTextField txtBox_pr1;
	private JTextField txtBox_pr2;
	private JTextField txtBox_pr3;
	private JTextField txtBox_pr4;
	private JTextField txtBox_pr5;
	private JTextField txtBox_pr6;
	private JTextField txtBox_pr7;
	private JLabel label_1;
	private JTextField txtBox_pick1;
	private JTextField txtBox_pick2;
	private JTextField txtBox_pick3;
	private JTextField txtBox_pick4;
	private JTextField txtBox_pick5;
	private JTextField txtBox_pick6;
	private JTextField[] txtboxpr;
	private JTextField[] txtboxpick;
	private JTextArea showmessage;
	private TxtBoxLintener txtlistener = new TxtBoxLintener();
	private ArrayList<Integer> prizenumber;
	private ArrayList<Integer> picknumber = new ArrayList<Integer>();
	private JTable recordtable =new JTable();
	private DefaultTableModel dtm = new DefaultTableModel();
	private ProcessPrizeData myprocess = new ProcessPrizeData();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lottery frame = new Lottery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lottery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Lottery.class.getResource("/resource/lottery281_280.jpg")));
		lblNewLabel.setBounds(10, 316, 280, 280);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u958B\u734E\u865F\u78BC");
		lblNewLabel_1.setBackground(new Color(255, 204, 0));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(33, 160, 75, 20);
		panel.add(lblNewLabel_1);

		JLabel label = new JLabel("\u5708\u9078\u865F\u78BC");
		label.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label.setBackground(new Color(255, 204, 0));
		label.setBounds(33, 67, 75, 20);
		panel.add(label);

		txtBox_pr1 = new JTextField();
		txtBox_pr1.setDisabledTextColor(Color.BLACK);
		txtBox_pr1.setSelectionColor(Color.BLACK);
		txtBox_pr1.setForeground(Color.BLACK);
		txtBox_pr1.setEnabled(false);
		txtBox_pr1.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr1.setBackground(new Color(255, 255, 204));
		txtBox_pr1.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr1.setBounds(118, 148, 35, 39);
		panel.add(txtBox_pr1);
		txtBox_pr1.setColumns(10);

		txtBox_pr2 = new JTextField();
		txtBox_pr2.setDisabledTextColor(Color.BLACK);
		txtBox_pr2.setSelectionColor(Color.BLACK);
		txtBox_pr2.setForeground(Color.BLACK);
		txtBox_pr2.setEnabled(false);
		txtBox_pr2.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr2.setBackground(new Color(255, 255, 204));
		txtBox_pr2.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr2.setColumns(10);
		txtBox_pr2.setBounds(163, 148, 35, 39);
		panel.add(txtBox_pr2);

		txtBox_pr3 = new JTextField();
		txtBox_pr3.setDisabledTextColor(Color.BLACK);
		txtBox_pr3.setSelectionColor(Color.BLACK);
		txtBox_pr3.setForeground(Color.BLACK);
		txtBox_pr3.setEnabled(false);
		txtBox_pr3.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr3.setBackground(new Color(255, 255, 204));
		txtBox_pr3.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr3.setColumns(10);
		txtBox_pr3.setBounds(208, 148, 35, 39);
		panel.add(txtBox_pr3);

		txtBox_pr4 = new JTextField();
		txtBox_pr4.setDisabledTextColor(Color.BLACK);
		txtBox_pr4.setSelectionColor(Color.BLACK);
		txtBox_pr4.setForeground(Color.BLACK);
		txtBox_pr4.setEnabled(false);
		txtBox_pr4.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr4.setBackground(new Color(255, 255, 204));
		txtBox_pr4.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr4.setColumns(10);
		txtBox_pr4.setBounds(253, 148, 35, 39);
		panel.add(txtBox_pr4);

		txtBox_pr5 = new JTextField();
		txtBox_pr5.setDisabledTextColor(Color.BLACK);
		txtBox_pr5.setSelectionColor(Color.BLACK);
		txtBox_pr5.setForeground(Color.BLACK);
		txtBox_pr5.setEnabled(false);
		txtBox_pr5.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr5.setBackground(new Color(255, 255, 204));
		txtBox_pr5.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr5.setColumns(10);
		txtBox_pr5.setBounds(298, 148, 35, 39);
		panel.add(txtBox_pr5);

		txtBox_pr6 = new JTextField();
		txtBox_pr6.setDisabledTextColor(Color.BLACK);
		txtBox_pr6.setSelectionColor(Color.BLACK);
		txtBox_pr6.setForeground(Color.BLACK);
		txtBox_pr6.setEnabled(false);
		txtBox_pr6.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBox_pr6.setBackground(new Color(255, 255, 204));
		txtBox_pr6.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr6.setColumns(10);
		txtBox_pr6.setBounds(343, 148, 35, 39);
		panel.add(txtBox_pr6);

		txtBox_pr7 = new JTextField();
		txtBox_pr7.setDisabledTextColor(Color.BLACK);
		txtBox_pr7.setForeground(new Color(0, 51, 0));
		txtBox_pr7.setEnabled(false);
		txtBox_pr7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pr7.setBackground(new Color(51, 255, 255));
		txtBox_pr7.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pr7.setColumns(10);
		txtBox_pr7.setBounds(462, 148, 35, 39);
		panel.add(txtBox_pr7);

		label_1 = new JLabel("\u7279\u5225\u865F");
		label_1.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		label_1.setBackground(new Color(255, 204, 0));
		label_1.setBounds(380, 148, 75, 38);
		panel.add(label_1);

		txtBox_pick1 = new JTextField();
		txtBox_pick1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick1.setBackground(new Color(204, 153, 255));
		txtBox_pick1.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick1.setColumns(10);
		txtBox_pick1.setBounds(118, 56, 35, 39);

		panel.add(txtBox_pick1);

		txtBox_pick2 = new JTextField();
		txtBox_pick2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick2.setBackground(new Color(204, 153, 255));
		txtBox_pick2.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick2.setColumns(10);
		txtBox_pick2.setBounds(163, 56, 35, 39);
		panel.add(txtBox_pick2);

		txtBox_pick3 = new JTextField();
		txtBox_pick3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick3.setBackground(new Color(204, 153, 255));
		txtBox_pick3.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick3.setColumns(10);
		txtBox_pick3.setBounds(208, 56, 35, 39);
		panel.add(txtBox_pick3);

		txtBox_pick4 = new JTextField();
		txtBox_pick4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick4.setBackground(new Color(204, 153, 255));
		txtBox_pick4.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick4.setColumns(10);
		txtBox_pick4.setBounds(253, 56, 35, 39);
		panel.add(txtBox_pick4);

		txtBox_pick5 = new JTextField();
		txtBox_pick5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick5.setBackground(new Color(204, 153, 255));
		txtBox_pick5.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick5.setColumns(10);
		txtBox_pick5.setBounds(298, 56, 35, 39);
		panel.add(txtBox_pick5);

		txtBox_pick6 = new JTextField();
		txtBox_pick6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtBox_pick6.setBackground(new Color(204, 153, 255));
		txtBox_pick6.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		txtBox_pick6.setColumns(10);
		txtBox_pick6.setBounds(343, 56, 35, 39);
		panel.add(txtBox_pick6);

		// ---------------------
		txtboxpr = new JTextField[] { txtBox_pr1, txtBox_pr2, txtBox_pr3, txtBox_pr4, txtBox_pr5, txtBox_pr6,
				txtBox_pr7 };
		txtboxpick = new JTextField[] { txtBox_pick1, txtBox_pick2, txtBox_pick3, txtBox_pick4, txtBox_pick5,
				txtBox_pick6 };
		for (JTextField temp : txtboxpick) {
			temp.setInputVerifier(txtlistener);
		}
		// ---------------------

		JButton btn_confirm = new JButton("\u78BA\u5B9A");
		btn_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lottery.this.picknumber.clear();
				CreateNumber cn = new CreateNumber();
			/*	int fillcounter = 0;
				// -- 滿格自動電選 --
				for (JTextField search : txtboxpick) {
					if (search.getText().isEmpty()) {
						continue;
					} else {
					//	System.out.println("not empty --");
						fillcounter++;
					}
				}
				if (fillcounter == 6) {
					for (JTextField search : txtboxpick) {
					//	System.out.println("go here ");
						search.setText("");
					}
				}*/
				// ------------------------------
				int afterconvert;
				boolean isshow = true;
				for (JTextField each : Lottery.this.txtboxpick) {
					if (each.getText().isEmpty()) {
						continue;
					}
					afterconvert = cn.stringConvertToInteger(each.getText());
					if (cn.isDuplicate(Lottery.this.picknumber, afterconvert)) {
						Lottery.this.picknumber.add(afterconvert);
					} else {
						if (isshow) {
							JOptionPane.showMessageDialog(panel, "去除重複數字並自選");
							isshow = false;
						}
					}
				} // ---end loop
				isshow = true;
				Lottery.this.picknumber = cn.getPickNumber(Lottery.this.picknumber);
				for (int index = 0; index < Lottery.this.txtboxpick.length; index++) {
					txtboxpick[index].setText(picknumber.get(index).toString());
				}

			//	System.out.println(Lottery.this.picknumber);
			}
		});
		btn_confirm.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(0, 0, 0)));
		btn_confirm.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btn_confirm.setBounds(568, 56, 64, 39);
		panel.add(btn_confirm);

		JButton btn_cancle = new JButton("\u53D6\u6D88");
		btn_cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread() {
					public void run() {
						for (JTextField temp : Lottery.this.txtboxpick) {
							temp.setText("");
						}
						Lottery.this.picknumber.clear();
					}
				}.start();

			}
		});
		btn_cancle.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btn_cancle.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(0, 0, 0)));
		btn_cancle.setBounds(462, 56, 62, 39);
		panel.add(btn_cancle);

		JButton btn_go = new JButton("\u5C0D\u734E");
		btn_go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lottery.this.picknumber.size() < 6){
					JOptionPane.showMessageDialog(panel, "選號未完全");
					return;
				}
				CreateNumber cn = new CreateNumber();
				Lottery.this.prizenumber = cn.getPrizeNumber();
				for (int index = 0; index < Lottery.this.prizenumber.size(); index++) {
					JTextField temp = Lottery.this.txtboxpr[index];
					temp.setText((Lottery.this.prizenumber.get(index).toString()));
				}//--end loop
				//--- table block ----
				
				recordtable.setModel(dtm);
				dtm.setColumnIdentifiers(new String[]
						{"期    數","No.1","No.2","No.3","No.4","No.5","No.6","S_No.7"});
				TableColumn tc= recordtable.getColumnModel().getColumn(0);
				tc.setPreferredWidth(100);
			    ArrayList rowdata = new ArrayList();
			    rowdata.add(String.format("第 %d期", dtm.getRowCount()+1));
			    rowdata.addAll(cn.getSortPrize(Lottery.this.prizenumber));
			    myprocess.addData(Lottery.this.prizenumber); //--分析資料注入
			    dtm.addRow(rowdata.toArray());
			    //----- show view --------
			    ArrayList<Integer> theawardnumber =cn.getAwardNumbers(prizenumber, picknumber);
			    StringBuilder sb = new StringBuilder();
			    sb.append(String.format("第 %d期 開獎結果 : \n", dtm.getRowCount()));
			    sb.append(String.format("中獎號碼 %s 中 %d 個號碼 \n",theawardnumber.toString(),theawardnumber.size()));
			    sb.append(String.format("獎項是 : %s \n",myprocess.awardCate(theawardnumber,Lottery.this.prizenumber.get(6))));
			    showmessage.setText(sb.toString());
			    for (int index = 0; index < Lottery.this.txtboxpick.length; index++) {
					txtboxpick[index].setText(picknumber.get(index).toString());
				}
			}//--end actionPerformed method
		});
		btn_go.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btn_go.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(0, 0, 0)));
		btn_go.setBounds(570, 151, 62, 39);
		panel.add(btn_go);

		JButton btn_analysis = new JButton("\u4E0D\u8CA0\u8CAC\u4EFB\u5206\u6790");
		btn_analysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myprocess.showPrizePercent(dtm.getRowCount());
			}
		});
		btn_analysis.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btn_analysis.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btn_analysis.setBounds(310, 194, 110, 39);
		panel.add(btn_analysis);

		showmessage = new JTextArea();
		showmessage.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		showmessage.setBounds(33, 222, 245, 84);
		panel.add(showmessage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(300, 243, 419, 353);
		panel.add(scrollPane);
		recordtable.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		
		//recordtable = new JTable();
		scrollPane.setViewportView(recordtable);
		
		JButton btn_allrandom = new JButton("\u5168\u96FB\u9078");
		btn_allrandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateNumber cn = new CreateNumber();
				HashSet randomnu = new  HashSet();
				while(randomnu.size() < 6){
					randomnu.add(cn.getRandomNumber());
				}
				Object[] nuarray = randomnu.toArray();
				for(int index = 0;index < Lottery.this.txtboxpick.length;index++){
					(Lottery.this.txtboxpick[index]).setText(nuarray[index].toString()); 
				}
			}
		});
		btn_allrandom.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btn_allrandom.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(0, 0, 0)));
		btn_allrandom.setBounds(393, 56, 62, 39);
		panel.add(btn_allrandom);
	}
}
