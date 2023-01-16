package se.nackademin;

class Enclosure {
	private double size; // in sq ft
	private boolean dirty;
	private double temperature;
	private boolean open;

	public double getSize() { return this.size; }
	public void setSize(double size) { this.size = size; }

	public boolean getDirty() { return this.dirty; }
	public void setDirty(boolean dirty) { this.dirty = dirty; }

	public double getTemperature() { return this.temperature; }
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public boolean getOpen() { return this.open; }
	public void setOpen(boolean open) { this.open = open; }

	public void clean() {
		this.setDirty(false);
	}

	public void close() {
		this.setOpen(false);
	}

	public void open() {
		this.setOpen(true);
	}
}
