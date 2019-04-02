import java.util.Arrays;
import java.util.ArrayList;
import javafx.util.Pair; 

public class ClosestPoints {

	public static void clPoints(Pair[] points) {

		int rx1= 0;
		int rx2= 0;
		int ry1= 0;
		int ry2= 0;
		int n= points.length;
		double dist=0;
		Double minDist= Double.MAX_VALUE;

		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {

				int x1= (int) points[i].getKey();
				int y1= (int) points[i].getValue();

				int x2= (int) points[j].getKey();
				int y2= (int) points[j].getValue();

				dist= Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));

				if (minDist>dist) {
					minDist= dist;
					rx1=x1;
					ry1=y1;
					rx2=x2;
					ry2=y2;
				}
			}
		}
		System.out.println(dist);
		System.out.println("("+rx1+", "+ry1+") "+"("+rx2+", "+ry2+") ");

	}

	public static void main(String[] args) {
		
		Pair a0= new Pair(1,2);
		Pair a1= new Pair(3,4);

		Pair[] test={a0,a1};
		clPoints(test);


	}
}