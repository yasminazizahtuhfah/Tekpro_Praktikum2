package Operators;
/** <H1> Convert Tipe Data </h1>
 * <p><q> Program ini dibuat untuk mengkonversi tipe data </q></p>
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-13
*/
public class ConvertDataType {
	static short methodOne(long l){
		int i = (int) l;
		return (short)i;
	}
	
	public static void main(String[] args){
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}
}

