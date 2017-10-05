/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.*; 
import week1.WEEK1.*;

/**
 *
 * @author buitr
 */
public class WEEK2 {
    public static int InputN() {
        int n = (int)WEEK1.Input();
        return n;
    }
    
    public static int[] Input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; ++i) {
            System.out.print("Arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        return arr;
    }
    
    public static void Print(int[] arr, int n) {
        for(int i = 0; i < n; ++i) {
            System.out.print("[" + arr[i] + "] ");
        }  
        System.out.println();
        for(int i = 0; i < n; ++i) {
            System.out.println("Arr[" + i + "] = " + arr[i] + "\t");
        } 
    }
    
    public static void RevPrt(int[] arr, int n) {
        for(int i = n - 1; i >= 0; --i) {
            System.out.print("[" + arr[i] + "] ");
        }  
        System.out.println();
        for(int i = n - 1; i >= 0; --i) {
            System.out.println("Arr[" + (n - i) + "] = " + arr[i] + "\t");
        } 
    }
    
    public static void Exercise1(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.print("Exercise 1: ");
        RevPrt(arr, n);
    }
    
    public static void Exercise2(int[] arr, int n) {
        int tmp = 0;
        System.out.print("Exercise 2: ");
        for(int i = 0; i < n; ++i) {
            if(WEEK1.IsPrimeNumber(arr[i]) && arr[i] != 1) {
                tmp++;
                System.out.print(arr[i] + " ");
            }
        }
        if(tmp == 0) System.out.println("No prime number in list !");
            else if (tmp == 1) {
                System.out.println(" is the only prime number in list !");
            } else {
                System.out.println(" are the prime numbers in list !");
            }
    }
    
    public static void Exercise3(int[] arr, int n) {
        int max = arr[0];
        for(int i = 0; i < n; ++i) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.print("Exercise 3: ");
        System.out.println("Max value in the Array is " + max + ".");
        System.out.print("The index of min element: ");
        for(int i = 0; i < n; ++i) {
            if(max == arr[i]) System.out.print("arr[" + i +"] ");
        }
        System.out.println("");
    }
    
    public static void Exercise4(int[] arr, int n) {
        int min = arr[0];
        for(int i = 0; i < n; ++i) {
            if(arr[i] < min) min = arr[i];
        }
        System.out.print("Exercise 4: ");
        System.out.println("Min value in the Array is " + min + ".");
        System.out.print("The index of min element: ");
        for(int i = 0; i < n; ++i) {
            if(min == arr[i]) System.out.print("arr[" + i +"] ");
        }
        System.out.println("");
    }
    
    public static void Exercise5(int[] arr, int n) {
        int tmp = 0, tmp1 = 0;
        for(int i = 0; i < n; ++i) {
            if(WEEK1.IsPrimeNumber(arr[i])) {
                tmp += 1;
                tmp1 += 1;
            }
            if(arr[i] == 1) tmp -= 1;
        }
        System.out.print("Exercise 5: ");
        if(tmp == 0) System.out.println("No prime number in array!");
        else if(tmp == 1) System.out.println("This array has only one prime number!");
        else System.out.println("This array has " + tmp + " prime numbers!");
        if(tmp1 == n) System.out.println("No composite number in array!");
        else if(tmp1 == n - 1) System.out.println("This array has only one composite number!");
        else System.out.println("This array has " + tmp1 + " composite numbers!");
        
    }
    
    public static void Exercise6(int[] arr, int n) {
        int[] chk;
        chk = new int[n];
        System.out.print("Exercise 6: ");
        System.out.print("True divisor in this array: ");
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(arr[i] > arr[j] && arr[j] > 1 && arr[i]%arr[j] == 0)
                    chk[j] = 1;
            }
        }
        for(int i = 0; i < n; ++i) {
            if(chk[i] == 1) System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void Exercise7(int[] arr, int n) {
        int num = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n; ++i) {
            if(num == arr[i]) num += 1;
        }
        System.out.print("Exercise 7: ");
        System.out.println("The minimal number which isn't equal to any numbers in array is " + num);
    }
    
    public static void Exercise8(int[] arr, int n) {
        int  tmp = 0;
        System.out.print("Exercise 8: ");
        System.out.println("The array list when remove 0 elements is:");
        for(int i = 0; i < n; ++i) {
            if(arr[i] ==0 ) {
                tmp += 1;
            } else {
                System.out.println("arr[" + (i - tmp) + "] = " + arr[i]);
            }
        }
     }
    
    public static void Exercise9(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Exercise 9: ");
        System.out.print("Im port value of c: c = ");
        int c = sc.nextInt(), tmp1 = 0, tmp2 = 0;
        for(int i = 0; i < n; ++i) {
            if(arr[i] == c) tmp1++;
            else if (arr[i] > c) tmp2++;
        }
        System.out.println("Equal to " + c + ": " + tmp1);
        System.out.println("Greater than " + c + ": " + tmp2);
        System.out.println("Smaller than " + c + ": " + (n - tmp1 - tmp2));
    }
    
    public static void Exercise10(int[] arr, int n) {
        int end = 0, max = 1, tmp = 1;
        for(int i = 0; i < n - 1; ++i) {
            if(arr[i] == arr[i+1]) {
                tmp ++;
                if(tmp > max) {
                    max = tmp;
                    end = i + 1;
                }
            } else 
                tmp = 1;
        }
        System.out.print("Exercise 10: ");
        for(int i = end - max + 1; i < end + 1; ++i) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println("~> Max length: " + max + " from arr[" + (end - max +1) + "] to arr[" + max + "] !");
    }
    
    public static void Exercise11(int[] arr, int n) {
        int end = 0, max = 1, tmp = 1;
        for(int i = 0; i < n - 1; ++i) {
            if(arr[i] < arr[i+1]) {
                tmp ++;
                if(tmp > max) {
                    max = tmp;
                    end = i + 1;
                }
            } else 
                tmp = 1;
        }
        System.out.print("Exercise 11: ");
        for(int i = end - max + 1; i < end + 1; ++i) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println("~> Max length: " + max + " from arr[" + (end - max +1) + "] to arr[" + max + "] !");
    }
    
    public static void Exercise12(int[] arr, int[] arr0, int n, int m) {
	boolean key = false;
	for(int i=0;i<n;i++) { //mang da sap xep
            if(arr0[0] == arr[i] && n - i >= m) {
		int k = i+1;
		key = true;
		for(int j = 1; j < m; j++, k++) {
                    if(arr0[j] != arr[k]) {
			key=false;
			break;//  break ra khoi vong for
                    }
		}
		if(key==true) {
                    break;
                }
            }
	}
        System.out.print("Exercise 12: ");
        if(key) System.out.println("Arr0 is a child of Arr !");
        else System.out.println("Arr0 isn't a child of Arr !");
    }
    
    public static void Select() {
        Scanner sc = new Scanner(System.in);       
        WEEK1.author();
        while(true) {       
            System.out.println("Chose one which you want to execute: ");
            System.out.println("\t1   : Exercise 1 ");
            System.out.println("\t2   : Exercise 2 ");
            System.out.println("\t3   : Exercise 3 ");
            System.out.println("\t4   : Exercise 4 ");
            System.out.println("\t5   : Exercise 5 ");
            System.out.println("\t6   : Exercise 6 ");
            System.out.println("\t7   : Exercise 7 ");
            System.out.println("\t8   : Exercise 8 ");
            System.out.println("\t9   : Exercise 9 ");
            System.out.println("\t10  : Exercise 10 ");
            System.out.println("\t11  : Exercise 11 ");
            System.out.println("\t12  : Exercise 12 ");
            System.out.println("\t0   : Exit");
            System.out.println("\t100 : Execute all");
            System.out.println("\tElse: Execute all and exit");
            System.out.print("Your choice: ");
            int n = sc.nextInt();
            switch(n){
                case 1:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise1(arr, m);
                    WEEK1.author();
                    break;
                }case 2:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise2(arr, m);
                    WEEK1.author();
                    break;
                }
                case 3:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise3(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 4:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise4(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 5:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise5(arr, m);
                    WEEK1.author();
                    break;
                }
                case 6:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise6(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 7:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise7(arr, m);
                    WEEK1.author();
                    break;
                }
                case 8:
                {
                   int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise8(arr, m);
                    WEEK1.author();
                    break;
                }
                
                case 9:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise9(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 10:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise10(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 11:
                {
                    int[] arr;
                    int m;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise11(arr, m);
                    System.out.println();
                    WEEK1.author();
                    break;
                }
                case 12:
                {
                    int[] arr, arr0;
                    int i, j;
                    i = InputN();
                    arr = new int[i];
                    Input(arr, i);
                    j = InputN();
                    System.out.println("");
                    arr0 = new int[j];
                    Input(arr0, j);
                    Exercise12(arr, arr0, i, j);
                    WEEK1.author();
                    break;
                }
                case 0:
                {
                    WEEK1.author();
                    System.exit(0);
                    break;
                }
                case 100:
                {
                    int[] arr, arr0;
                    int m, j;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise1(arr, m);
                    System.out.println();
                    Exercise2(arr, m);
                    System.out.println();
                    Exercise3(arr, m);
                    System.out.println();
                    Exercise4(arr, m);
                    System.out.println();
                    Exercise5(arr, m);
                    System.out.println();
                    Exercise6(arr, m);
                    System.out.println();
                    Exercise7(arr, m);
                    System.out.println();
                    Exercise8(arr, m);
                    System.out.println();
                    Exercise9(arr, m);
                    System.out.println();
                    Exercise10(arr, m);
                    System.out.println();
                    Exercise11(arr, m);
                    System.out.println();
                    j = InputN();
                    arr0 = new int[j];
                    Input(arr0, j);
                    Exercise12(arr, arr0, m, j);
                    WEEK1.author();
                    break;
                }
                default:
                {
                    int[] arr, arr0;
                    int m, j;
                    m = InputN();
                    arr = new int[m];
                    Input(arr, m);
                    Exercise1(arr, m);
                    System.out.println();
                    Exercise2(arr, m);
                    System.out.println();
                    Exercise3(arr, m);
                    System.out.println();
                    Exercise4(arr, m);
                    System.out.println();
                    Exercise5(arr, m);
                    System.out.println();
                    Exercise6(arr, m);
                    System.out.println();
                    Exercise7(arr, m);
                    System.out.println();
                    Exercise8(arr, m);
                    System.out.println();
                    Exercise9(arr, m);
                    System.out.println();
                    Exercise10(arr, m);
                    System.out.println();
                    Exercise11(arr, m);
                    System.out.println();
                    j = InputN();
                    arr0 = new int[j];
                    Input(arr0, j);
                    Exercise12(arr, arr0, m, j);
                    WEEK1.author();
                    System.exit(0);
                    break;
                }
            }
                WEEK1.Pause();
                WEEK1.clrscr();
                    
        }
    }    
    public static void main(String[] args) {
        Select();
    }
}
