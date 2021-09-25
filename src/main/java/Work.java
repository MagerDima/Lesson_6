import java.util.Scanner;

public class Work {
    //7 задание
    public static void main(String[] args) {
    }

    /**
     * созданм массив заданного размера, вводим элементы массива
     *
     * @param size размер массива
     * @return новый массив с элементами, заполненый пользователем
     */
    Scanner sc = new Scanner(System.in);

    static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     * метод выводит массив на печать
     *
     * @param array переданный массив
     */
    static void printArray(int... array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}

    // 8 задание
    static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    static int minValue(int[] array) {
        int minValue = array[0];
        if (array[i] < minValue) {
            minValue = array[i];
        }
    }
     return minValue;


    static int avg(int[]array){
        int avg=0;
        int count=0;
        int sum=0;
        for(int i=0;i<array.length;i++){
           sum+=array[i];
           count++;
        }
        avg=sum/count;
        return avg;
    }

    static void sort(int[]array){
        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<i; j++){
               if(array[j]>array[j+1]){
                   int tmp=array[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=tmp;
               }
            }
        }
    }

    static int median(int[]array){
        array.sort();
        int middle=(array.length/2);
        int median=0;
        if(array.length%2==1)
        median=array[middle];
        else
        median=(array[middle-1]+array[middle])/2;
        return median;

        // 9 задание
        int a=0,b=1,c=0;
        int count=sc.nextLine();
    static void int fibo(int count){
        if(count>0){
           c=a+b;
           a=b;
           b=c;
           System.out.println(c);
           fibo(count-1);
        }
    }

// 10 задание
    static void print(String a,int...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(int el:array){
              System.out.println(el);
          }
        }
    }

    static void print(String a,double...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(double el:array){
              System.out.println(el);
          }
        }
    }

    static void print(String a,long...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(long el:array){
              System.out.println(el);
          }
        }
    }

    static void print(String a,short...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(short el:array){
             System.out.println(el);
          }
        }
    }

    static void print(String a,byte...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(byte el:array){
              System.out.println(el);
          }
        }
    }

    static void print(String a,float...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(float el:array){
             System.out.println(el);
          }
        }
    }

    static void print(String a,char...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(char el:array){
             System.out.println(el);
          }
        }
    }

    static void print(String a,boolean...array){
        System.out.prinln(a);
        if(array.lengtg>=0){
          for(boolean el:array){
             System.out.println(el);
          }
        }
    }
}
