package fr.obeo.dsl.pivot.datatype;

public class Interval {
	private int lowerBound;
	private int upperBound;
	private String unit;

	public Interval(String value) {
		value = value.replace("[", "");
		value = value.replace("]", "");
		value = value.trim();
		String[] values = value.split(",");
		lowerBound = 0;
		upperBound = 0;
		unit = "undefined";
		switch (values.length){
			case 3:
				unit = values[2];
			case 2:
				upperBound = Integer.parseInt(values[1]);
			case 1:
				lowerBound = Integer.parseInt(values[0]);
			default:
		}
	}

	public Interval(int lowerBound, int upperBound, String unit) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "[" + lowerBound + "," + upperBound + "," + unit + "] ";
	}
}
