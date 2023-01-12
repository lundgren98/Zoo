package se.nackademin;

class Lemur implements Animal {
	private String name = "Lemur";
	private int age = 0;
	private int fluffiness = 4;
	public int hunger = 5;
	public boolean isHungry = false;
	public int energyLevel = 10;
	public boolean isTired = false;

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
	public boolean sleep() {
		if (this.energyLevel < 5) {
			this.isTired = true;
		}
		else {
			this.isTired = false;
		}
		
		return this.isTired;
	}
	
	public String snuggle() {
		if (this.energyLevel < 2) {
			return "Lemur is too tired to snuggle";
		}
		this.energyLevel -= 2;
		this.fluffiness += 2;
		return "Snuggling...";
	
	}
}
