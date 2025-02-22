package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InputPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel img4, compraLbl, ventaLbl, cantidadLbl, nombreLbl, tamanioLbl, marcaLbl, propio1Lbl, propio2Lbl,
			propio3Lbl, propio4Lbl, titulo;
	private JButton volverBtn, finalizarBtn;
	private JTextField compraTxt, ventaTxt, cantidadTxt, nombreTxt, tamanioTxt, marcaTxt, propio1Txt, propio2Txt,
			propio3Txt, propio4Txt;

	public InputPanel() {
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		img4 = new JLabel();
		ImageIcon imagenPortada2 = new ImageIcon("src/media/Pet4.png");
		Image portadaBlackimensionada2 = imagenPortada2.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		img4.setIcon(new ImageIcon(portadaBlackimensionada2));
		img4.setBounds(0, 0, 1280, 720);
		img4.setVisible(true);

		/// botones

		volverBtn = new JButton("");
		volverBtn.setBounds(75, 575, 140, 50);
		volverBtn.setActionCommand("VOLVER3");
		volverBtn.setOpaque(false);

		finalizarBtn = new JButton("");
		finalizarBtn.setBounds(1045, 575, 150, 50);
		finalizarBtn.setActionCommand("FINALIZAR");
		finalizarBtn.setOpaque(false);

		/// text
		compraTxt = new JTextField("", SwingConstants.CENTER);
		compraTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		compraTxt.setForeground(Color.BLACK);
		compraTxt.setBackground(new Color(240, 240, 240));
		compraTxt.setBounds(650, 50, 250, 50);
		compraTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		ventaTxt = new JTextField("", SwingConstants.CENTER);
		ventaTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		ventaTxt.setForeground(Color.BLACK);
		ventaTxt.setBackground(new Color(240, 240, 240));
		ventaTxt.setBounds(650, 100, 250, 50);
		ventaTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		cantidadTxt = new JTextField("", SwingConstants.CENTER);
		cantidadTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		cantidadTxt.setForeground(Color.BLACK);
		cantidadTxt.setBackground(new Color(240, 240, 240));
		cantidadTxt.setBounds(650, 150, 250, 50);
		cantidadTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		nombreTxt = new JTextField("", SwingConstants.CENTER);
		nombreTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		nombreTxt.setForeground(Color.BLACK);
		nombreTxt.setBackground(new Color(240, 240, 240));
		nombreTxt.setBounds(650, 200, 250, 50);
		nombreTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		tamanioTxt = new JTextField("", SwingConstants.CENTER);
		tamanioTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		tamanioTxt.setForeground(Color.BLACK);
		tamanioTxt.setBackground(new Color(240, 240, 240));
		tamanioTxt.setBounds(650, 250, 250, 50);
		tamanioTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		marcaTxt = new JTextField("", SwingConstants.CENTER);
		marcaTxt.setFont(new Font("SansSerif", Font.BOLD, 22));
		marcaTxt.setForeground(Color.BLACK);
		marcaTxt.setBackground(new Color(240, 240, 240));
		marcaTxt.setBounds(650, 300, 250, 50);
		marcaTxt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		propio1Txt = new JTextField("", SwingConstants.CENTER);
		propio1Txt.setFont(new Font("SansSerif", Font.BOLD, 22));
		propio1Txt.setForeground(Color.BLACK);
		propio1Txt.setBackground(new Color(240, 240, 240));
		propio1Txt.setBounds(650, 350, 250, 50);
		propio1Txt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		propio2Txt = new JTextField("", SwingConstants.CENTER);
		propio2Txt.setFont(new Font("SansSerif", Font.BOLD, 22));
		propio2Txt.setForeground(Color.BLACK);
		propio2Txt.setBackground(new Color(240, 240, 240));
		propio2Txt.setBounds(650, 400, 250, 50);
		propio2Txt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		propio3Txt = new JTextField("", SwingConstants.CENTER);
		propio3Txt.setFont(new Font("SansSerif", Font.BOLD, 22));
		propio3Txt.setForeground(Color.BLACK);
		propio3Txt.setBackground(new Color(240, 240, 240));
		propio3Txt.setBounds(650, 450, 250, 50);
		propio3Txt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		propio4Txt = new JTextField("", SwingConstants.CENTER);
		propio4Txt.setFont(new Font("SansSerif", Font.BOLD, 22));
		propio4Txt.setForeground(Color.BLACK);
		propio4Txt.setBackground(new Color(240, 240, 240));
		propio4Txt.setBounds(650, 500, 250, 50);
		propio4Txt.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
				BorderFactory.createEmptyBorder(5, 15, 5, 15)));

		/// Label

		compraLbl = new JLabel("Compra", SwingConstants.LEFT);
		compraLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		compraLbl.setForeground(Color.BLACK);
		compraLbl.setBounds(350, 50, 300, 50);

		ventaLbl = new JLabel("Venta", SwingConstants.LEFT);
		ventaLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		ventaLbl.setForeground(Color.BLACK);
		ventaLbl.setBounds(350, 100, 300, 50);

		cantidadLbl = new JLabel("Cantidad", SwingConstants.LEFT);
		cantidadLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		cantidadLbl.setForeground(Color.BLACK);
		cantidadLbl.setBounds(350, 150, 300, 50);

		nombreLbl = new JLabel("Nombre", SwingConstants.LEFT);
		nombreLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		nombreLbl.setForeground(Color.BLACK);
		nombreLbl.setBounds(350, 200, 300, 50);

		tamanioLbl = new JLabel("Tamañio", SwingConstants.LEFT);
		tamanioLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		tamanioLbl.setForeground(Color.BLACK);
		tamanioLbl.setBounds(350, 250, 300, 50);

		marcaLbl = new JLabel("Marca", SwingConstants.LEFT);
		marcaLbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		marcaLbl.setForeground(Color.BLACK);
		marcaLbl.setBounds(350, 300, 300, 50);

		propio1Lbl = new JLabel("Propio1", SwingConstants.LEFT);
		propio1Lbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		propio1Lbl.setForeground(Color.BLACK);
		propio1Lbl.setBounds(350, 350, 300, 50);

		propio2Lbl = new JLabel("Propio2", SwingConstants.LEFT);
		propio2Lbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		propio2Lbl.setForeground(Color.BLACK);
		propio2Lbl.setBounds(350, 400, 300, 50);

		propio3Lbl = new JLabel("Propio3", SwingConstants.LEFT);
		propio3Lbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		propio3Lbl.setForeground(Color.BLACK);
		propio3Lbl.setBounds(350, 450, 300, 50);

		propio4Lbl = new JLabel("Propio4", SwingConstants.LEFT);
		propio4Lbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		propio4Lbl.setForeground(Color.BLACK);
		propio4Lbl.setBounds(350, 500, 300, 50);

		titulo = new JLabel("", SwingConstants.CENTER);
		titulo.setFont(new Font("SansSerif", Font.BOLD, 20));
		titulo.setForeground(Color.black);
		titulo.setBounds(450, 5, 500, 50);

///Lbl
		add(compraLbl);
		add(ventaLbl);
		add(cantidadLbl);
		add(nombreLbl);
		add(tamanioLbl);
		add(marcaLbl);
		add(propio1Lbl);
		add(propio2Lbl);
		add(propio3Lbl);
		add(propio4Lbl);
		add(titulo);
///Txt
		add(compraTxt);
		add(ventaTxt);
		add(cantidadTxt);
		add(nombreTxt);
		add(tamanioTxt);
		add(marcaTxt);
		add(propio1Txt);
		add(propio2Txt);
		add(propio3Txt);
		add(propio4Txt);

		add(img4);
///Btn
		add(volverBtn);
		add(finalizarBtn);

	}

	public JLabel getImg4() {
		return img4;
	}

	public void setImg4(JLabel img4) {
		this.img4 = img4;
	}

	public JLabel getCompraLbl() {
		return compraLbl;
	}

	public void setCompraLbl(JLabel compraLbl) {
		this.compraLbl = compraLbl;
	}

	public JLabel getVentaLbl() {
		return ventaLbl;
	}

	public void setVentaLbl(JLabel ventaLbl) {
		this.ventaLbl = ventaLbl;
	}

	public JLabel getCantidadLbl() {
		return cantidadLbl;
	}

	public void setCantidadLbl(JLabel cantidadLbl) {
		this.cantidadLbl = cantidadLbl;
	}

	public JLabel getNombreLbl() {
		return nombreLbl;
	}

	public void setNombreLbl(JLabel nombreLbl) {
		this.nombreLbl = nombreLbl;
	}

	public JLabel getTamanioLbl() {
		return tamanioLbl;
	}

	public void setTamanioLbl(JLabel tamanioLbl) {
		this.tamanioLbl = tamanioLbl;
	}

	public JLabel getMarcaLbl() {
		return marcaLbl;
	}

	public void setMarcaLbl(JLabel marcaLbl) {
		this.marcaLbl = marcaLbl;
	}

	public JLabel getPropio1Lbl() {
		return propio1Lbl;
	}

	public void setPropio1Lbl(JLabel propio1Lbl) {
		this.propio1Lbl = propio1Lbl;
	}

	public JLabel getPropio2Lbl() {
		return propio2Lbl;
	}

	public void setPropio2Lbl(JLabel propio2Lbl) {
		this.propio2Lbl = propio2Lbl;
	}

	public JLabel getPropio3Lbl() {
		return propio3Lbl;
	}

	public void setPropio3Lbl(JLabel propio3Lbl) {
		this.propio3Lbl = propio3Lbl;
	}

	public JLabel getPropio4Lbl() {
		return propio4Lbl;
	}

	public void setPropio4Lbl(JLabel propio4Lbl) {
		this.propio4Lbl = propio4Lbl;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getVolverBtn() {
		return volverBtn;
	}

	public void setVolverBtn(JButton volverBtn) {
		this.volverBtn = volverBtn;
	}

	public JButton getFinalizarBtn() {
		return finalizarBtn;
	}

	public void setFinalizarBtn(JButton finalizarBtn) {
		this.finalizarBtn = finalizarBtn;
	}

	public JTextField getCompraTxt() {
		return compraTxt;
	}

	public void setCompraTxt(JTextField compraTxt) {
		this.compraTxt = compraTxt;
	}

	public JTextField getVentaTxt() {
		return ventaTxt;
	}

	public void setVentaTxt(JTextField ventaTxt) {
		this.ventaTxt = ventaTxt;
	}

	public JTextField getCantidadTxt() {
		return cantidadTxt;
	}

	public void setCantidadTxt(JTextField cantidadTxt) {
		this.cantidadTxt = cantidadTxt;
	}

	public JTextField getNombreTxt() {
		return nombreTxt;
	}

	public void setNombreTxt(JTextField nombreTxt) {
		this.nombreTxt = nombreTxt;
	}

	public JTextField getTamanioTxt() {
		return tamanioTxt;
	}

	public void setTamanioTxt(JTextField tamanioTxt) {
		this.tamanioTxt = tamanioTxt;
	}

	public JTextField getMarcaTxt() {
		return marcaTxt;
	}

	public void setMarcaTxt(JTextField marcaTxt) {
		this.marcaTxt = marcaTxt;
	}

	public JTextField getPropio1Txt() {
		return propio1Txt;
	}

	public void setPropio1Txt(JTextField propio1Txt) {
		this.propio1Txt = propio1Txt;
	}

	public JTextField getPropio2Txt() {
		return propio2Txt;
	}

	public void setPropio2Txt(JTextField propio2Txt) {
		this.propio2Txt = propio2Txt;
	}

	public JTextField getPropio3Txt() {
		return propio3Txt;
	}

	public void setPropio3Txt(JTextField propio3Txt) {
		this.propio3Txt = propio3Txt;
	}

	public JTextField getPropio4Txt() {
		return propio4Txt;
	}

	public void setPropio4Txt(JTextField propio4Txt) {
		this.propio4Txt = propio4Txt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
///F en el chat