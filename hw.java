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
	public String s[]={"�x�_","�x��","�Ÿq","����","�n��","����"};
	
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
		
		lbl = new JLabel("��J�A�n�������G");
		contentPane.add(lbl);
				
	    jlist = new JList(s);
	    jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    jlist.setVisibleRowCount(4);
	    scroll_1 = new JScrollPane(jlist);
	    add(scroll_1);


	    commentTextArea = new JTextArea("�i����a�W...",4,18);
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
									{show += "�x�_�W�s�G�����s";break;}
								else {
									show += "\n�x�_�W�s�G�����s";break;
								}
						
						case 1: if(firsttt==0) 
									{show += "�x���W�s�G���s";break;}
								else {
									show += "\n�x���W�s�G���s";break;
								}
						
						case 2: if(firsttt==0) 
									{show += "�Ÿq�W�s�G�����s";break;}
								else {
									show += "\n�Ÿq�W�s�G�����s";break;
								}
						
						case 3: if(firsttt==0) 
									{show += "�����W�s�G�X�s";break;}
								else {
									show += "\n�����W�s�G�X�s";break;
								}
						
						case 4: if(firsttt==0) 
									{show += "�n��W�s�G�ɤs";break;}
								else {
									show += "\n�n��W�s�G�ɤs";break;
								}
						
						case 5: if(firsttt==0) 
									{show += "���ƦW�s�G�K���s";break;}
								else {
									show += "\n���ƦW�s�G�K���s";break;
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