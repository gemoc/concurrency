package fr.obeo.dsl.pivot.datatype;

public class Duration {
	private int value;
	private String unit;

	public Duration(int val, String u) {
		value = val;
		unit = u;
		}
	
	public int getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}

	public Duration(String duration) {
		//duration = duration.replace(" ", "");
		value = 0;
		unit = "undefined";
		if(duration != null){				
			duration = duration.trim();
			String[] values = duration.split(",");
			
			switch (values.length){
				case 2:
					unit = values[1];
				case 1:
					value = Integer.parseInt(values[0]);
				default:
			}
		}
	}
	
	@Override
	public String toString() {
		if(value == -1) return "undefined";
		return value + "," + unit;
	}
}
