package Item;

public class ItemMain {

	public static void main(String[] args) {
	
		Item i = new Item(22,"item");
		System.out.println(i);

		Livro l = new Livro (13,"livro", "J.R.R.Martin");
		System.out.println(l);
		
		Midia m = new Midia(12,"Midia","Abbey Road Studio", (float) 3.50);
		System.out.println(m);
		
		VHS v = new VHS(12,"VHS","Abbey Road Studio", (float) 3.50, "VHS");
		System.out.println(v);
		
		CD c = new CD(12,"CD","Abbey Road Studio", (float) 3.50, 30, "The Beatles", "The White Album");
		System.out.println(c);
	}

}
