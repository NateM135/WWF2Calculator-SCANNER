import java.io.*; //the File class
import java.util.*; //the Scanner class
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** WWF CALCULATOR. Enter you word and this program will calculate its value.
 * @author Nathan Melwani
 * @author NateM135 
 */
public class WWFCalc {

	public static void main(String[] args) {
		while(true) {
		int count = 0;
		String myWord = JOptionPane.showInputDialog("WWF Calculator! Created by NateM135. Word? (Type -1 to quit:)");
			if(myWord.equals("-1")) {
				System.exit(0);
			}
			myWord=myWord.toLowerCase();
			System.out.println(myWord);
			char[]wordArr=myWord.toCharArray();
			for(int i=0; i<wordArr.length; i++) {
				if(wordArr[i] == 'a' || wordArr[i] == 'i' || wordArr[i] == 'e' || wordArr[i] == 'o' || wordArr[i] == 'r'|| wordArr[i] == 's'|| wordArr[i] == 't') {
					count +=1;
				}
				//if(wordArr[i] == '\0') {
				//	count +=0;
				//}
				if(wordArr[i] == 'd' || wordArr[i] == 'l'|| wordArr[i] == 'n'|| wordArr[i] == 'u') {
					count +=2;
				}
				if(wordArr[i] == 'g' || wordArr[i] == 'h'|| wordArr[i] == 'y') {
					count +=3;
				}
				if(wordArr[i] == 'b' || wordArr[i] == 'c' || wordArr[i] == 'f'|| wordArr[i] == 'm'|| wordArr[i] == 'p'|| wordArr[i] == 'w') {
					count +=4;
				}
				if(wordArr[i] == 'k' || wordArr[i] == 'v') {
					count +=5;
				}
				if(wordArr[i] == 'x') {
					count +=8;
				}
				if(wordArr[i] == 'j' || wordArr[i] == 'q'|| wordArr[i] == 'z') {
					count +=10;
				}
			}
			JOptionPane.showMessageDialog(null, count);
			count = 0;
			
		

	}
	}	

}
