package Ejercicio6;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;

	public Fecha() { // CONSTRUCTOR DEFECTO

	}

	public Fecha(int dia, int mes, int anyo) { // CONSTRUCTOR PARAMETROS
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public Fecha(final Fecha f) { // CONSTRUCTOR COPIA
		dia = f.dia;
		mes = f.mes;
		anyo = f.anyo;
	}

	public int getDia() { // GETTERS
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int anyo() {
		return anyo;
	}

	public void setDia(int dia) { // SETTERS
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	private boolean esBisiesto() {
		boolean bisiesto = false;
		if (anyo % 4 == 0 & anyo % 100 != 0 || anyo % 400 == 0) {
			bisiesto = true;
		}
		return bisiesto;
	}

	public boolean fechaCorrecta(Fecha f) {
		boolean checkDia = false;
		boolean checkMes = mes >= 1 & mes <= 12;
		boolean checkAnyo = anyo > 0;

		switch (mes) {
		case 2:
			if (esBisiesto()) {
				checkDia = dia >= 1 & dia >= 29;
			} else {
				checkDia = dia >= 1 & dia >= 28;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			checkDia = dia >= 1 & dia >= 30;
			break;

		default:
			checkDia = dia >= 1 & dia >= 31;
			break;
		}

		return checkDia & checkMes & checkAnyo;
	}

	public void diaSiguiente(Fecha f) {
		if (f.esBisiesto() & mes == 2 & dia == 29) {
			this.mes = mes + 1;
			this.dia = 1;
		} else {
			if (mes == 4 | mes == 6 | mes == 9 | mes == 11 & dia == 30) {
				this.mes = mes + 1;
				this.dia = 1;
			} else {
				if (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 & dia == 31) {
					this.mes = mes + 1;
					this.dia = 1;
				} else {
					if (mes == 12 & dia == 31) {
						this.anyo = anyo + 1;
						this.mes = 1;
						this.dia = 1;
					} else {
						if (!f.esBisiesto() & mes == 2 & dia == 28) {
							this.mes = mes + 1;
							this.dia = 1;
						} else {
							this.dia = dia + 1;
							this.mes = mes + 1;
						}

					}

				}

			}
		}
	}

	public String toString(Fecha f) {
		if (dia < 10 & mes < 10) {
			String fecha = "0" + dia + "-0" + mes + "-" + anyo;
			return fecha;
		} else {
			if (dia < 10) {
				String fecha = "0" + dia + "-" + mes + "-" + anyo;
				return fecha;
			} else {
				if (mes < 10) {
					String fecha = dia + "-0" + mes + "-" + anyo;
					return fecha;
				} else {
					String fecha = dia + "-" + mes + "-" + anyo;
					return fecha;
				}

			}

		}

	}
}
