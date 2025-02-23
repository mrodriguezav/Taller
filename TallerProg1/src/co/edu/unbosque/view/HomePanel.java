package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel img;
	private JButton inicioBtn, ingresoBtn, retornoBtn;

	public HomePanel() {
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		inicioBtn = new JButton("inicio");
		inicioBtn.setBounds(505, 335, 280, 50);
		inicioBtn.setActionCommand("INICIOP");
		inicioBtn.setOpaque(false);

		ingresoBtn = new JButton("ingresos");
		ingresoBtn.setBounds(505, 438, 280, 70);
		ingresoBtn.setActionCommand("INGRESO");
		ingresoBtn.setOpaque(false);

		retornoBtn = new JButton("retorno");
		retornoBtn.setBounds(505, 550, 280, 50);
		retornoBtn.setActionCommand("RETORNO");
		retornoBtn.setOpaque(false);

		img = new JLabel();
		ImageIcon imagenPortada2 = new ImageIcon("src/media/1.png");
		Image portadaRedimensionada2 = imagenPortada2.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(portadaRedimensionada2));
		img.setBounds(0, 0, 1280, 720);
		img.setVisible(true);
		add(img);

		add(retornoBtn);
		add(ingresoBtn);
		add(inicioBtn);

	}

	public JLabel getImg() {
		return img;
	}

	public void setImg(JLabel img) {
		this.img = img;
	}

	public JButton getInicioBtn() {
		return inicioBtn;
	}

	public void setInicioBtn(JButton inicioBtn) {
		this.inicioBtn = inicioBtn;
	}

	public JButton getIngresoBtn() {
		return ingresoBtn;
	}

	public void setIngresoBtn(JButton ingresoBtn) {
		this.ingresoBtn = ingresoBtn;
	}

	public JButton getRetornoBtn() {
		return retornoBtn;
	}

	public void setRetornoBtn(JButton retornoBtn) {
		this.retornoBtn = retornoBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
