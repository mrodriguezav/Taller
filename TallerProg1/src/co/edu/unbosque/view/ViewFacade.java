package co.edu.unbosque.view;

public class ViewFacade {

	private MainWindow mw;

	public ViewFacade() {
		mw = new MainWindow();
	}

	public MainWindow getMw() {
		return mw;
	}

	public void setMw(MainWindow mw) {
		this.mw = mw;
	}
	

}
