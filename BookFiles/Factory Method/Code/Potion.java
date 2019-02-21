import java.util.ArrayList;

public abstract class Potion {
	String potionName;
	String gooeyness;
	String blood;
	ArrayList<String> herbs = new ArrayList<String>();
 
	void boil() {
		System.out.println("Boil " + potionName);
		System.out.println("Drop in blood...");
		System.out.println("Drop in herbs: ");
	}
  
	void bubble() {
		System.out.println("Bubble for 3 moons and a sunset");
	}
 
	void brew() {
		System.out.println("Brewing at Low Temperature");
	}
  
	void bottle() {
		System.out.println("Bottle concoction in flask");
	}
 
	public String getPotionName() {
		return potionName;
	}
}

 
 
