package dip;

public class Pencere implements IAnahtarlanabilir {

    @Override
    public void ac(){
        System.out.println("Pencere aciliyor");
    }

    @Override
    public void kapat(){
        System.out.println("pencere kapandı");
    }
}
