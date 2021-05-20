import java.util.*;
import java.util.Scanner;

public class Product_input {
int count = 0;
String[] p_name = new String[10];
int[] p_price = new int[10];
String[] p_date = new String[10];
int[] p_stock = new int[10];
	
public void product_input() 
{
	Scanner scan = new Scanner(System.in);
			
	System.out.print("\n상품명을 입력하세요 : ");
	p_name[count] = scan.next();
		
	System.out.print("\n상품가격을 입력하세요 : ");
	p_price[count] = scan.nextInt();
		
	System.out.print("\n유통기한을 입력하세요 : ");
	p_date[count] = scan.next();
		
	System.out.print("\n등록할 재고 수량을 입력하세요 : ");
	p_stock[count] = scan.nextInt();
	    
	count++;

  }
}