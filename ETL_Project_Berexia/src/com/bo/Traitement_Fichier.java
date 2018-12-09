package com.bo;

public class Traitement_Fichier {

		
		private String fileName;
		private String operationName;
		private String Query;
		
		public Traitement_Fichier(String fileName, String operationName, String query) {
			super();
			this.fileName = fileName;
			this.operationName = operationName;
			Query = query;
		}

		public Traitement_Fichier() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getOperationName() {
			return operationName;
		}

		public void setOperationName(String operationName) {
			this.operationName = operationName;
		}

		public String getQuery() {
			return Query;
		}

		public void setQuery(String query) {
			Query = query;
		}

	}

