package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CrudPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel img3;
	private JButton verProductoBtn, agregarProductoBtn, actualizarProductoBtn, eliminarProductoBtn, volverBtn;

	public CrudPanel() {
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		verProductoBtn = new JButton("ver");
		verProductoBtn.setBounds(505, 335, 280, 50);
		verProductoBtn.setActionCommand("VER");
		verProductoBtn.setOpaque(false);

		agregarProductoBtn = new JButton("agregar");
		agregarProductoBtn.setBounds(505, 438, 280, 70);
		agregarProductoBtn.setActionCommand("AGREGAR");
		agregarProductoBtn.setOpaque(false);

		actualizarProductoBtn = new JButton("actualizar");
		actualizarProductoBtn.setBounds(505, 550, 280, 50);
		actualizarProductoBtn.setActionCommand("ACTUALIZAR");
		actualizarProductoBtn.setOpaque(false);

		eliminarProductoBtn = new JButton("eliminar");
		eliminarProductoBtn.setBounds(505, 550, 280, 50);
		eliminarProductoBtn.setActionCommand("ELIMINAR");
		eliminarProductoBtn.setOpaque(false);

		volverBtn = new JButton("volver");
		volverBtn.setBounds(505, 550, 280, 50);
		volverBtn.setActionCommand("VOLVER2");
		volverBtn.setOpaque(false);

		img3 = new JLabel();
		ImageIcon imagenPortada2 = new ImageIcon("src/media/Pet3.png");
		Image portadaRedimensionada2 = imagenPortada2.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		img3.setIcon(new ImageIcon(portadaRedimensionada2));
		img3.setBounds(0, 0, 1280, 720);
		img3.setVisible(true);
		add(img3);

		add(verProductoBtn);
		add(agregarProductoBtn);
		add(actualizarProductoBtn);
		add(eliminarProductoBtn);
		add(volverBtn);

	}

	public JLabel getImg3() {
		return img3;
	}

	public void setImg3(JLabel img3) {
		this.img3 = img3;
	}

	public JButton getVerProductoBtn() {
		return verProductoBtn;
	}

	public void setVerProductoBtn(JButton verProductoBtn) {
		this.verProductoBtn = verProductoBtn;
	}

	public JButton getAgregarProductoBtn() {
		return agregarProductoBtn;
	}

	public void setAgregarProductoBtn(JButton agregarProductoBtn) {
		this.agregarProductoBtn = agregarProductoBtn;
	}

	public JButton getActualizarProductoBtn() {
		return actualizarProductoBtn;
	}

	public void setActualizarProductoBtn(JButton actualizarProductoBtn) {
		this.actualizarProductoBtn = actualizarProductoBtn;
	}

	public JButton getEliminarProductoBtn() {
		return eliminarProductoBtn;
	}

	public void setEliminarProductoBtn(JButton eliminarProductoBtn) {
		this.eliminarProductoBtn = eliminarProductoBtn;
	}

	public JButton getVolverBtn() {
		return volverBtn;
	}

	public void setVolverBtn(JButton volverBtn) {
		this.volverBtn = volverBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
