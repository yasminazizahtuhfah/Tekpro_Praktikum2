package DataTypes;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* <h1> 8 Tipe Data Primitif</h1>
* <h3> Java memiliki 8 tipe data primitif</h3> 
* <ol> 
* 	<li> char </li>
* 	<li> boolean </li>
* 	<li> byte </li>
*  	<li> short </li>
*   <li> int </li>
*  	<li> long </li>
*   <li> float </li>
* 	<li> double </li>
*</ol>
* <h4>(byte, short, int, and long)</h4>
* <ul>
* 	<li> A byte is an 8-bit signed integer. </li>
* 	<li> A short is a 16-bit signed integer. </li>
*  	<li> An int is a 32-bit signed integer. </li>
*  	<li> A long is a 64-bit signed integer. </li>
* </ul
* @author YasminA
* @version 1.0
* @since 2022-02-13
*/

public class TipeData {
	/*
	Menginputkan nilai integer, kemudian tentukan tipe data primitif mana yang mampu menyimpan inputan tersebut.
	Input :
	Baris pertama berisi bilangan bulat, T, yang menunjukkan jumlah kasus uji.
	Setiap kasus uji, T, terdiri dari satu baris dengan bilangan bulat, N, yang dapat berukuran besar atau kecil.
	Output :
	Untuk setiap variabel input N dan tipe data primitif yang sesuai, kita tentukan apakah primitif yang diberikan mampu menyimpannya. Jika ya, maka cetak:
	N can be fitted in :
	 * tipe data
	Jika ada lebih dari satu tipe data yang sesuai, cetak masing-masing pada barisnya sendiri dan urutkan berdasarkan ukuran (yaitu: byte<short<int<longbyte<short<int<long).
	Jika nomor tidak dapat disimpan di salah satu dari empat primitif yang disebutkan di atas, cetak baris:
	N cant be fitted anywhere.
	*/
	
	static String FitTheNumber(String numString){
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }
	
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
	    sc.nextLine();
	    String[] bil = new String[T] ;
	        
	    	for(int i=0; i<T;i++){
	            bil[i]=sc.nextLine();
	        }
	        for(int j=0; j<T;j++){
	        System.out.println(FitTheNumber(bil[j]));
	        }
	}
}