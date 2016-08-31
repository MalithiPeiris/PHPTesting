package peoplehealth;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSales extends javax.swing.JFrame {

	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	
	/**
	 * Create the application.
	 */
	public AddSales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox<>();
		jComboBox3 = new javax.swing.JComboBox<>();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jComboBox4 = new javax.swing.JComboBox<>();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);	

		setTitle("Add Sales");

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Category");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Product");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel2.setText("Inv. No");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Sale date");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel6.setText("Region");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Sales");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel7.setText("Profit");

		jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jComboBox2.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 1", "Item 2", "Item 3" }));

		jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Select", "Product 1", "Product 2", "Product 3" }));

		jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jComboBox4.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Region 1", "Region 2", "Region 3" }));

		jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(153, 153, 153));
		jLabel8.setText("USD");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(153, 153, 153));
		jLabel9.setText("USD");

		jButton2.setText("Submit");

		jButton3.setText("Reset");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel5)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(70, 70, 70)
								.addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3).addComponent(jLabel2).addComponent(jLabel6)
										.addComponent(jLabel4).addComponent(jLabel7))
								.addGap(78, 78, 78)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jComboBox4, 0, 161, Short.MAX_VALUE).addGroup(jPanel1Layout
												.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jTextField4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 88,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabel9))
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(jComboBox3, 0, 161, Short.MAX_VALUE)
																.addComponent(jTextField2).addComponent(jTextField3,
																		javax.swing.GroupLayout.Alignment.TRAILING))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jTextField5,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 88,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabel8))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jButton2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jButton3)))
												.addGap(0, 0, Short.MAX_VALUE)))))
						.addContainerGap(46, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(33, 33, 33)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1).addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3).addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2).addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(15, 15, 15)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4).addComponent(jLabel8))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jLabel9))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2).addComponent(jButton3))
						.addContainerGap(26, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(14, Short.MAX_VALUE)));

		pack();
	}

	
}
