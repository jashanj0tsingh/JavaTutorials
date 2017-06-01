import java.util.ArrayList;

/**
 * 
 * @author jashanjotsingh
 * 
 * This class provides the values required to calculate correlation among x and y.
 *
 */

public class Values {


	public double Mean(ArrayList<Double> ar){

		double mean , sum =0;

		for (Double ar1 : ar) {
			sum = sum + ar1;
		}

		mean = sum/ar.size();

		return mean;
	}


	public double deviation_sqaured(ArrayList<Double> ar, double mean){

		double diff=0;

		for (Double ar1 : ar) {
			diff = diff + ((ar1 - mean) * (ar1 - mean));
		}

		return diff;
	}

	public double deviations_product(ArrayList<Double> ar1,ArrayList<Double> ar2, double xmean, double ymean){

		double product=0;

		if(ar1.size()==ar2.size()){

			for(int i=0;i<ar1.size();i++){

				product = product + ((ar1.get(i)-xmean)*(ar2.get(i)-ymean));

			}
		}

		return product;
	}

	public double Correlation(double o1,double o2,double o3){

		double r;

		r = o1/(Math.sqrt(o2*o3));

		return r*r;
	}

}
