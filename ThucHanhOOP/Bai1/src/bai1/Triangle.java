package bai1;

class Triangle extends Shape {

    private double canh1, canh2, canh3;

    public Triangle() {
    }

    public Triangle(double canh1, double canh2, double canh3, String Mau, String FillMau) {
        super(Mau, FillMau);
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    @Override
    public void KiemTra() {
        double a = canh1,b = canh2, c = canh3;
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong"); 
            } else if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("Day la tam giac tu");
            } else {
                System.out.println("Day la tam giac nhon");
            }
        } else {
            System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
        }
    }
    @Override
    public double TinhChuVi(){
        double a = canh1,b = canh2, c = canh3;
        return a+b+c;
    }
    @Override
    public double TinhDienTich(){
        double a = canh1,b = canh2, c = canh3;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
