import java.text.DecimalFormat;
/*
 *Running: Distance = Rate*Time
 *=> T running = Distance/Rate
 *=> T running = x/8
 *
 * Swimming: Distance = Rate * Time
 * => T swimming = Distance/Rate
 * => T swimming = y/3
 * 
 * Total: 
 * T total = T running + T swimming
 * T total = x/8 + y/3
 * 
 * y^2 = 4 + (6 - x)^2
 * => y = sqrt(4+(6-x)^2)
 * 
 * T(x) = x/8 + (sqrt(4+(6-x)^2)/3
 */

public class Function1 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		
		DecimalFormat df = new DecimalFormat("#,###,###.#");
		return "The minimum time is " + df.format(optVal) + " hours to run before swimming." ;
	}

	@Override
	public double fnValue(double x) {
		//return the function as follow as the formula.
		return (x/8) + ((Math.sqrt(4 + (Math.pow((6-x), 2))))/3);
	}

	public String toString() {
		return "Find the minimum time the visitor should run before swimming";
	}
	@Override
	public double getXVal(double x) {
	

		return x;
	}

	@Override
	public double getYVal(double x) {
	
		return 0;
	}

	@Override
	public double getZVal(double x) {
		
		return 0;
	}
	
}