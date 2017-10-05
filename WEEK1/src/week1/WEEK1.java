/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;
import java.io.IOException;
//import java.util.Timer;
//import java.util.TimerTask;
public class WEEK1 {
    
    public static long Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Import N value (n >= 1)\nN = "); //>=1 cho w2, >=2 cho w1
        long n = sc.nextInt();
        while(n < 1) { //n<2 for week1, n<1 for week 2
            System.out.print("Invalid value of N!!!\nN = ");
            n = sc.nextInt();
        }
        return n;
    }
    
    public static void Select() {
        Scanner sc = new Scanner(System.in);       
        author();
        while(true) {       
            System.out.println("Chose one which you want to execute: ");
            System.out.println("\t1   : Exercise 1 part A");
            System.out.println("\t2   : Exercise 2 part A");
            System.out.println("\t3   : Exercise 3 part A");
            System.out.println("\t4   : Exercise 4 part A");
            System.out.println("\t5   : Exercise 5 part A");
            System.out.println("\t6   : Exercise 6 part A");
            System.out.println("\t7   : Exercise 7 part A");
            System.out.println("\t8   : Exercise 8 part A");
            System.out.println("\t9   : Exercise 9 part A");
            System.out.println("\t10  : Exercise 10 part A");
            System.out.println("\t11  : Exercise 1 part B");
            System.out.println("\t12  : Exercise 2 part B");
            System.out.println("\t13  : Exercise 3 part B");
            System.out.println("\t14  : Exercise 4 part B");
            System.out.println("\t0   : Exit");
            System.out.println("\t100 : Execute all");
            System.out.println("\tElse: Execute all and exit");
            System.out.print("Your choice: ");
            int n = sc.nextInt();
            switch(n){
                case 1:
                {
                    Exercise1();
                    System.out.println();
                    author();
                    break;
                }case 2:
                {
                    Exercise2();
                    System.out.println();
                    author();
                    break;
                }
                case 3:
                {
                    Exercise3();
                    System.out.println();
                    author();
                    break;
                }
                case 4:
                {
                    Exercise4();
                    System.out.println();
                    author();
                    break;
                }
                case 5:
                {
                    Exercise5();
                    System.out.println();
                    author();
                    break;
                }
                case 6:
                {
                    Exercise6();
                    System.out.println();
                    author();
                    break;
                }
                case 7:
                {
                    Exercise7();
                    System.out.println();
                    author();
                    break;
                }
                case 8:
                {
                    long m;
                    m = Input();
                    Exercise8(m);
                    System.out.println();
                    author();
                    break;
                }
                
                case 9:
                {
                    long m;
                    m = Input();
                    Exercise9(m);
                    System.out.println();
                    author();
                    break;
                }
                case 10:
                {
                    long m;
                    m = Input();
                    Exercise10(m);
                    System.out.println();
                    author();
                    break;
                }
                case 11:
                {
                    long m;
                    m = Input();
                    Exercise11(m);
                    System.out.println();
                    author();
                    break;
                }
                case 12:
                {
                    long m;
                    m = Input();
                    Exercise12(m);
                    System.out.println();
                    author();
                    break;
                }
                case 13:
                {
                    long m;
                    m = Input();
                    Exercise13(m);
                    System.out.println();
                    author();
                    break;
                }
                case 14:
                {
                    long m;
                    m = Input();
                    Exercise14(m);
                    System.out.println();
                    author();
                    break;
                }
                case 0:
                {
                    author();
                    System.exit(0);
                    break;
                }
                case 100:
                {
                    long m;
                    m = Input();
                    System.out.println("___________PART A___________");
                    Exercise1();
                    System.out.println();
                    Exercise2();
                    System.out.println();
                    Exercise3();
                    System.out.println();
                    Exercise4();
                    System.out.println();
                    Exercise5();
                    System.out.println();
                    Exercise6();
                    System.out.println();
                    Exercise7();
                    System.out.println();
                    Exercise8(m);
                    System.out.println();
                    Exercise9(m);
                    System.out.println();
                    Exercise10(m);
                    System.out.println();
                    System.out.println("___________PART B___________");
                    Exercise11(m);
                    System.out.println();
                    Exercise12(m);
                    System.out.println();
                    Exercise13(m);
                    System.out.println();
                    Exercise14(m);
                    System.out.println();
                    author();
                    break;
                }
                default:
                {
                    long m;
                    m = Input();
                    System.out.println("___________PART A___________");
                    Exercise1();
                    System.out.println();
                    Exercise2();
                    System.out.println();
                    Exercise3();
                    System.out.println();
                    Exercise4();
                    System.out.println();
                    Exercise5();
                    System.out.println();
                    Exercise6();
                    System.out.println();
                    Exercise7();
                    System.out.println();
                    Exercise8(m);
                    System.out.println();
                    Exercise9(m);
                    System.out.println();
                    Exercise10(m);
                    System.out.println();
                    System.out.println("___________PART B___________");
                    Exercise11(m);
                    System.out.println();
                    Exercise12(m);
                    System.out.println();
                    Exercise13(m);
                    System.out.println();
                    Exercise14(m);
                    System.out.println();
                    author();
                    System.exit(0);
                    break;
                }
            }
            Pause();    
            clrscr();
                    
        }
    }
    public static void author() {
        System.out.println();
        System.out.println("___________AUTHOR INFO___________");
        System.out.println("FOR PROJECT 1 WEEK 1 + 2 EXERCISES ONLY !!!"); //nhom 10: nam anh, hieu, hoan , thao
        System.out.println("Class ID: 666335");
        System.out.println("Author: Trung Hieu Bui\nStudent ID: 20151295");
        System.out.println();
    }
    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    
    public static void Pause() 
	{
		try
		{
			System.out.println("Press ENTER to continue...");
			System.in.read();
		}
		catch(IOException exe)
		{
			System.out.println("Error?");
		}
	}
    
    public static long Check (long n) {
        for(long i = 2; i <= (long)Math.sqrt(n); ++i)
            if(n % i == 0) return 0;
        return 1;
    }
    
    public static Boolean IsPrimeNumber(long n) {
	boolean flag = true;
	if (n == 2 | n == 3) {
            flag = true;
	} 
        else {
            for (long i = 2; i <= Math.sqrt(n); i++) {
		if (n % i == 0) {
                    flag = false;
		}
            }
        }
	return flag;

    }
        
    public static long Fibonacy(long n) {
	if (n == 1 || n == 2) {
            return n;
        } 
        else {
            return Fibonacy(n - 1) + Fibonacy(n - 2);
	}
    }

    public static float FactorialSum(long n) {
	long s = 0;
	for (long i = 1; i <= n; i++) {
            s += Factorial(i);
	}
	return s;
    }

    public static float Factorial(long n) {
	long s = 1;
	for (long i = 1; i <= n; i++) {
            s *= i;
	}
	return s;
    }

    public static long ContinuousSum(long n) {
	long s = 1;
	for (long i = 2; i <= n; ++i) {
            s += i;
        }
	return s;
    }
    
    public static void Exercise1() {
	System.out.println("Exercise 1: Composite numbers which are less than 100: ");
	long line = 0;
	for (long i = 4; i < 100; i++) {
            for (long j = i - 1; j > 1; j--) {
		if (i % j == 0) {
                    line++;
                    if (line % 20 == 0) { //ngat dong
			System.out.println();
                    }
                    System.out.print(" " + i + ";");
                    break;
		}
            }
	}
    }
    
    public static void Exercise2() {
	System.out.println("Exercise 2: 20 first prime number:");
	long count = 0;
	long i = 1;
	boolean flag;
	while (true) {
            i++;
            if (i == 2 || i == 3) {
		flag = true;
            } 
            else {
		flag = true;
		for (long j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                    flag = false;
                    break;
                    }
		}
            }
            if (flag) {
                count++;
		System.out.print(" " + i + ";");
            }
            if (count == 20) {
		break;
            }
	}
    }

    public static void Exercise3() {
	System.out.println("Exercise 3: Prime numbers from 1000 to 2000:");
	boolean flag;
	long line = 0;
	for (long i = 1000; i < 2000; i++) {
            flag = true;
            for (long j = 2; j <= Math.sqrt(i); j++) {
		if (i % j == 0) {
                    flag = false;
                    break;
		}
            }
            if (flag) {
		line++;
		if (line % 20 == 0) {
                    System.out.println();
                }
		System.out.print(" " + i + ";");
            }
	}
    }
    
    public static void Exercise4() {
	System.out.println("Exercise 4: Numbers which are less than 100 and exactly divide to both 3 and 7:");
	long line = 0;
	for (long i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
		line++;
		if (line % 10 == 0) {
                    System.out.println();
		}
		System.out.print(" " + i + ";");
            }
	}
    }

    public static void Exercise5() {
        System.out.println("Exercise 5: Numbers which are between 1000 and 2000 and exactly devide to either 3, 5 and 7:");
        long line = 0;
	for (long i = 1000; i < 2000; i++) {
            if (i % 105 == 0) {
		line++;
		if (line % 20 == 0) {
                    System.out.println();
		}
		System.out.print(" " + i + ";");
            }
	}
    }

    public static void Exercise6() {
	System.out.println("Exercise 6: 5 first perfect numbers (Can't open to sixth or more due to the limitation of MAX_INTERGER) !!!");
        long i = 1;
	long count = 0;
	double s = 0;
	while (true) {
            i++;
            if (IsPrimeNumber(i)) {
		s = Math.pow(2, i) - 1;
		if (IsPrimeNumber((long) s)) {
                    s = Math.pow(2, i - 1) * s;
                    System.out.print(" " + (long) s + ";");
                    count++;
                    if(count > 4) {
			break;
                    }
		}
            }
	}
    }

    public static void Exercise7() {
	System.out.println("Exercise 7: Count the number in all suitation when divide them to 5:");
	long a = 0;
	long b = 0;
	long c = 0;
	long d = 0;
        long e = 0;
	for (long i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
		a++;
            }
            if (i % 5 == 1) {
		b++;
            }
            if (i % 5 == 2) {
		c++;
            }
            if (i % 5 == 3) {
		d++;
            }
            if (i % 5 == 4) {
		e++;
            }
	}
	System.out.println("Divide exactly to 5:" + a + ";");
	System.out.println("Divide to 5 odd 1:" + b + ";");
	System.out.println("Divide to 5 odd 2:" + c + ";");
	System.out.println("Divide to 5 odd 3:" + d + ";");
        System.out.print("Divide to 5 odd 4:" + e + ";");
    }

    public static void Exercise8(long n) {
	boolean flag;
	if (n == 1) {   //unnecessary
            System.out.print("Exercise 8: 1 has no divisal prime number!"); 
	} 
        else if (n % 2 == 0) {
            System.out.print("Exercise 8: Minium divisal prime number of " + n + " is 2!");
	} 
        else if (n % 3 == 0) {
            System.out.print("Exercise 8: Minium divisal prime number of " + n + " is 3!");
	} 
        else {
            for (long i = 2; i <= n; i++) {
		flag = true;
		for (long j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
			flag = false;
			break;
                    }
		}
		if (flag) {
                    if (n % i == 0) {
			System.out.print("Exercise 8: Minium divisal prime number of  " + n + " is " + i + "!");
			break;
                    }
		}
		if (i == n && !flag) {
                    System.out.print(n + "không có ước là SNT");
		}
            }
	}
    }

    public static void Exercise9(long n) {
        long i = 2, chk = 0;
        System.out.print("Exercise 9: " + n + " = ");
        while(n != 1) {
            if(n % i == 0 && Check(i) == 1) {
                System.out.print(i);
                n = n/i;
                if (n == 1) chk = 1;
                if (chk == 0) System.out.print("*");
            }
            else ++i;
        }
    }
    
    public static void Exercise10(long n) {
        long i = 2, chk = 0, preChk = 0, count = 0;
        System.out.print("Exercise 10: ");
        while(!IsPrimeNumber(n)) {
            if(n % i == 0 && Check(i) == 1 && preChk != i) {
                System.out.print(i + "; ");
                count ++;
                preChk = i;
                n = n/i;
                if (n == 1) chk = 1;
                //if (chk == 0) System.out.print("Exercise 10: "+ i + " has no divisal prime number!");
            }
            else ++i;
        }   
        if(count == 0) System.out.print("Does not exist!!!");
        else System.out.println("is Divisal prime number Of " + n + "!");
    }    
    
    public static void Exercise11(long n) {
        float s = 1.0f;
        for(long i = 2; i <= n; ++i) {
           s += 1/(float)ContinuousSum(i);
        }
        System.out.print("Exercise 1: S = " + s);
    }
    
    public static void Exercise12(long n) {
        float s = 0.0f;
        for(long i = 1; i <= n; ++i) {
            s += 1/(float)Factorial(i);
        }
        System.out.print("Exercise 2: S = " + s);
    }
    
    public static void Exercise13(long n) {
        float s = 1.0f;
        for(long i = 2; i <= n; ++i) {
            s += 1/FactorialSum(i);
        }
        System.out.print("Exercise 3: S = " + s);
    }
    
    public static void Exercise14(long n){
        System.out.print("Exercise 4: F(" + n +") = " + Fibonacy(n));
    }
    
    public static void main(String[] args) {
        Select();
    }
    
}
