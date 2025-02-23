package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;

	public Controller() {
		vf = new ViewFacade();
//		vf.getMw().showHomePanel();
		vf.getMw().showinputPanel();
		asignarLectores();
	}

	public void asignarLectores() {
		/// BOTONES HOME PANEL
		vf.getMw().getHomePanel().getInicioBtn().addActionListener(this);
		vf.getMw().getHomePanel().getInicioBtn().setActionCommand("INICIOP");

		vf.getMw().getHomePanel().getIngresoBtn().addActionListener(this);
		vf.getMw().getHomePanel().getIngresoBtn().setActionCommand("INGRESO");

		vf.getMw().getHomePanel().getRetornoBtn().addActionListener(this);
		vf.getMw().getHomePanel().getRetornoBtn().setActionCommand("RETORNO");

		/// BOTONES MENU PANEL
		vf.getMw().getMenuPanel().getConcentradoBtn().addActionListener(this);
		vf.getMw().getMenuPanel().getConcentradoBtn().setActionCommand("CONCENTRADO");

		vf.getMw().getMenuPanel().getGuacalBtn().addActionListener(this);
		vf.getMw().getMenuPanel().getGuacalBtn().setActionCommand("GUACAL");

		vf.getMw().getMenuPanel().getCorreaBtn().addActionListener(this);
		vf.getMw().getMenuPanel().getCorreaBtn().setActionCommand("CORREA");

		vf.getMw().getMenuPanel().getVolverBtn().addActionListener(this);
		vf.getMw().getMenuPanel().getVolverBtn().setActionCommand("VOLVER");

		/// BOTONES CRUD PANEL
		vf.getMw().getCrudPanel().getVerProductoBtn().addActionListener(this);
		vf.getMw().getCrudPanel().getVerProductoBtn().setActionCommand("VER");

		vf.getMw().getCrudPanel().getAgregarProductoBtn().addActionListener(this);
		vf.getMw().getCrudPanel().getAgregarProductoBtn().setActionCommand("AGREGAR");

		vf.getMw().getCrudPanel().getActualizarProductoBtn().addActionListener(this);
		vf.getMw().getCrudPanel().getActualizarProductoBtn().setActionCommand("ACTUALIZAR");

		vf.getMw().getCrudPanel().getEliminarProductoBtn().addActionListener(this);
		vf.getMw().getCrudPanel().getEliminarProductoBtn().setActionCommand("ELIMINAR");

		vf.getMw().getCrudPanel().getVolverBtn().addActionListener(this);
		vf.getMw().getCrudPanel().getVolverBtn().setActionCommand("VOLVER2");

		/// BOTONES INPUT PANEL
		vf.getMw().getInputPanel().getVolverBtn().addActionListener(this);
		vf.getMw().getInputPanel().getVolverBtn().setActionCommand("VOLVER3");

		vf.getMw().getInputPanel().getFinalizarBtn().addActionListener(this);
		vf.getMw().getInputPanel().getFinalizarBtn().setActionCommand("FINALIZAR");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
///Acciones Home Panel
		case "INICIOP":

			vf.getMw().showMenuPanel();
			break;
		case "INGRESO":

			break;

		case "RETORNO":
			break;

///Acciones Menu Panel
		case "CONCENTRADO":
			vf.getMw().showcrudPanel();
			break;
		case "GUACAL":
			vf.getMw().showcrudPanel();
			break;
		case "CORREA":
			vf.getMw().showcrudPanel();
			break;
		case "VOLVER":
			vf.getMw().showHomePanel();
			break;
///Acciones CRUD Panel
		case "VER":
			vf.getMw().showinputPanel();
			break;
		case "AGREGAR":
			vf.getMw().showinputPanel();
			break;
		case "ACTUALIZAR":
			vf.getMw().showinputPanel();
			break;
		case "ELIMINAR":
			break;

		case "VOLVER2":
			vf.getMw().showinputPanel();

/// Acciones INPUT Panel
		case "VOLVER3":
			vf.getMw().showMenuPanel();
		case "FINALIZAR":

		default:
			break;
		}
	}
}
