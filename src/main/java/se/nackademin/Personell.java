package se.nackademin;

class Personell {
	private String name;
	private int age;
	private String title;
	private int salary; // per annum
	private int balance;
	
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public String getTitle() { return this.title; }
	public int getSalary() { return this.salary; }
	public int getBalance() { return this.balance; }

	public boolean sell(boolean isValid) {
		if (isValid)
			this.salary += 1;
		return isValid;
	}

	public boolean feedAnimal(Lemur timon) {
		boolean isHungry = timon.hunger > 0; 
		if (isHungry) {
			timon.eat();
		}
		return isHungry;
	}

	public boolean clean(Enclosure enclosure) {
		boolean isDirty = enclosure.getDirty();
		if (isDirty) {
			enclosure.clean();
		}
		return isDirty;
	}

	public void acceptPayment() {
		this.balance += this.salary;
	}

	public boolean washAnimal(Lemur timon) {
		boolean isDirty = timon.getDirty();
		if (isDirty) {
			timon.setDirty(false);
		}
		return isDirty;
	}
}
