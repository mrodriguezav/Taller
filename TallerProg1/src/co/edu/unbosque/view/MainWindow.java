package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HomePanel homePanel;

	public MainWindow() {

		setLocation(50, 50);
		setSize(1280, 720);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		homePanel = new HomePanel();

	}

	public void showHomePanel() {
		setContentPane(homePanel);
	}

	public HomePanel getHomePanel() {
		return homePanel;
	}

	public void setHomePanel(HomePanel homePanel) {
		this.homePanel = homePanel;
	}

}
