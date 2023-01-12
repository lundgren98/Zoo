package se.nackademin;

class Enclosure {
	private double size; // in sq ft
	private boolean dirty;
	private double temperature;

	public double getSize() { return this.size; }
	public boolean getDirty() { return this.dirty; }
	public double getTemperature() { return this.temperature; }

	public void clean() {}
	public void close() {}
	public void open() {}
}
