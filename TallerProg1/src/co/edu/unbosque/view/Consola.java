package co.edu.unbosque.view;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Consola {

	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);
	}

	public void mostrarMensajeEmergenteConScroll(String texto) {
		JTextArea textArea = new JTextArea(30, 50);
		textArea.setText(texto);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setCaretPosition(0);
		textArea.setEditable(false);

		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JOptionPane.showMessageDialog(null, scrollPane, "Listado de productos", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarMensajeEmergente(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarAlerta(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
	}

	public void mostrarError(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarListado(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Lista productos registrados", JOptionPane.INFORMATION_MESSAGE);
	}

	public int ingresarNumero() {
		String input = JOptionPane.showInputDialog(null, "Ingrese un número:", "Entrada de número",
				JOptionPane.QUESTION_MESSAGE);

		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			mostrarError("Entrada inválida. Por favor, ingrese un número válido.");
			return ingresarNumero(); 
		}
	}

}