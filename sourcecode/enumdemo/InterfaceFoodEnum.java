/*
Copyright 2010 kiddy
*/
package enumdemo;

public interface InterfaceFoodEnum {
	String DEFAULT_NAME = "food";	//static final string
	
	String getName();
	
	enum Coffee implements InterfaceFoodEnum {	//public enum
		BLACK_COFFEE, DECAF_COFFEE, CAPPUCCINO;
		
		public String getName() {
			return null;
		}
	}
	enum Dessert implements InterfaceFoodEnum {
		FRUIT("ˮ��"), CAKE("����"), GELATO("����");
		
		String name;
		private Dessert(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
}
