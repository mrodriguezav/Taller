package co.edu.unbosque.view;

public class ViewFacade {

	private MainWindow mw;
	private Consola con;

	public ViewFacade() {
		mw = new MainWindow();
		con = new Consola();
	}

	public MainWindow getMw() {
		return mw;
	}

	public void setMw(MainWindow mw) {
		this.mw = mw;
	}

	public Consola getCon() {
		return con;
	}

	public void setCon(Consola con) {
		this.con = con;
	}

}
