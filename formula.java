import javax.swing.JOptionPane;
public class formula{
	public static void main(String args[]){
	
	
		String menuData = "Formula Pro Max\n";
		menuData += "1. Area of Square\n";
		menuData += "2. Area of Rectangle\n";
		menuData += "3. Area of Parllogram\n";
		menuData += "4. Volume of Cube\n";
		menuData += "5. Area of Trapezoid\n";
		menuData += "6. Volume of Cylinder\n";
		menuData += "7. Area of Ellipse\n";
		menuData += "8. Volume of Cone\n";
		menuData += "9. Volume of Sphere\n";
		menuData += "10. Volume of Ellipsoid\n";
		menuData += "11. Area of Cube\n";
		menuData += "12. Area of Sphere\n";
		menuData += "13. Exit\n";
		
		while(true){
			int choice = Integer.parseInt(JOptionPane.showInputDialog(menuData));
				switch(choice){
					case 1 : 
					int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : ")); 
					int square = num1 * num1;
					JOptionPane.showMessageDialog(null,"The area of Square is "+square);
					break;
					case 2 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length : ")); 
					int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter breadth : ")); 
					 square = num1 * num2;
					JOptionPane.showMessageDialog(null,"The Area rectangle is "+square);
					break;
					case 3 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter breadth : ")); 
					square = num1 * num2;
					JOptionPane.showMessageDialog(null,"The Area parellogram is "+square);
					break;
					case 4 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of a side  : ")); 
					
					square = num1 * num1 * num1 ;
					JOptionPane.showMessageDialog(null,"The Volume of cube  is "+square);
					break;
					case 5 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of a : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of Base : ")); 
					int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of height  : ")); 
					
					square = (num1+num2/2)*num3 ;
					JOptionPane.showMessageDialog(null,"The Area of Trapazoid  is "+square);
					break;
					case 6 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of radius  : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of Height : ")); 
					float pie = 3.141f;
					
					float square1 = pie* num1 * num1*num2 ;
					JOptionPane.showMessageDialog(null,"The Volume of Cylinder  is "+square1);
					break;
					
					case 7 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of radius  : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis : ")); 
					pie = 3.141f;
					
					square1 = pie * num1 * num2 ;
					JOptionPane.showMessageDialog(null,"The Area of Ellipse is "+square1);
					break;
					
					case 8 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of radius  : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis : ")); 
					pie = 3.141f;
					
					square1 = pie * num1*num1 * (num2 / 3);
					JOptionPane.showMessageDialog(null,"The Volume of Cone is "+square1);
					break;
					
					case 9 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of radius  : ")); 
					
					pie = 3.141f;
					
					square1 = (4/3*(pie * num1 * num1 * num1));
					JOptionPane.showMessageDialog(null,"The Volume of Sphere is "+square1);
					break;
					
					case 10 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis(a)  : ")); 
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis(b) : ")); 
					num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis(c) : ")); 
					pie = 3.141f;
					
					square1 =( 4/3*(pie * num1 * num2 * num3));
					JOptionPane.showMessageDialog(null,"The Volume of Ellipsoid  is "+square1);
					break;
					
					case 11 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of axis  : ")); 
					
					
					square1 = (6 * num1 * num1);
					JOptionPane.showMessageDialog(null,"The Area of Cube is "+square1);
					break;
					
					case 12 : 
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of radius  : ")); 
					
					pie = 3.141f;
					
					square1 = (4*(pie * num1 * num1 ));
					JOptionPane.showMessageDialog(null,"The Area of sphere is "+square1);
					break;
				}if(choice==13) System.exit(0);
				
		}
		
	}
}
