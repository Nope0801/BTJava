package TH1.Bai10;

public class SoGaSoCho {
    public void xuat(){
        int soGa, soCho;
        for(soGa = 0; soGa <= 36; soGa++){
            soCho = 36 - soGa;
            if(soGa*2 + soCho*4 == 100){
                System.out.println("So Ga: " + soGa + " So Cho: " + soCho);
            }
        }
    }
}
