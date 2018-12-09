package com.bo;


import java.util.Date;
import java.util.Scanner;

public class Exec_Enreg {

	public static void main(String[] args) throws Exception {
		
		fenetre1 graphic=new fenetre1();
		graphic.main(null);
		
		// donnees vers la base de donnees
		System.out.println("Execution");
		EnregestrementBD EDB=new EnregestrementBD();
		EnregestrementBD.readCsv("src/dataSet/Korea Policy File 100k.csv");
		EnregestrementBD.readXLSXFile("src/dataSet/EA_result_1351.xlsx");
		
		
	}


}
