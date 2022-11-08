package ch6hw;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
 
 
class MyJframe extends JFrame{
 
	public JPanel contentPane;
	public JLabel lbl;	
	public JTextArea commentTextArea;
	public JList jlist;
	public JScrollPane scroll_1;
	public JScrollPane scroll_2;
	public String s[]={"台北","台中","嘉義","高雄","南投","彰化"};
	
	MyJframe(){ 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello JFrame!");
		setBounds(100,100,600,400);
		setLayout(null);
		
		contentPane = new JPanel();
		add(contentPane);
		contentPane.setBounds(10,10, 300, 200);
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);
		
		lbl = new JLabel("輸入你要的縣市：");
		contentPane.add(lbl);
				
	    jlist = new JList(s);
	    jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    jlist.setVisibleRowCount(4);
	    scroll_1 = new JScrollPane(jlist);
	    add(scroll_1);


	    commentTextArea = new JTextArea("可選取地名...",4,18);
		scroll_2 = new JScrollPane(commentTextArea); 
		add(scroll_2);

		
		jlist.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				int[] indices = jlist.getSelectedIndices();
				String show="";
				int firsttt = 0;
				int n = indices.length;
				for (int i = 0; i < n; i++) {
					switch(indices[i]) {
						case 0: if(firsttt==0) 
									{show += "台北名山：陽明山";break;}
								else {
									show += "\n台北名山：陽明山";break;
								}
						
						case 1: if(firsttt==0) 
									{show += "台中名山：梨山";break;}
								else {
									show += "\n台中名山：梨山";break;
								}
						
						case 2: if(firsttt==0) 
									{show += "嘉義名山：阿里山";break;}
								else {
									show += "\n嘉義名山：阿里山";break;
								}
						
						case 3: if(firsttt==0) 
									{show += "高雄名山：旗山";break;}
								else {
									show += "\n高雄名山：旗山";break;
								}
						
						case 4: if(firsttt==0) 
									{show += "南投名山：玉山";break;}
								else {
									show += "\n南投名山：玉山";break;
								}
						
						case 5: if(firsttt==0) 
									{show += "彰化名山：八卦山";break;}
								else {
									show += "\n彰化名山：八卦山";break;
								}
					}
					firsttt = 1;
		        }
				commentTextArea.setText(show);
			}  	
		}
		);
		setVisible(true);
	} 
}
 
public class hw{
	public static void main(String[] args) {
		MyJframe f1=new MyJframe();
	}
}