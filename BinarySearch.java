package com.bridgelab.utilityFile;
import java.io.*;
import com.bridgelab.utilityFile.UtilityFile;

public class BinarySearch {
	private static void sort(String [] words) {
		int length = words.length;
		for(int i=0; i<length; i++) {
			for(int j=i; j<length; j++) {
				if(words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
	}

	private static int bsearch(String word, String [] words, int low, int high) {
		if(high <= low)
			return -1;

		//if(high - low == 1)
			//return words[low].equals(word) ? low : -1;

		int mid = (low + high)/2;
		if(word.compareTo(words[mid]) < 0) {
			return bsearch(word, words, 0, mid);
		} else if(word.compareTo(words[mid]) > 0) {
			return bsearch(word, words, mid, high);
		}

		return mid;
	}

	public static void main(String [] args) throws IOException {
               UtilityFile ui=new UtilityFile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("how many strings u want to insert:");
                   int n=ui.inputInteger();
		String [] words = new String[n];
                   System.out.println("enter the words:");
		for(int i=0; i<n; i++) {
			System.out.print("words["+i+"]: ");
			words[i] = br.readLine();
		}

		sort(words);
                     System.out.println("the sorted words are:");
		for(int i=0; i<n; i++) {
			System.out.println("words["+i+"] = " + words[i]);
		}

		System.out.print("Enter word to search for: ");
		String word = br.readLine();

		int index = bsearch(word, words, 0, words.length);
		if(index < 0) {
			System.out.println("not found");
		} else {
			System.out.println("found word is : "+words[index]+ " the index position is: "+index);
		}
	}
}
