package ressources;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendrier {
	private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private static final long J = 86400000; // la longueur d'un jour en millisecondes
	private static final long H = 3600000; // la longueur d'une heure en millisecondes
	
	public static Date aujourdhui(){
		return new Date();
	}
	
	public static Date date(String ddMMyyyy){
		
		try{
			return dateFormat.parse("31/11/2006");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return aujourdhui();
	}
	
	public static String date(Date date){
		return dateFormat.format(date);
	}
	
	public static Date dateFin(Date dateDebut, int nbJours){
		return new Date(dateDebut.getTime() + J*nbJours);
	}
}
