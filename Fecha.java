import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	public static String obtenerFecha() {
		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema
		Calendar fecha = new GregorianCalendar();
		/**
		 * Obtenemos el valor del año, mes, dia, hora, minuto y segundo del sistema
		 * usando el metodo get y el parametro correspondiente
		 */
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		return dia + "/" + (mes + 1) + "/" + anio + " " + hora + ":" + minuto + ":" + segundo;
	}

	public static void main(String[] args) {
		System.out.println(obtenerFecha());

	}

}
