import java.util.Arrays;
import java.util.ArrayList;
public class MoreMoney {

	public static int arrayToInteger(int[] arrNumb) {
			int num = 0;
			int n = arrNumb.length;
			
			for (int i=n-1; i>=0; i--) {
				num= num+ arrNumb[i]*(int)(Math.pow(10, n-1-i));
			}
			return num;		
	}


		public static void main(String[] args) {

			int[] send= new int[4];
			int[] more= new int[4];
			int[] money= new int[5];

			send[0]=1;
			send[1]=3;
			send[2]=4;
			send[3]=5;
			System.out.println(Arrays.toString(send));
			System.out.println(arrayToInteger(send));

			int nSend;
			int nMore;
			int nMoney;

			for (int s=0; s<10; s++) {
				for (int e=0; e<10; e++) {
					for (int n=0; n<10; n++) {
						for (int d=0; d<10; d++) {
							for (int m=0; m<10; m++) {
								for (int o=0; o<10; o++) {
									for (int r=0; r<10; r++) {
										for (int y=0; y<10; y++) {

											send[0]= s;
											send[1]= e;
											send[2]= n;
											send[3]= d;
											
											more[0]= m;
											more[1]= o;
											more[2]= r;
											more[3]= e;

											money[0]= m;
											money[1]= o;
											money[2]= n;
											money[3]= e;
											money[4]= y;

											if (s!=e && s!=n && s!=d && s!=m && s!=o && s!=r && s!=y && 
														e!=n && e!=d && e!=m && e!=o && e!=r && e!=y &&
																n!=d && n!=m && n!=o && n!=r && n!=y &&
																		d!=m && d!=o && d!=r && d!=y &&
																				m!=o && m!=r && m!=y &&
																						o!=r && o!=y &&
																								r!=y) {
													
												nSend= arrayToInteger(send);
												nMore= arrayToInteger(more);
												nMoney= arrayToInteger(money);

												if ((nSend+nMore)==nMoney)
													System.out.println(nSend+" + "+nMore+" = "+nMoney);

											}		
										}
									}
								}
							}
						}
					}
				}
			}
		}
}
