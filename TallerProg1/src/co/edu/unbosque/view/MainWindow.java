package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HomePanel homePanel;
	private MenuPanel menuPanel;
	private CrudPanel crudPanel;
	private InputPanel inputPanel;

	public MainWindow() {

		setLocation(50, 50);
		setSize(1280, 720);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("SLINKY PETS");
		ImageIcon logoApp = new ImageIcon("src/media/Pet1.png");
		setIconImage(logoApp.getImage());

		homePanel = new HomePanel();
		menuPanel = new MenuPanel();
		crudPanel = new CrudPanel();
		inputPanel = new InputPanel();

	}

	public void showHomePanel() {
		setContentPane(homePanel);
	}

	public void showMenuPanel() {
		setContentPane(menuPanel);
	}

	public void crudPanel() {
		setContentPane(crudPanel);

	}

	public void inputPanel() {
		setContentPane(inputPanel);
	}

	public HomePanel getHomePanel() {
		return homePanel;
	}

	public void setHomePanel(HomePanel homePanel) {
		this.homePanel = homePanel;
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CrudPanel getCrudPanel() {
		return crudPanel;
	}

	public void setCrudPanel(CrudPanel crudPanel) {
		this.crudPanel = crudPanel;
	}

	public InputPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputPanel inputPanel) {
		this.inputPanel = inputPanel;
	}

}
