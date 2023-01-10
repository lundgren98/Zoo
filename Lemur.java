class Lemur extends Animal {
	private String name = "Lemur";
	private int age = 0;
	private int fluffiness = 4;

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public int getFluffiness() { return this.fluffiness; }

	public String speak() { return "Hakkunah Matatatatatatata"; }
	public void backflip() {}

	@Override
	public void eat() {}
	@Override
	public void sleep() {}
	@Override
	public void snuggle() {}
}
