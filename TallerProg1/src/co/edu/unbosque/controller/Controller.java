package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Concentrado;
import co.edu.unbosque.model.Correa;
import co.edu.unbosque.model.Guacal;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {
	private ViewFacade vf;
	private ModelFacade mf;

	private boolean concentrado, correa, guacal, agregar, actualizar;
	private int indexA;

	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();

		vf.getMw().showHomePanel();
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
			double inversion = mf.getConcentradoDAO().calcularInversion() + mf.getCorreaDAO().calcularInversion()
					+ mf.getGuacalDAO().calcularInversion();
			vf.getCon().mostrarMensajeEmergente("Su inversión ha sido de " + inversion + " pesos colombianos");

			break;

		case "RETORNO":
			double retorno = mf.getConcentradoDAO().calcularRetorno() + mf.getCorreaDAO().calcularRetorno()
					+ mf.getGuacalDAO().calcularRetorno();
			vf.getCon().mostrarMensajeEmergente("Su retorno de inversión ha sido de " + retorno + " pesos colombianos");
			break;

///Acciones Menu Panel
		case "CONCENTRADO":
			concentrado = true;
			vf.getMw().getCrudPanel().getTitulo().setText("ADMINISTRANDO CONCENTRADOS");
			vf.getMw().showcrudPanel();

			break;

		case "GUACAL":
			guacal = true;
			vf.getMw().getCrudPanel().getTitulo().setText("ADMINISTRANDO GUACALES");
			vf.getMw().showcrudPanel();
			break;

		case "CORREA":
			correa = true;
			vf.getMw().getCrudPanel().getTitulo().setText("ADMINISTRANDO CORREAS");
			vf.getMw().showcrudPanel();
			break;

		case "VOLVER":

			vf.getMw().showHomePanel();
			break;

///Acciones CRUD Panel
		case "VER":
			if (concentrado) {
				vf.getCon().mostrarMensajeEmergenteConScroll(mf.getConcentradoDAO().mostrarTodo());
			} else if (guacal) {
				vf.getCon().mostrarMensajeEmergenteConScroll(mf.getGuacalDAO().mostrarTodo());
			} else if (correa) {
				vf.getCon().mostrarMensajeEmergenteConScroll(mf.getCorreaDAO().mostrarTodo());
			}
			break;

		case "AGREGAR":
			agregar = true;
			if (concentrado == true) {
				vf.getMw().getInputPanel().getTitulo().setText("AGREGANDO CONCENTRADO: ");
				vf.getMw().getInputPanel().getCompraLbl().setText("Gasto del producto: ");
				vf.getMw().getInputPanel().getVentaLbl().setText("Precio de venta: ");
				vf.getMw().getInputPanel().getCantidadLbl().setText("Cantidad: ");
				vf.getMw().getInputPanel().getNombreLbl().setText("Nombre: ");
				vf.getMw().getInputPanel().getTamanioLbl().setText("Tamaño: ");
				vf.getMw().getInputPanel().getMarcaLbl().setText("Marca: ");
				vf.getMw().getInputPanel().getPropio1Lbl().setText("Ingrediente principal: ");
				vf.getMw().getInputPanel().getPropio2Lbl().setText("Es de bolsa plástica?: ");
				vf.getMw().getInputPanel().getPropio3Lbl().setText("Cantidad del producto (lb): ");
				vf.getMw().getInputPanel().getPropio4Lbl().setText("Es para cachorro?: ");
			} else if (guacal == true) {
				vf.getMw().getInputPanel().getTitulo().setText("AGREGANDO GUACAL");
				vf.getMw().getInputPanel().getCompraLbl().setText("Gasto del producto: ");
				vf.getMw().getInputPanel().getVentaLbl().setText("Precio de venta: ");
				vf.getMw().getInputPanel().getCantidadLbl().setText("Cantidad: ");
				vf.getMw().getInputPanel().getNombreLbl().setText("Nombre: ");
				vf.getMw().getInputPanel().getTamanioLbl().setText("Tamaño: ");
				vf.getMw().getInputPanel().getMarcaLbl().setText("Marca: ");
				vf.getMw().getInputPanel().getPropio1Lbl().setText("Es grande? (Si/No): ");
				vf.getMw().getInputPanel().getPropio2Lbl().setText("Material: ");
				vf.getMw().getInputPanel().getPropio3Lbl().setText("Es para perros?: ");
				vf.getMw().getInputPanel().getPropio4Lbl().setText("Color: ");
			} else if (correa == true) {
				vf.getMw().getInputPanel().getTitulo().setText("AGREGANDO CORREA");
				vf.getMw().getInputPanel().getCompraLbl().setText("Gasto del producto: ");
				vf.getMw().getInputPanel().getVentaLbl().setText("Precio de venta: ");
				vf.getMw().getInputPanel().getCantidadLbl().setText("Cantidad: ");
				vf.getMw().getInputPanel().getNombreLbl().setText("Nombre: ");
				vf.getMw().getInputPanel().getTamanioLbl().setText("Tamaño: ");
				vf.getMw().getInputPanel().getMarcaLbl().setText("Marca: ");
				vf.getMw().getInputPanel().getPropio1Lbl().setText("Color: ");
				vf.getMw().getInputPanel().getPropio2Lbl().setText("Longitud: ");
				vf.getMw().getInputPanel().getPropio3Lbl().setText("Material: ");
				vf.getMw().getInputPanel().getPropio4Lbl().setText("Es de ahogo?: ");
			}

			vf.getMw().showinputPanel();
			break;

		case "ACTUALIZAR":
			actualizar = true;
			vf.getCon().mostrarMensajeEmergente("Ingrese el número del producto a actualizar");
			indexA = vf.getCon().ingresarNumero() - 1;

			if (concentrado) {
				if (mf.getConcentradoDAO().checkIndex(indexA)) {
					vf.getMw().getInputPanel().getTitulo().setText("ACTUALIZANDO CONCENTRADO");
					vf.getMw().showinputPanel();
				} else {
					vf.getCon().mostrarAlerta("No existe el número del producto seleccionado");
				}

			} else if (guacal) {
				if (mf.getGuacalDAO().checkIndex(indexA)) {
					vf.getMw().getInputPanel().getTitulo().setText("ACTUALIZANDO GUACAL");
					vf.getMw().showinputPanel();
				} else {
					vf.getCon().mostrarAlerta("No existe el número del producto seleccionado");
				}

			} else if (correa) {
				if (mf.getCorreaDAO().checkIndex(indexA)) {
					vf.getMw().getInputPanel().getTitulo().setText("ACTUALIZANDO CORREA");
					vf.getMw().showinputPanel();
				} else {
					vf.getCon().mostrarAlerta("No existe el número del producto seleccionado");
				}

			}

			break;

		case "ELIMINAR":
			if (concentrado) {
				vf.getCon().mostrarMensajeEmergente("Ingrese el número del producto a eliminar");
				int eliminar = vf.getCon().ingresarNumero() - 1;
				if (mf.getConcentradoDAO().eliminar(eliminar) == 0) {
					vf.getCon().mostrarMensajeEmergente("Producto eliminado exitosamente");
				} else {
					vf.getCon().mostrarMensajeEmergente("No fue posible eliminar el producto");
				}
			} else if (guacal) {
				vf.getCon().mostrarMensajeEmergente("Ingrese el número del producto a eliminar");
				int eliminar = vf.getCon().ingresarNumero() - 1;
				if (mf.getGuacalDAO().eliminar(eliminar) == 0) {
					vf.getCon().mostrarMensajeEmergente("Producto eliminado exitosamente");
				} else {
					vf.getCon().mostrarMensajeEmergente("No fue posible eliminar el producto");
				}

			} else if (correa) {
				vf.getCon().mostrarMensajeEmergente("Ingrese el número del producto a eliminar");
				int eliminar = vf.getCon().ingresarNumero() - 1;
				if (mf.getCorreaDAO().eliminar(eliminar) == 0) {
					vf.getCon().mostrarMensajeEmergente("Producto eliminado exitosamente");
				} else {
					vf.getCon().mostrarMensajeEmergente("No fue posible eliminar el producto");
				}
			}
			break;

		case "VOLVER2":
			concentrado = false;
			guacal = false;
			correa = false;
			vf.getMw().showMenuPanel();
			break;

/// Acciones INPUT Panel
		case "VOLVER3":
			vf.getMw().showcrudPanel();
			vf.getMw().getInputPanel().getCompraTxt().setText("");
			vf.getMw().getInputPanel().getVentaTxt().setText("");
			vf.getMw().getInputPanel().getCantidadTxt().setText("");
			vf.getMw().getInputPanel().getNombreTxt().setText("");
			vf.getMw().getInputPanel().getTamanioTxt().setText("");
			vf.getMw().getInputPanel().getMarcaTxt().setText("");
			vf.getMw().getInputPanel().getPropio1Txt().setText("");
			vf.getMw().getInputPanel().getPropio2Txt().setText("");
			vf.getMw().getInputPanel().getPropio3Txt().setText("");
			vf.getMw().getInputPanel().getPropio4Txt().setText("");

			break;

		case "FINALIZAR":
			if (agregar) {
				if (concentrado) {
					double compra = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					double venta = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					int cantidad = Integer.parseInt(vf.getMw().getInputPanel().getCantidadTxt().getText());
					String nombre = vf.getMw().getInputPanel().getNombreTxt().getText();
					String tamanio = vf.getMw().getInputPanel().getTamanioTxt().getText();
					String marca = vf.getMw().getInputPanel().getMarcaTxt().getText();
					String ingrediente = vf.getMw().getInputPanel().getPropio1Txt().getText();
					String esbolsaPlastica = vf.getMw().getInputPanel().getPropio2Txt().getText();
					boolean esbolsaPlasticaO;
					if (esbolsaPlastica.equalsIgnoreCase("si")) {
						esbolsaPlasticaO = true;
					} else {
						esbolsaPlasticaO = false;

					}
					float cantComida = Float.parseFloat(vf.getMw().getInputPanel().getPropio3Txt().getText());
					String esParaCachorro = vf.getMw().getInputPanel().getPropio2Txt().getText();
					boolean esParaCachorroO;
					if (esParaCachorro.equalsIgnoreCase("si")) {
						esParaCachorroO = true;
					} else {
						esParaCachorroO = false;
						mf.getConcentradoDAO().Crear(new Concentrado(compra, venta, cantidad, nombre, tamanio, marca,
								ingrediente, esbolsaPlasticaO, cantComida, esParaCachorroO));
						vf.getCon().mostrarMensajeEmergente("PRODUCTO AGREGADO EXITOSAMENTE");
					}
				} else if (guacal) {
					double compra = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					double venta = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					int cantidad = Integer.parseInt(vf.getMw().getInputPanel().getCantidadTxt().getText());
					String nombre = vf.getMw().getInputPanel().getNombreTxt().getText();
					String tamanio = vf.getMw().getInputPanel().getTamanioTxt().getText();
					String marca = vf.getMw().getInputPanel().getMarcaTxt().getText();
					String esGrande = vf.getMw().getInputPanel().getPropio1Txt().getText();

					boolean esGrandeY;
					if (esGrande.equalsIgnoreCase("si")) {
						esGrandeY = true;
					} else {
						esGrandeY = false;
					}
					String material = vf.getMw().getInputPanel().getPropio2Txt().getText();
					String esParaPerro = vf.getMw().getInputPanel().getPropio3Txt().getText();
					boolean esParaPerroN;
					if (esParaPerro.equalsIgnoreCase("si")) {
						esParaPerroN = true;
					} else {
						esParaPerroN = false;
					}
					String color = vf.getMw().getInputPanel().getPropio4Txt().getText();
					mf.getGuacalDAO().Crear(new Guacal(compra, venta, cantidad, nombre, tamanio, marca, esGrandeY,
							material, esParaPerroN, color));
					vf.getCon().mostrarMensajeEmergente("PRODUCTO AGREGADO EXITOSAMENTE");

				} else if (correa) {
					double compra = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					double venta = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					int cantidad = Integer.parseInt(vf.getMw().getInputPanel().getCantidadTxt().getText());
					String nombre = vf.getMw().getInputPanel().getNombreTxt().getText();
					String tamanio = vf.getMw().getInputPanel().getTamanioTxt().getText();
					String marca = vf.getMw().getInputPanel().getMarcaTxt().getText();
					String color = vf.getMw().getInputPanel().getPropio1Txt().getText();
					float longitud = Float.parseFloat(vf.getMw().getInputPanel().getPropio2Txt().getText());
					String material = vf.getMw().getInputPanel().getPropio3Txt().getText();
					String esDeAhogo = vf.getMw().getInputPanel().getPropio4Txt().getText();
					boolean esDeAhogoT;
					if (esDeAhogo.equalsIgnoreCase("si")) {
						esDeAhogoT = true;
					} else {
						esDeAhogoT = false;
					}

					mf.getCorreaDAO().Crear(new Correa(compra, venta, cantidad, nombre, tamanio, marca, color, longitud,
							material, esDeAhogoT));
					vf.getCon().mostrarMensajeEmergente("PRODUCTO AGREGADO EXITOSAMENTE");
				}
			} else if (actualizar) {

				if (concentrado) {

				} else if (guacal) {

				} else if (correa) {
					double compraA = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					double ventaA = Double.parseDouble(vf.getMw().getInputPanel().getCompraTxt().getText());
					int cantidadA = Integer.parseInt(vf.getMw().getInputPanel().getCantidadTxt().getText());
					String nombreA = vf.getMw().getInputPanel().getNombreTxt().getText();
					String tamanioA = vf.getMw().getInputPanel().getTamanioTxt().getText();
					String marcaA = vf.getMw().getInputPanel().getMarcaTxt().getText();
					String colorA = vf.getMw().getInputPanel().getPropio1Txt().getText();
					float longitudA = Float.parseFloat(vf.getMw().getInputPanel().getPropio2Txt().getText());
					String materialA = vf.getMw().getInputPanel().getPropio3Txt().getText();
					String esDeAhogoA = vf.getMw().getInputPanel().getPropio4Txt().getText();
					boolean esDeAhogoTA;
					if (esDeAhogoA.equalsIgnoreCase("si")) {
						esDeAhogoTA = true;
					} else {
						esDeAhogoTA = false;
					}

					if (mf.getCorreaDAO().actualizar(indexA, new Correa(compraA, ventaA, cantidadA, nombreA, tamanioA,
							marcaA, colorA, longitudA, materialA, esDeAhogoTA)) == 0) {
						vf.getCon().mostrarMensajeEmergente("PRODUCTO ACTUALIZADO EXITOSAMENTE");
					} else {
						vf.getCon().mostrarMensajeEmergente("No fue posible actualizar el producto");
					}
				}

			}

			vf.getMw().getInputPanel().getCompraTxt().setText("");
			vf.getMw().getInputPanel().getVentaTxt().setText("");
			vf.getMw().getInputPanel().getCantidadTxt().setText("");
			vf.getMw().getInputPanel().getNombreTxt().setText("");
			vf.getMw().getInputPanel().getTamanioTxt().setText("");
			vf.getMw().getInputPanel().getMarcaTxt().setText("");
			vf.getMw().getInputPanel().getPropio1Txt().setText("");
			vf.getMw().getInputPanel().getPropio2Txt().setText("");
			vf.getMw().getInputPanel().getPropio3Txt().setText("");
			vf.getMw().getInputPanel().getPropio4Txt().setText("");

			agregar = false;
			vf.getMw().showcrudPanel();
			break;

		default:
			break;
		}
	}
}
