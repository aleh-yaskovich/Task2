package by.htp.task2.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1.  ��������� ��������� ��������� ���� ����� 1 � 2.
		//     ���� 1 ������ 2 � ������� �� ����� ����� 7, � ��������� ������ � ����� 8
		double number1 = 2.5;
		double number2 = 983;
		if (number1 < number2) {
			System.out.println("������ 1. �����: 7");
		} else {
			System.out.println("������ 1. �����: 8");
		}
				
		// 2.  ��������� ��������� ��������� ���� ����� 1 � 2.
		//     ���� 1 ������ 2 � ������� �� ����� ����� �yes�, � ��������� ������ � ����� �no� 
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		if (number1 < number2) {
			System.out.println("������ 2. �����: Yes");
		} else {
			System.out.println("������ 2. �����: No");
		}
				
		// 3. ��������� ��������� ��������� ���������� ����� � � ����� 3.
		// ������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�
		// !!! ���������� ���������� number1 �� ������  �1 !!! 
		if (number1 < 3) {
			System.out.println("������ 3. �����: Yes");
		} else {
			System.out.println("������ 3. �����: No");
		}
				
		// 4.  ��������� ���������:  ����� �� ��� ����� � � b?
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		if (number1 == number2) {
			System.out.println("������ 4. ����� \""+number1+"\" � \""+number2+"\" �����");
		} else {
			System.out.println("������ 4. ����� \""+number1+"\" � \""+number2+"\" �� �����");
		}
				
		// 5.  ��������� ���������: ����������� ����������� �� ���� ����� � � b
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		if (number1 > number2) {
			System.out.println("������ 5. ����� \""+number2+"\" �������");
		} else if (number1 < number2) {
			System.out.println("������ 5. ����� \""+number1+"\" �������");
		} else {
			System.out.println("������ 5. ����� \""+number1+"\" � \""+number2+"\" �����");
		}
				
		// 6.  ��������� ���������: ����������� ����������� �� ���� ����� � � b
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		if (number1 > number2) {
			System.out.println("������ 6. ����� \""+number1+"\" �������");
		} else if (number1 < number2) {
			System.out.println("������ 6. ����� \""+number2+"\" �������");
		} else {
			System.out.println("������ 6. ����� \""+number1+"\" � \""+number2+"\" �����");
		}
				
		// 7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		double number3 = -36;
		double x = 1;
		System.out.println("������ 7. �����: " + Math.abs(number1*x*x + number2*x + number3));
				
		// 8.  ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b
		// !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
		if ( Math.pow(number1, 2) > Math.pow(number2, 2) ) {
			System.out.println("������ 8. ������� ����� number1 (\""+Math.pow(number2, 2)+"\") �������");
		} else if (number1 < number2) {
			System.out.println("������ 8. ������� ����� number2 (\""+Math.pow(number1, 2)+"\") �������");
		} else {
			System.out.println("������ 8. �������� ����� number1 (\""+Math.pow(number1, 2)
			+"\") � number2 (\""+Math.pow(number2, 2)+"\") �����");
		}
				
		// 9. ��������� ���������, ������� ��������� �� ���� ��������� ��������,
		// �������� �� ������ ����������� ��������������
		double triangleSde1 = 4;
		double triangleSde2 = 5;
		double triangleSde3 = 6;
		if (triangleSde1 == triangleSde2 && triangleSde1 == triangleSde3) {
			System.out.println("������ 9. ����������� �������� ��������������");
		} else {
			System.out.println("������ 9. ����������� �� �������� ��������������");
		}
				
		// 10. ��������� ���������, ������� ��������� ������� ������ ����� ������
		double circArea1 = 10.5;
		double circArea2 = 8.3;
		if (circArea1 > circArea2) {
			System.out.println("������ 10. ������� ������� ����� �������");
		} else if (circArea1 < circArea2) {
			System.out.println("������ 10. ������� ������� ����� ������");
		} else {
			System.out.println("������ 10. ����� �����");
		}
		
		// 11. ��������� ���������, ������� ��������� ������� ������ ������������ ������
		double triangleArea1 = 7.5;
		double triangleArea2 = 7.5;
		if (triangleArea1 > triangleArea2) {
			System.out.println("������ 11. ������� ������� ������������ ������");
		} else if (triangleArea1 < triangleArea2) {
			System.out.println("������ 11. ������� ������� ������������ ������");
		} else {
			System.out.println("������ 11. ������� ������������� �����");
		}
		
		// 12. ���� ��� �������������� �����. �������� � ������� �� �� ���,
		//     �������� ������� ��������������, � � ��������� ������� � �������������
		// !!! ���������� ���������� number1, number2 �� ������  �1 � number3 �� ������ �7 !!!
		System.out.println("������ 12. ������:");
		double[] numbers = {number1, number2, number3};
		for (int i = 0; i < numbers.length; i++) {
			double number = numbers[i];
			if (number >= 0) {
				System.out.println("--> " + Math.pow(number, 2));
			} else {
				System.out.println("--> " + Math.pow(number, 4));
			}
		}
		
		// 13.  ���� ��� ����� �(�1, �1) � �(�2, �2). 
		//      ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������
		double x1 = 5.6, y1 = 4.8, x2 = -7.2, y2 = -1.3;
		double distanceA = Math.sqrt(x1*x1 + y1*y1);
		double distanceB = Math.sqrt(x2*x2 + y2*y2);
		if (distanceA < distanceB) {
			System.out.println("������ 13. ����� � ("+x1+", "+y1+") ��������� ����� � ������ ���������");
		} else {
			System.out.println("������ 13. ����� B ("+x2+", "+y2+") ��������� ����� � ������ ���������");
		}
		
		// 14. ���� ��� ���� ������������ (� ��������).
		//     ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������
		double degreeAlpha = 46;
		double degreeBeta = 90;
		double degreeGamma = 180 - ( degreeAlpha + degreeBeta );
		if (degreeGamma > 0) {
			System.out.println("������ 14. ����������� � ������ "+degreeAlpha+" � "+degreeBeta+" ����������.");
			if (degreeAlpha == 90 || degreeBeta == 90 || degreeGamma == 90) {
				System.out.println("---> ����������� �������� �������������.");
			} else {
				System.out.println("---> ����������� �� �������� �������������.");
			}
		} else {
			System.out.println("������ 14. ����������� � ������ "+degreeAlpha+" � "+degreeBeta+" �� ����������.");
		}
		
		// 15. ���� �������������� ����� � � �, �� ������ ���� �����.
		//     ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������. 
		double numb1 = 245;
		double numb2 = 100;
		double temp1 = (numb1 + numb2)/2;
		double temp2 = numb1 * numb2 * 2;
		if (numb1 > numb2) {
			numb2 = temp1;
			numb1 = temp2;
		} else {
			numb1 = temp1;
			numb2 = temp2;
		}
		System.out.println("������ 15. �����: " +numb1+ ", " + numb2);

		// 16.  �� ��������� ��Y ������ ������ ������������ ����� �. 
		//      �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����)
		Scanner in = new Scanner(System.in);
        System.out.print("������� �������� \"X\": ");
        double osX = in.nextDouble();
        System.out.print("������� �������� \"Y\": ");
        double osY = in.nextDouble();
        if ( osX > 0 && osY > 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� � ������ ������� ������������ ����");
        } else if ( osX > 0 && osY < 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� � ������ ������ ������������ ����");
        } else if ( osX < 0 && osY < 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� � ����� ������ ������������ ����");
        } else if ( osX < 0 && osY > 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� � ����� ������� ������������ ����");
        } else if ( osX == 0 && osY != 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� �� ��� Y");
        } else if ( osX != 0 && osY == 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� �� ��� �");
        } else if ( osX == 0 && osY == 0 ) {
        	System.out.println("������ 16. �����: ����� � ��������� � ������ ���������");
        } else {
        	System.out.println("������ 16. �����: �� �� �����, ��� ��������� ����� � :(");
        }
		
        // 17.  ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������,
        //      ������ �������� �� ��������, � ���� �����, �� �������� ����� ������.
        int n = 25, m = 50;
        if (n == m) {
        	n = 0;
        	m = 0;
        } else {
        	if (n > m) {
        		m = n;
        	} else {
        		n = m;
        	}
        }
        System.out.println("������ 17. �����: n = "+ n +", m = "+ m );
        
        // 18.  ���������� ���������� ������������� ����� ����� �, b, �
        double a = 56, b = -43, c = 10;
        double[] abc = {a, b, c};
        int count = 0;
        for(int i = 0; i < abc.length; i++) {
        	if (abc[i] < 0) {
        		count++;
        	}
        }
        System.out.println("������ 18. ������������� �����: "+ count );
        
        // 19.  ���������� ���������� ������������� ����� ����� �, b, �.
        // !!! ���������� ���������� a, b, c � ������ abc[] �� ������  �18 !!!
        count = 0;
        for(int i = 0; i < abc.length; i++) {
        	if (abc[i] > 0) {
        		count++;
        	}
        }
        System.out.println("������ 19. ������������� �����: "+ count );
        
        // 20.  ����������, ��������� ����� ����� �, b, � �������� ����� k
        // !!! ���������� ���������� a, b, c � ������ abc[] �� ������  �18 !!!
        double k = 4;
        String str = "";
        for(int i = 0; i < abc.length; i++) {
        	if (abc[i] % k == 0) {
        		str = str + abc[i] + ", ";
        	}
        }
        if (str.length() > 1) {
        	str = str.substring(0, str.length()-2);
        } else {
        	str = "����� ���";
        }
        System.out.println("������ 20. \""+k+"\" �������� ��������� �����: "+ str );
        
        // 21. ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻. 
        //     � ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� 
        //     ��� ���� �������� ��������!�
        Scanner sc = new Scanner(System.in);
        System.out.print("��� ��: ������� ��� �������? ����� � ��� �: ");
        String letter = sc.nextLine();
        if (letter.equals("�")) {
        	System.out.println("������ 21. ��� �������� �������!");
        } else if (letter.equals("�")) {
        	System.out.println("������ 21. ��� �������� ��������!");
        } else {
        	System.out.println("������ 21. �� ����� �� \"�\" � �� \"�\"");
        }
        
        // 22. ���������������� �������� ���������� � � � ���, 
        //     ����� � � ��������� ������� �� ���� ��������, � � y - �������.
        // !!! ���������� ���������� number1 � number2 �� ������  �1 !!!
        double temp;
        System.out.print("������ 22. ���� x = "+number1+", y = "+number2+". ");
        if (number1 < number2) {
        	temp = number1;
        	number1 = number2;
        	number2 = temp;
        }
        System.out.print("����� x = "+number1+", y = "+number2+".\n");
        
        // 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). 
        //     ���� ������� ������������ ������, �� �������� �� ����. 
        Scanner scan3 = new Scanner(System.in);
        System.out.print("������ 23. ������� ���� (�� 1 �� 31): ");
        while(!scan3.hasNextInt()) {
        	scan3.next();
        	System.out.print("������ 23. ������� ���� (�� 1 �� 31): ");
        }
        int den = scan3.nextInt();
        while (den < 1 || den > 31) {
        	System.out.print("������ 23. ������� ���� (�� 1 �� 31): ");
            while(!scan3.hasNextInt()) {
            	scan3.next();
            	System.out.print("������ 23. ������� ���� (�� 1 �� 31): ");
            }
            den = scan3.nextInt();
        }
        System.out.print("������ 23. ������� ����� (�� 1 �� 12): ");
        while(!scan3.hasNextInt()) {
        	scan3.next();
        	System.out.print("������ 23. ������� ���� (�� 1 �� 12): ");
        }
        int mesyats = scan3.nextInt();
        while (mesyats < 1 || mesyats > 12) {
        	System.out.print("������ 23. ����� (�� 1 �� 12): ");
            while(!scan3.hasNextInt()) {
            	scan3.next();
            	System.out.print("������ 23. ������� ����� (�� 1 �� 12): ");
            }
            mesyats = scan3.nextInt();
        }
        System.out.println("������ 23. �� ����� - ����: "+den+", �����: "+mesyats);
        
        // 24. ��������� ���������, ������������ ��������� ������� �� ������� � �������� �����, 
        //     ���� �� �������� ������ ���������� ��������� n
        // !!! ���������� ���������� n �� ������  �17 !!!
        if ( n % 2 == 0 ) {
        	System.out.println("������ 24. �����: �� �����");
        } else {
        	System.out.println("������ 24. �����: �����");
        }
        
        // 25. �������� ��������� � ������ ������� ��������� ������� � ���������, 
        //     ������� ������� ��������� �������������� �������� �, ���� ����������� � ������� ��������� 60��
        double t = 65;
        if (t > 60) {
        	System.out.println("������ 25. ������������� ��������!");
        }
        
        // 26. �������� ��������� ���������� ����� �������� � �������� �� ���� �����
        // !!! ���������� ���������� a, b, c �� ������  �18 !!!
        double max = 0; double min = 0;
        if (a > b && a > c) max = a;
        if (b > a && b > c) max = b;
        if (c > a && c > b) max = c;
        if (a < b && a < c) min = a;
        if (b < a && b < c) min = b;
        if (c < a && c < b) min = c;
        System.out.println("������ 26. ����� �������� � �������� �� ���� ����� = " + (max + min));
        
        // 27. ����� max{min(a, b), min(c, d)}
        // !!! ���������� ���������� a, b, c �� ������  �18 !!!
        double d = 42;
        double min1 = 0, min2 = 0;
        if (a < b) {
        	min1 = a;
        } else {
        	min1 = b;
        }
        if (c < d) {
        	min2 = c;
        } else {
        	min2 = d;
        }
        if (min1 > min2) {
        	max = min1;
        } else {
        	max = min2;
        }
        System.out.println("������ 27. a="+a+", b="+b+", c="+c+", d="+d+". �����: " + max);
        
        // 28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. 
        //     ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d �c)
        // !!! ���������� ���������� a, b, c �� ������  �18 !!!
        System.out.println("������ 28. ������:");
        d = 11;
        if (d == a) {
        	System.out.println("---> d = a ");
        } else if (d == b) {
        	System.out.println("---> d = b ");
        } else if (d == c) {
        	System.out.println("---> d = c ");
        } else {
        	System.out.println("---> �� ���� ����� �� ����� d.");
        	if ( (d-a) > (d-b) && (d-a) > (d-c) ) {
        		max = d-a;
        	} else if ( (d-b) > (d-a) && (d-b) > (d-c) ) {
        		max = d-b;
        	} else if ( (d-c) > (d-a) && (d-c) > (d-b) ) {
        		max = d-c;
        	}
        	System.out.println("---> max = "+ max);
        }
        
        // 29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������
        x1 = 2; 
        y1 = 4; 
        x2 = 6; 
        y2 = 12;
        double x3 = 12; 
        double y3 = 24;
        double segmentX_AB = Math.abs(x1 - x2);
        double segmentX_BC = Math.abs(x2 - x3);
        double segmentY_AB = Math.abs(y1 - y2);
        double segmentY_BC = Math.abs(y2 - y3);
        if ( (segmentX_AB / segmentX_BC) == (segmentY_AB / segmentY_BC) ) {
        	System.out.println( "������ 29. ����� �("+x1+","+y1+"), �("+x2+","+y2+") � "
        	+"�("+x3+","+y3+") ����� �� ����� ������." );
        } else {
        	System.out.println( "������ 29. ����� �("+x1+","+y1+"), �("+x2+","+y2+") � "
        	+"�("+x3+","+y3+") �� ����� �� ����� ������." );
        }
        
        // 30.  ���� �������������� ����� �,b,�.
        //      ������� ��� �����, ���� � > b > �, � �������� �� ����������� ����������, ���� ��� �� ���.
        // !!! ���������� ���������� a, b, c �� ������  �18 !!!
        if (a > b && b > c) {
        	System.out.println("������ 30. �����: a = "+a*2+", b = "+b*2+", c = "+c*2);
        } else {
        	System.out.println("������ 30. �����: a = "+Math.abs(a)+", b = "+Math.abs(b)+", c = "+Math.abs(c));
        }
        
        // 31.  ������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
        //      ����������, ������� �� ������ ����� ���������
        double sideA = 6; // ����� ���������
        double sideB = 9; // ������ ���������
        double sideX = 4; // ������ ������� 
        double sideY = 8; // ������ �������
        double sideZ = 12; // ����� �������
        if ( (sideX <= sideA && sideY <= sideB) ||
        	 (sideY <= sideA && sideX <= sideB) ||
        	 (sideX <= sideA && sideZ <= sideB) || 
        	 (sideZ <= sideA && sideX <= sideB) ||
        	 (sideY <= sideA && sideZ <= sideB) ||
        	 (sideZ <= sideA && sideY <= sideB) ) {
        	 	System.out.println("������ 31. ������ ������� ����� ���������.");
        	 } else {
        	 	System.out.println("������ 31. ������ �� ������� ����� ���������.");
        	 }
        
        // 32.  �������� ���������, ������� �� �������� ���� ������ ����������, 
        //      �������� �� ����� �����-���� ���� �� ��� �������������
        a = 23; b = -12; c = 4;
        if ( (a+b) > 0 || (a+c) > 0 || (b+c) > 0 ) {
        	System.out.println("������ 32. ����� ���� �� ���� ����� "+a+", "+b+", "+c+" �������� �������������");
        } else {
        	System.out.println("������ 32. ����� ���� �� ���� ����� "+a+", "+b+", "+c+" �� �������� �������������");
        }
        
        // 33.  �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������� 
        //      � ��������� ���������� � ���� ������. ������ � ���� ����� ������ ����� �������, 
        //      �������� �� ��� ������ �� ������� �������. ��� ����� ��������� ������: 
        //      9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � �������� ������ ��� �, �; 
        //      9455, 8997 � �������� ������ ���� �.
        Scanner scan = new Scanner(System.in);
        System.out.print("������� ������ (9583, 1747, 3331, 7922, 9455, 8997): ");
        int num = scan.nextInt();
        if (num == 9583 || num == 1747) {
        	System.out.println("������ 33. �������� ������ ��� �, �, �");
        } else if (num == 3331 || num == 7922) {
        	System.out.println("������ 33. �������� ������ ��� �, �");
        } else if (num == 9455 || num == 8997) {
        	System.out.println("������ 33. �������� ������ ��� �");
        } else {
        	System.out.println("������ 33. �� ����� �������� ������!");
        }
		
		// 34. ��������� ���������, ����������� ������ ���������� ���������� � ������� ��������. 
		//     ��������� ����������� ��������� ����, ����� �����, ��������� �����������; ���� ����� �� ���������, 
		//     �������� �� ������ ��������; ���� ����� ������� ������, ��� ����������, 
		//     �� �������� ��������� ����� � ��������� ����� �����; ���� ����� ������������, 
		//     �� �������� ��������� �� ���� � ��������� ������ ����������� �����
        Scanner scan2 = new Scanner(System.in);
        System.out.print("������� ���� �����: ");
        double price = scan2.nextDouble();
        System.out.print("������� �����, ��������� �����������: ");
        double sum = scan2.nextDouble();
        if (sum == price) {
        	System.out.println("������ 34. �������!");
        } else if (sum > price) {
        	System.out.println("������ 34. �������! �������� ����� - " + (sum - price));
        } else if (sum < price) {
        	System.out.println("������ 34. ����� ������������, �������� " + (price - sum));
        }
		
		// 35. ��������� ����� � ����� � ������������ ���� �� ������ ���
		int [] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String [] monthsName = { "������", "�������", "����", "������", "���", "����", "����",
		"������", "��������", "�������", "������", "�������" };
		int day = 335;
		int i = 0, de = 0;
		while (de < (day - months[i])) {
			de = de + months[i];
			i++;
		}
		System.out.println("������ 35. "+day+" ���� � ���� - ���: "+ (day - de) +" "+monthsName[i]);
		
        // 36. ��������� �������� �������:
		x = 4;
		double function;
		if ( x <= 3 ) {
			function = x*x -3*x + 9;
		} else {
			function = 1 / (Math.pow(x, 3) + 6);
		}
        System.out.println("������ 36. �����: F(x) = " + function);
        
        // 37.  ��������� �������� �������
    	// !!! ���������� ���������� � � function �� ������  �36 !!!
        if ( x >= 3 ) {
			function = -1*x*x + 3*x + 9;
		} else {
			function = 1 / (Math.pow(x, 3) - 6);
		}
        System.out.println("������ 37. �����: F(x) = " + function);
        
        // 38. ��������� �������� �������
        // !!! ���������� ���������� � � function �� ������  �36 !!!
        if ( x >= 0 && x <= 3 ) {
			function = x*x;
		} else {
			function = 4;
		}
        System.out.println("������ 38. �����: F(x) = " + function);
        
        // 39. ��������� �������� �������
        // !!! ���������� ���������� � � function �� ������  �36 !!!
        if ( x >= 8 ) {
			function = -1*x*x + x - 9;
		} else {
			function = 1 / ( Math.pow(x, 4) - 6 );
		}
        System.out.println("������ 39. �����: F(x) = " + function);
        
        // 40. ��������� �������� �������
        // !!! ���������� ���������� � � function �� ������  �36 !!!
        if ( x <= 13 ) {
			function = -1*x*x*x + 9;
		} else {
			function = -1*(3 / (x + 1));
		}
        System.out.println("������ 40. �����: F(x) = " + function);
        
        
        
        

	}

}
