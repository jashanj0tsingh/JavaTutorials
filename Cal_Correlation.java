import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author jashanjotsingh
 * This class calculates the correlation between coloumn values read from the CSV file.
 * Also makes use of the opencsv library.
 * 1,2
 * 3,4
 * 5,6
 * 7,8
 * .,.
 * .,.
 * .,.
 * X,Y
 */
class Cal_Correlation
{
	static ArrayList<Double> X = new ArrayList<>();
	static ArrayList<Double> Y = new ArrayList<>();

	static Values val = new Values();

	static double xmean, ymean , o1 , o2, o3 , correlation;


	public static void main(String[] args) throws FileNotFoundException, IOException
	{

		CSVReader reader = new CSVReader(new FileReader("Path to the csv file!"));

		String [] nextLine;    

		while (((nextLine = reader.readNext()) != null) ) { 

			X.add(Double.parseDouble(nextLine[0]));
			Y.add(Double.parseDouble(nextLine[1]));

		}

		xmean = val.Mean(X);
		ymean = val.Mean(Y);

		o1 = val.deviations_product(X, Y, xmean, ymean);
		o2 = val.deviation_sqaured(X, xmean);
		o3 = val.deviation_sqaured(Y, ymean);

		correlation = val.Correlation(o1, o2, o3);

		System.out.println("x  "+xmean);
		System.out.println("y  "+ymean);

		System.out.println("Correlation is: "+correlation);
		
		reader.close();

	}

}


