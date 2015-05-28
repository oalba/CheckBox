package com.zubiri.CheckBox;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.event.ChangeListener;
import javax.swing.JCheckBox;
import javax.swing.JButton;

//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CheckBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		super("CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 191, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBounds(32, 8, 129, 23);
		//chckbxA.addChangeListener((ChangeListener) this);
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(32, 35, 129, 23);
		//chckbxB.addChangeListener((ChangeListener) this);
		contentPane.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBounds(32, 62, 129, 23);
		//chckbxC.addChangeListener((ChangeListener) this);
		contentPane.add(chckbxC);
		
		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setBounds(32, 89, 129, 23);
		//chckbxD.addItemListener((ItemListener) this);
		contentPane.add(chckbxD);
	
		/*chckbxA.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		            //do something...
		        	System.out.println("Has seleccionado A");
		        } else {//checkbox has been deselected
		            //do something...
		        };
		    }
		});*/
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Has seleccionado las siguientes letras: ");
				if (chckbxA.isSelected()==true){
					System.out.println("A ");
				};
				if (chckbxB.isSelected()==true){
					System.out.println("B ");
				};
				if (chckbxC.isSelected()==true){
					System.out.println("C ");
				};
				if (chckbxD.isSelected()==true){
					System.out.println("D ");
				};
			}
		});
		btnEnviar.setBounds(32, 120, 117, 25);
		contentPane.add(btnEnviar);
	}
}
