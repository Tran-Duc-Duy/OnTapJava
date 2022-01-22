package JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        ArrayList<VeMayBay> veMayBayList= new ArrayList<>();
        sc =new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            VeMayBay ve = new VeMayBay(i+1, true);
            veMayBayList.add(ve);
        }
        int choose=0;
        do{
            showMenu();
            System.out.println("Moi chon!");
            choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap so thu tu cua ghe:");
                    int choose1=Integer.parseInt(sc.nextLine());
                    ban(veMayBayList,choose1);
                    inRaVeTrong(veMayBayList);
                    break;
                case 2:
                    inRaVeTrong(veMayBayList);
                    break;
                case 3:
                    System.out.println("Nhap so thu tu ghe muon tra:");
                    int choose2=Integer.parseInt(sc.nextLine());
                    traLaiVe(veMayBayList, choose2);
                    inRaCacVeDaBan(veMayBayList);
                    break;
                case 4:
                    inRaCacVeDaBan(veMayBayList);
                    break;
                case 5:
                    System.out.println("Thoat!");
                default:
                    break;
            }
        }while (choose!=5);
    }
    public static void showMenu(){
        System.out.println("Chuong Trinh Ban Ve May Bay");
        System.out.println("1. Ban Ve");
        System.out.println("2. In ra cac ve trong");
        System.out.println("3. Tra lai ve");
        System.out.println("4. In ra cac ve da ban");
        System.out.println("5. Thoat");
    }

    private static void ban(ArrayList<VeMayBay> veMayBayList,int soGhe) {
        if(veMayBayList.get(soGhe-1).isTrangThai() ==true){
            veMayBayList.get(soGhe-1).Ban();
            System.out.println("Ban Thanh Cong!");
        }else{
            System.out.println("ban roi");
        }
    }

    private static void inRaVeTrong(ArrayList<VeMayBay> veMayBayList) {
        int flag=0;
        for(VeMayBay ve:veMayBayList){
            if(ve.isTrangThai()==true){
                System.out.println(ve);
            }
            flag=1;
        }
        if(flag==0){
            System.out.println("Danh sach ve trong rong!");
        }
    }

    private static void traLaiVe(ArrayList<VeMayBay> veMayBayList,int soGhe) {
        if(veMayBayList.get(soGhe-1).isTrangThai() ==false){
            veMayBayList.get(soGhe-1).TraLai();
        }else{
            System.out.println("Da ban dau ma tra leu leu");
        }
    }

    private static void inRaCacVeDaBan(ArrayList<VeMayBay> veMayBayList) {
        int flag=0;
        for(VeMayBay ve:veMayBayList){
            if(ve.isTrangThai()==false){
                System.out.println(ve);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Danh sach ve da ban rong!");
        }
    }
}
