package se.nackademin;

class Lemur implements Animal {
	private String name = "Lemur";
	private int age = 0;
	private int fluffiness = 4;
	public int hunger = 5;
	public boolean isHungry = false;

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public int getFluffiness() { return this.fluffiness; }

	public String speak() { return "Hakkunah Matatatatatatata"; }
	
	public void backflip() {}
	
	public boolean eat() {
		if (this.hunger < 5) {
			this.isHungry = true;
			this.eat();
		}
		else {
			this.isHungry = false;
		}
		
		return !this.isHungry;
	
	}
	public void sleep() {}
	public void snuggle() {}
}
