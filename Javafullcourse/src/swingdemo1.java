import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;






public class swingdemo1 implements ActionListener{
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4;
	JTextArea t1,t2,t3,t4,t5;
	
	
	public swingdemo1 ()
	{
		f=new JFrame("My Swing");
		f.setVisible(true);
		f.setSize(340,430);
		f.setLayout(null);
		f.setResizable(false);
		
		l1=new JLabel("ID");
		l2=new JLabel("NAME");
		l3=new JLabel("MOBILE");
		l4=new JLabel("EMAIL");
		l5=new JLabel("ADDRESS");
		
		t1=new JTextArea(20,20);
		t2=new JTextArea(20,20);
		t3=new JTextArea(20,20);
		t4=new JTextArea(20,20);
		t5=new JTextArea(20,20);
	
		b1=new JButton("INSERT");
		b2=new JButton("SEARCH");
		b3=new JButton("UPDATE");
		b4=new JButton("DELETE");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		b1.setBounds(50, 300, 120, 20);
		b2.setBounds(170, 300, 120, 20);
		b4.setBounds(170, 350, 120, 20);
		b3.setBounds(50, 350, 120, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	
		
		
	}

	public static void main(String[]args){
		new swingdemo1();
		
}

public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_8","root","");
				String sql="insert into sample(name,mobile,email,address)values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
				Statement stmt=conn.createStatement();
				stmt.execute(sql);
				conn.close();
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(null,"Data Inserted successfully");
				
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_8","root","");
				String sql="select * from sample where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1,Integer.parseInt(t1.getText()));
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("mobile"));
					t4.setText(rs.getString("email"));
					t5.setText(rs.getString("address"));
				}
				else
				{
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(null,"ID not found");
				}
				}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_8","root","");
				String sql="update sample set name=?,mobile=?,email=?,address=? where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				
					pst.setString(1, t2.getText());
					pst.setString(2, t3.getText());
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.setInt(5,Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(null,"Data updated successfull");
				
				}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_8","root","");
				String sql="delete from sample where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(null,"Data deleted successfull");
			
				
				}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
