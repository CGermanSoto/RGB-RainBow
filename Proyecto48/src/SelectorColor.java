import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SelectorColor extends JFrame implements ActionListener {
	private JComboBox<String> rojo, azul, verde;
	private JButton boton;
	private JLabel labelRojo, labelAzul, labelVerde, changeme;
	
	public SelectorColor() {
		// 				JFRAME CONFIG 
		setLayout(null);
		setBounds(0, 0, 350, 180);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("RGB Rainbow");
		
		// 				Labels
		// Rojo
		labelRojo = new JLabel("RED");
		labelRojo.setBounds(55, 0, 100, 60);
		add(labelRojo);
		// Verde
		labelVerde = new JLabel("GREEN");
		labelVerde.setBounds(152, 0, 100, 60);
		add(labelVerde);
		// Azul
		labelAzul = new JLabel("BLUE");
		labelAzul.setBounds(255, 0, 100, 60);
		add(labelAzul);
		// Touchme
		changeme = new JLabel("Change me!");
		changeme.setBounds(130, 60, 100, 50);
		add(changeme);
		
		// 				BOTON
		boton = new JButton();
		boton.setBounds(50, 95, 230, 30);
		boton.addActionListener(this);
		add(boton);
		
		// 				JCOMBOBOX
		// Rojo
		rojo = new JComboBox<String>();
		rojo.setBounds(45, 45, 60, 20);
		for (int i = 0; i<=255; i++) {
			int valor = i;
			String numeroCadena = String.valueOf(valor);
			rojo.addItem(numeroCadena);
		}
		add(rojo);
		// Verde
		verde = new JComboBox<String>();
		verde.setBounds(145, 45, 60, 20);
		for (int i = 0; i<=255; i++) {
			int valor = i;
			String numeroCadena = String.valueOf(valor);
			verde.addItem(numeroCadena);
		}
		add(verde);
		// Azul
		azul = new JComboBox<String>();
		azul.setBounds(245, 45, 60, 20);
		for (int i= 0; i<=255; i++) {
			int valor = i;
			String numeroCadena = String.valueOf(valor);
			azul.addItem(numeroCadena);
		}
		add(azul);
		
		// JFRAME Visible
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SelectorColor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton) {
			String colorSelectRojo = rojo.getSelectedItem().toString();
			String colorSelectVerde = verde.getSelectedItem().toString();
			String colorSelectAzul = azul.getSelectedItem().toString();
			int colorRojo = Integer.parseInt(colorSelectRojo);
			int colorVerde = Integer.parseInt(colorSelectVerde);
			int colorAzul = Integer.parseInt(colorSelectAzul);
			Color color = new Color(colorRojo, colorVerde, colorAzul);
			boton.setBackground(color);
		}
	}

}
