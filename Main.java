package by.htp.task2.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1.  Составить программу сравнения двух чисел 1 и 2.
		//     Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8
		double number1 = 2.5;
		double number2 = 983;
		if (number1 < number2) {
			System.out.println("Задача 1. Ответ: 7");
		} else {
			System.out.println("Задача 1. Ответ: 8");
		}
				
		// 2.  Составить программу сравнения двух чисел 1 и 2.
		//     Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no» 
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		if (number1 < number2) {
			System.out.println("Задача 2. Ответ: Yes");
		} else {
			System.out.println("Задача 2. Ответ: No");
		}
				
		// 3. Составить программу сравнения введенного числа а и цифры 3.
		// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no»
		// !!! Используем переменную number1 из задачи  №1 !!! 
		if (number1 < 3) {
			System.out.println("Задача 3. Ответ: Yes");
		} else {
			System.out.println("Задача 3. Ответ: No");
		}
				
		// 4.  Составить программу:  равны ли два числа а и b?
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		if (number1 == number2) {
			System.out.println("Задача 4. Числа \""+number1+"\" и \""+number2+"\" равны");
		} else {
			System.out.println("Задача 4. Числа \""+number1+"\" и \""+number2+"\" не равны");
		}
				
		// 5.  Составить программу: определения наименьшего из двух чисел а и b
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		if (number1 > number2) {
			System.out.println("Задача 5. Число \""+number2+"\" меньшее");
		} else if (number1 < number2) {
			System.out.println("Задача 5. Число \""+number1+"\" меньшее");
		} else {
			System.out.println("Задача 5. Числа \""+number1+"\" и \""+number2+"\" равны");
		}
				
		// 6.  Составить программу: определения наибольшего из двух чисел а и b
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		if (number1 > number2) {
			System.out.println("Задача 6. Число \""+number1+"\" большее");
		} else if (number1 < number2) {
			System.out.println("Задача 6. Число \""+number2+"\" большее");
		} else {
			System.out.println("Задача 6. Числа \""+number1+"\" и \""+number2+"\" равны");
		}
				
		// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		double number3 = -36;
		double x = 1;
		System.out.println("Задача 7. Ответ: " + Math.abs(number1*x*x + number2*x + number3));
				
		// 8.  Составить программу нахождения наименьшего из квадратов двух чисел а и b
		// !!! Используем переменные number1 и number2 из задачи  №1 !!!
		if ( Math.pow(number1, 2) > Math.pow(number2, 2) ) {
			System.out.println("Задача 8. Квадрат числа number1 (\""+Math.pow(number2, 2)+"\") меньшее");
		} else if (number1 < number2) {
			System.out.println("Задача 8. Квадрат числа number2 (\""+Math.pow(number1, 2)+"\") меньшее");
		} else {
			System.out.println("Задача 8. Квадраты чисел number1 (\""+Math.pow(number1, 2)
			+"\") и number2 (\""+Math.pow(number2, 2)+"\") равны");
		}
				
		// 9. Составить программу, которая определит по трем введенным сторонам,
		// является ли данный треугольник равносторонним
		double triangleSde1 = 4;
		double triangleSde2 = 5;
		double triangleSde3 = 6;
		if (triangleSde1 == triangleSde2 && triangleSde1 == triangleSde3) {
			System.out.println("Задача 9. Треугольник является равносторонним");
		} else {
			System.out.println("Задача 9. Треугольник не является равносторонним");
		}
				
		// 10. Составить программу, которая определит площадь какого круга меньше
		double circArea1 = 10.5;
		double circArea2 = 8.3;
		if (circArea1 > circArea2) {
			System.out.println("Задача 10. Площадь второго круга меньшее");
		} else if (circArea1 < circArea2) {
			System.out.println("Задача 10. Площадь первого круга меньше");
		} else {
			System.out.println("Задача 10. Круги равны");
		}
		
		// 11. Составить программу, которая определит площадь какого треугольника больше
		double triangleArea1 = 7.5;
		double triangleArea2 = 7.5;
		if (triangleArea1 > triangleArea2) {
			System.out.println("Задача 11. Площадь первого треугольника больше");
		} else if (triangleArea1 < triangleArea2) {
			System.out.println("Задача 11. Площадь второго треугольника больше");
		} else {
			System.out.println("Задача 11. Площади треугольников равны");
		}
		
		// 12. Даны три действительных числа. Возвести в квадрат те из них,
		//     значения которых неотрицательны, и в четвертую степень — отрицательные
		// !!! Используем переменные number1, number2 из задачи  №1 и number3 из задачи №7 !!!
		System.out.println("Задача 12. Ответы:");
		double[] numbers = {number1, number2, number3};
		for (int i = 0; i < numbers.length; i++) {
			double number = numbers[i];
			if (number >= 0) {
				System.out.println("--> " + Math.pow(number, 2));
			} else {
				System.out.println("--> " + Math.pow(number, 4));
			}
		}
		
		// 13.  Даны две точки А(х1, у1) и В(х2, у2). 
		//      Составить алгоритм, определяющий, которая из точек находится ближе к началу координат
		double x1 = 5.6, y1 = 4.8, x2 = -7.2, y2 = -1.3;
		double distanceA = Math.sqrt(x1*x1 + y1*y1);
		double distanceB = Math.sqrt(x2*x2 + y2*y2);
		if (distanceA < distanceB) {
			System.out.println("Задача 13. Точка А ("+x1+", "+y1+") находится ближе к началу координат");
		} else {
			System.out.println("Задача 13. Точка B ("+x2+", "+y2+") находится ближе к началу координат");
		}
		
		// 14. Даны два угла треугольника (в градусах).
		//     Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
		double degreeAlpha = 46;
		double degreeBeta = 90;
		double degreeGamma = 180 - ( degreeAlpha + degreeBeta );
		if (degreeGamma > 0) {
			System.out.println("Задача 14. Треугольник с углами "+degreeAlpha+" и "+degreeBeta+" существует.");
			if (degreeAlpha == 90 || degreeBeta == 90 || degreeGamma == 90) {
				System.out.println("---> Треугольник является прямоугольным.");
			} else {
				System.out.println("---> Треугольник не является прямоугольным.");
			}
		} else {
			System.out.println("Задача 14. Треугольник с углами "+degreeAlpha+" и "+degreeBeta+" не существует.");
		}
		
		// 15. Даны действительные числа х и у, не равные друг другу.
		//     Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением. 
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
		System.out.println("Задача 15. Ответ: " +numb1+ ", " + numb2);

		// 16.  На плоскости ХОY задана своими координатами точка А. 
		//      Указать, где она расположена (на какой оси или в каком координатном угле)
		Scanner in = new Scanner(System.in);
        System.out.print("Введите значение \"X\": ");
        double osX = in.nextDouble();
        System.out.print("Введите значение \"Y\": ");
        double osY = in.nextDouble();
        if ( osX > 0 && osY > 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится в правом верхнем координатном угле");
        } else if ( osX > 0 && osY < 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится в правом нижнем координатном угле");
        } else if ( osX < 0 && osY < 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится в левом нижнем координатном угле");
        } else if ( osX < 0 && osY > 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится в левом верхнем координатном угле");
        } else if ( osX == 0 && osY != 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится на оси Y");
        } else if ( osX != 0 && osY == 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится на оси Х");
        } else if ( osX == 0 && osY == 0 ) {
        	System.out.println("Задача 16. Ответ: точка А находится в начале координат");
        } else {
        	System.out.println("Задача 16. Ответ: мы не знаем, где находится точка А :(");
        }
		
        // 17.  Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом,
        //      равным большему из исходных, а если равны, то заменить числа нулями.
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
        System.out.println("Задача 17. Ответ: n = "+ n +", m = "+ m );
        
        // 18.  Подсчитать количество отрицательных среди чисел а, b, с
        double a = 56, b = -43, c = 10;
        double[] abc = {a, b, c};
        int count = 0;
        for(int i = 0; i < abc.length; i++) {
        	if (abc[i] < 0) {
        		count++;
        	}
        }
        System.out.println("Задача 18. Отрицательных чисел: "+ count );
        
        // 19.  Подсчитать количество положительных среди чисел а, b, с.
        // !!! Используем переменные a, b, c и массив abc[] из задачи  №18 !!!
        count = 0;
        for(int i = 0; i < abc.length; i++) {
        	if (abc[i] > 0) {
        		count++;
        	}
        }
        System.out.println("Задача 19. Положительных чисел: "+ count );
        
        // 20.  Определить, делителем каких чисел а, b, с является число k
        // !!! Используем переменные a, b, c и массив abc[] из задачи  №18 !!!
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
        	str = "чисел нет";
        }
        System.out.println("Задача 20. \""+k+"\" является делителем чисел: "+ str );
        
        // 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
        //     В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» 
        //     или «Мне нравятся мальчики!»
        Scanner sc = new Scanner(System.in);
        System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
        String letter = sc.nextLine();
        if (letter.equals("Д")) {
        	System.out.println("Задача 21. Мне нравятся девочки!");
        } else if (letter.equals("М")) {
        	System.out.println("Задача 21. Мне нравятся мальчики!");
        } else {
        	System.out.println("Задача 21. Вы ввели не \"Д\" и не \"М\"");
        }
        
        // 22. Перераспределить значения переменных х и у так, 
        //     чтобы в х оказалось большее из этих значений, а в y - меньшее.
        // !!! Используем переменные number1 и number2 из задачи  №1 !!!
        double temp;
        System.out.print("Задача 22. Было x = "+number1+", y = "+number2+". ");
        if (number1 < number2) {
        	temp = number1;
        	number1 = number2;
        	number2 = temp;
        }
        System.out.print("Стало x = "+number1+", y = "+number2+".\n");
        
        // 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
        //     Если введены некорректные данные, то сообщить об этом. 
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Задача 23. Введите день (от 1 до 31): ");
        while(!scan3.hasNextInt()) {
        	scan3.next();
        	System.out.print("Задача 23. Введите день (от 1 до 31): ");
        }
        int den = scan3.nextInt();
        while (den < 1 || den > 31) {
        	System.out.print("Задача 23. Введите день (от 1 до 31): ");
            while(!scan3.hasNextInt()) {
            	scan3.next();
            	System.out.print("Задача 23. Введите день (от 1 до 31): ");
            }
            den = scan3.nextInt();
        }
        System.out.print("Задача 23. Введите месяц (от 1 до 12): ");
        while(!scan3.hasNextInt()) {
        	scan3.next();
        	System.out.print("Задача 23. Введите день (от 1 до 12): ");
        }
        int mesyats = scan3.nextInt();
        while (mesyats < 1 || mesyats > 12) {
        	System.out.print("Задача 23. месяц (от 1 до 12): ");
            while(!scan3.hasNextInt()) {
            	scan3.next();
            	System.out.print("Задача 23. Введите месяц (от 1 до 12): ");
            }
            mesyats = scan3.nextInt();
        }
        System.out.println("Задача 23. Вы ввели - День: "+den+", Месяц: "+mesyats);
        
        // 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
        //     взяв за исходное данное количество лепестков n
        // !!! Используем переменную n из задачи  №17 !!!
        if ( n % 2 == 0 ) {
        	System.out.println("Задача 24. Ответ: не любит");
        } else {
        	System.out.println("Задача 24. Ответ: любит");
        }
        
        // 25. Написать программу — модель анализа пожарного датчика в помещении, 
        //     которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60°С
        double t = 65;
        if (t > 60) {
        	System.out.println("Задача 25. Пожароопасная ситуация!");
        }
        
        // 26. Написать программу нахождения суммы большего и меньшего из трех чисел
        // !!! Используем переменные a, b, c из задачи  №18 !!!
        double max = 0; double min = 0;
        if (a > b && a > c) max = a;
        if (b > a && b > c) max = b;
        if (c > a && c > b) max = c;
        if (a < b && a < c) min = a;
        if (b < a && b < c) min = b;
        if (c < a && c < b) min = c;
        System.out.println("Задача 26. Сумма большего и меньшего из трех чисел = " + (max + min));
        
        // 27. Найти max{min(a, b), min(c, d)}
        // !!! Используем переменные a, b, c из задачи  №18 !!!
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
        System.out.println("Задача 27. a="+a+", b="+b+", c="+c+", d="+d+". Ответ: " + max);
        
        // 28. Даны три числа a, b, с. Определить, какое из них равно d. 
        //     Если ни одно не равно d, то найти max(d — a, d — b, d —c)
        // !!! Используем переменные a, b, c из задачи  №18 !!!
        System.out.println("Задача 28. Ответы:");
        d = 11;
        if (d == a) {
        	System.out.println("---> d = a ");
        } else if (d == b) {
        	System.out.println("---> d = b ");
        } else if (d == c) {
        	System.out.println("---> d = c ");
        } else {
        	System.out.println("---> Ни одно число не равно d.");
        	if ( (d-a) > (d-b) && (d-a) > (d-c) ) {
        		max = d-a;
        	} else if ( (d-b) > (d-a) && (d-b) > (d-c) ) {
        		max = d-b;
        	} else if ( (d-c) > (d-a) && (d-c) > (d-b) ) {
        		max = d-c;
        	}
        	System.out.println("---> max = "+ max);
        }
        
        // 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
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
        	System.out.println( "Задача 29. Точки А("+x1+","+y1+"), В("+x2+","+y2+") и "
        	+"С("+x3+","+y3+") лежат на одной прямой." );
        } else {
        	System.out.println( "Задача 29. Точки А("+x1+","+y1+"), В("+x2+","+y2+") и "
        	+"С("+x3+","+y3+") не лежат на одной прямой." );
        }
        
        // 30.  Даны действительные числа а,b,с.
        //      Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
        // !!! Используем переменные a, b, c из задачи  №18 !!!
        if (a > b && b > c) {
        	System.out.println("Задача 30. Ответ: a = "+a*2+", b = "+b*2+", c = "+c*2);
        } else {
        	System.out.println("Задача 30. Ответ: a = "+Math.abs(a)+", b = "+Math.abs(b)+", c = "+Math.abs(c));
        }
        
        // 31.  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
        //      Определить, пройдет ли кирпич через отверстие
        double sideA = 6; // длина отверстия
        double sideB = 9; // ширина отверстия
        double sideX = 4; // ширина кирпича 
        double sideY = 8; // высота кирпича
        double sideZ = 12; // длина кирпича
        if ( (sideX <= sideA && sideY <= sideB) ||
        	 (sideY <= sideA && sideX <= sideB) ||
        	 (sideX <= sideA && sideZ <= sideB) || 
        	 (sideZ <= sideA && sideX <= sideB) ||
        	 (sideY <= sideA && sideZ <= sideB) ||
        	 (sideZ <= sideA && sideY <= sideB) ) {
        	 	System.out.println("Задача 31. Кирпич пройдет через отверстие.");
        	 } else {
        	 	System.out.println("Задача 31. Кирпич не пройдет через отверстие.");
        	 }
        
        // 32.  Написать программу, которая по заданным трем числам определяет, 
        //      является ли сумма каких-либо двух из них положительной
        a = 23; b = -12; c = 4;
        if ( (a+b) > 0 || (a+c) > 0 || (b+c) > 0 ) {
        	System.out.println("Задача 32. Сумма двух из трех чисел "+a+", "+b+", "+c+" является положительной");
        } else {
        	System.out.println("Задача 32. Сумма двух из трех чисел "+a+", "+b+", "+c+" не является положительной");
        }
        
        // 33.  Написать программу, которая по паролю будет определять уровень доступа сотрудника 
        //      к секретной информации в базе данных. Доступ к базе имеют только шесть человек, 
        //      разбитых на три группы по степени доступа. Они имеют следующие пароли: 
        //      9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 
        //      9455, 8997 — доступен модуль базы С.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите пароль (9583, 1747, 3331, 7922, 9455, 8997): ");
        int num = scan.nextInt();
        if (num == 9583 || num == 1747) {
        	System.out.println("Задача 33. Доступны модули баз А, В, С");
        } else if (num == 3331 || num == 7922) {
        	System.out.println("Задача 33. Доступны модули баз В, С");
        } else if (num == 9455 || num == 8997) {
        	System.out.println("Задача 33. Доступны модули баз С");
        } else {
        	System.out.println("Задача 33. Вы ввели неверный пароль!");
        }
		
		// 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
		//     Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, 
		//     печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
		//     то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
		//     то печатает сообщение об этом и указывает размер недостающей суммы
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите цену книги: ");
        double price = scan2.nextDouble();
        System.out.print("Введите сумму, внесенную покупателем: ");
        double sum = scan2.nextDouble();
        if (sum == price) {
        	System.out.println("Задача 34. Спасибо!");
        } else if (sum > price) {
        	System.out.println("Задача 34. Спасибо! Заберите сдачу - " + (sum - price));
        } else if (sum < price) {
        	System.out.println("Задача 34. Сумма недостаточна, добавьте " + (price - sum));
        }
		
		// 35. Вычислить число и месяц в невисокосном году по номеру дня
		int [] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String [] monthsName = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль",
		"август", "сентябрь", "октябрь", "ноябрь", "декабрь" };
		int day = 335;
		int i = 0, de = 0;
		while (de < (day - months[i])) {
			de = de + months[i];
			i++;
		}
		System.out.println("Задача 35. "+day+" день в году - это: "+ (day - de) +" "+monthsName[i]);
		
        // 36. Вычислить значение функции:
		x = 4;
		double function;
		if ( x <= 3 ) {
			function = x*x -3*x + 9;
		} else {
			function = 1 / (Math.pow(x, 3) + 6);
		}
        System.out.println("Задача 36. Ответ: F(x) = " + function);
        
        // 37.  Вычислить значение функции
    	// !!! Используем переменные х и function из задачи  №36 !!!
        if ( x >= 3 ) {
			function = -1*x*x + 3*x + 9;
		} else {
			function = 1 / (Math.pow(x, 3) - 6);
		}
        System.out.println("Задача 37. Ответ: F(x) = " + function);
        
        // 38. Вычислить значение функции
        // !!! Используем переменные х и function из задачи  №36 !!!
        if ( x >= 0 && x <= 3 ) {
			function = x*x;
		} else {
			function = 4;
		}
        System.out.println("Задача 38. Ответ: F(x) = " + function);
        
        // 39. Вычислить значение функции
        // !!! Используем переменные х и function из задачи  №36 !!!
        if ( x >= 8 ) {
			function = -1*x*x + x - 9;
		} else {
			function = 1 / ( Math.pow(x, 4) - 6 );
		}
        System.out.println("Задача 39. Ответ: F(x) = " + function);
        
        // 40. Вычислить значение функции
        // !!! Используем переменные х и function из задачи  №36 !!!
        if ( x <= 13 ) {
			function = -1*x*x*x + 9;
		} else {
			function = -1*(3 / (x + 1));
		}
        System.out.println("Задача 40. Ответ: F(x) = " + function);
        
        
        
        

	}

}
