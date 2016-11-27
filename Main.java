import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

ArrayList<Integer> arrList = new ArrayList<Integer>();

System.out.print("Enter the length of Array: \n");
int arrLength = input.nextInt();

System.out.println("Enter the element of Array: ");
for(int count=0;count<arrLength;count++)
arrList.add(input.nextInt());

Collections.sort(arrList);
System.out.println("After Sorting array: "+arrList);

System.out.println("Enter the searching element: ");
int search = input.nextInt();

int index = Collections.binarySearch(arrList,search);
System.out.println("Searching element "+search+" is found at index "+index);
}
}
