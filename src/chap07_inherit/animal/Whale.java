package chap07_inherit.animal;

public class Whale extends Animal {
	
	//속성
	 private String food; //먹이
	 private String habitat; //사는 곳
	 private String species; //종
	 private int teeth; //이빨
	 
	// 생성자
	 public Whale(String food, String habitat, String species, int teeth, boolean spout, boolean herd) {
		 this.food = food;
		 this.habitat = habitat;
		 this.species = species;
		 this.teeth = teeth;
	    }

	 // Getter Setter 메서드
	 public String getFood() {
		 return food;
	 }

	 public void setFood(String food) {
		 this.food = food;
	 }

	 public String getHabitat() {
		 return habitat;
	 }

	 public void setHabitat(String habitat) {
		 this.habitat = habitat;
	 }

	 public String getSpecies() {
		 return species;
	 }

	 public void setSpecies(String species) {
		 this.species = species;
	 }

	 public int getTeeth() {
		 return teeth;
	 }

	 public void setTeeth(int teeth) {
		 this.teeth = teeth;
	 }
	 
	 //기능 메서드
	 public void eat() {
	        System.out.println("먹는다.");
	    }

	    public void move() {
	        System.out.println("물을 뿜는다.");
	    }

	    public void groupBehavior() {
	        System.out.println("무리지어 다닌다.");
	    }


}
