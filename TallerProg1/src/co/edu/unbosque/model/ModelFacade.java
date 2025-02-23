package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ConcentradoDAO;
import co.edu.unbosque.model.persistence.CorreaDAO;
import co.edu.unbosque.model.persistence.GuacalDAO;

public class ModelFacade {
	private ConcentradoDAO concentradoDAO;
	private CorreaDAO correaDAO;
	private GuacalDAO guacalDAO;

	public ModelFacade() {
		concentradoDAO = new ConcentradoDAO();
		correaDAO = new CorreaDAO();
		guacalDAO = new GuacalDAO();
	}

	public ConcentradoDAO getConcentradoDAO() {
		return concentradoDAO;
	}

	public void setConcentradoDAO(ConcentradoDAO concentradoDAO) {
		this.concentradoDAO = concentradoDAO;
	}

	public CorreaDAO getCorreaDAO() {
		return correaDAO;
	}

	public void setCorreaDAO(CorreaDAO correaDAO) {
		this.correaDAO = correaDAO;
	}

	public GuacalDAO getGuacalDAO() {
		return guacalDAO;
	}

	public void setGuacalDAO(GuacalDAO guacalDAO) {
		this.guacalDAO = guacalDAO;
	}

}
