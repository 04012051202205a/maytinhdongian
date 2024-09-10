import java.util.Scanner;

public class BT17 {

    public static void main(String[] args) {
//khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
//Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();
//cap phat so phan tu cho mang
        a = new int[n];
//Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
//a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);
        int min = TimMin(a);
        System.out.println("\nPhan tu nho nhat:" + min);
        //b.Tinh trung binh mang
       double tinhTb=tinhTrungBinh(a);
        System.out.println("Ket qua trung binh mang la = "+tinhTb);
    }       
    
       public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
 public static double tinhTrungBinh(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
        
    }

public static int TimMin(int[] a) {
//d.Tim phan tu lon nhat cua mang
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
}
}

