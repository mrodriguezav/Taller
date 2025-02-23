package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel img2;
	private JButton concentradoBtn, guacalBtn, correaBtn, volverBtn;

	public MenuPanel() {
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		concentradoBtn = new JButton("concentrado");
		concentradoBtn.setBounds(370, 330, 180, 65);
		concentradoBtn.setActionCommand("CONCENTRADO");
		concentradoBtn.setOpaque(false);

		guacalBtn = new JButton("guacal");
		guacalBtn.setBounds(730, 335, 180, 65);
		guacalBtn.setActionCommand("GUACAL");
		guacalBtn.setOpaque(false);

		correaBtn = new JButton("correa");
		correaBtn.setBounds(540, 485, 180, 65);
		correaBtn.setActionCommand("CORREA");
		correaBtn.setOpaque(false);

		volverBtn = new JButton("volver");
		volverBtn.setBounds(65, 550, 180, 65);
		volverBtn.setActionCommand("VOLVER");
		volverBtn.setOpaque(false);

		img2 = new JLabel();
		ImageIcon imagenPortada2 = new ImageIcon("src/media/Pet2.png");
		Image portadaRedimensionada2 = imagenPortada2.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		img2.setIcon(new ImageIcon(portadaRedimensionada2));
		img2.setBounds(0, 0, 1280, 720);
		img2.setVisible(true);
		add(img2);

		add(concentradoBtn);
		add(guacalBtn);
		add(correaBtn);
		add(volverBtn);
	}

	public JLabel getImg2() {
		return img2;
	}

	public void setImg2(JLabel img2) {
		this.img2 = img2;
	}

	public JButton getConcentradoBtn() {
		return concentradoBtn;
	}

	public void setConcentradoBtn(JButton concentradoBtn) {
		this.concentradoBtn = concentradoBtn;
	}

	public JButton getGuacalBtn() {
		return guacalBtn;
	}

	public void setGuacalBtn(JButton guacalBtn) {
		this.guacalBtn = guacalBtn;
	}

	public JButton getCorreaBtn() {
		return correaBtn;
	}

	public void setCorreaBtn(JButton correaBtn) {
		this.correaBtn = correaBtn;
	}

	public JButton getVolverBtn() {
		return volverBtn;
	}

	public void setVolverBtn(JButton volverBtn) {
		this.volverBtn = volverBtn;
	}

}
