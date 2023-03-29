package chap07_inherit.animal;

public class Bear extends Animal {
	
	//멤버 변수
    private boolean likesHoney; //꿀 좋아하는지
    private String habitat; //서식지
    private String species; //종
    private boolean hibernates; //겨울잠 여부
    
    //생성자
    public Bear(boolean likesHoney, String habitat, String species, boolean hibernates) {
    	this.likesHoney = likesHoney;
        this.habitat = habitat;
        this.species = species;
        this.hibernates = hibernates;
        
    }

	public boolean isLikesHoney() {
		return likesHoney;
	}

	public void setLikesHoney(boolean likesHoney) {
		this.likesHoney = likesHoney;
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

	public boolean isHibernates() {
		return hibernates;
	}

	public void setHibernates(boolean hibernates) {
		this.hibernates = hibernates;
	}
	
	//기능 메서드
	public void eat() {
        System.out.println("먹는다.");
    }

    public void hibernate() {
        System.out.println("겨울잠을 잔다.");
    }

    public void swim() {
        System.out.println("수영한다.");
    }
		
		

}
