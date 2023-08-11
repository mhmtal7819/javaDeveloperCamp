public class calculator {
    public void hesap(int a,int b){
        String islem="+";
        switch(islem){
            case "+":
                System.out.println("islemin sonucu: "+(a+b));
                break;
            case"-":
                System.out.println("islemin sonucu: "+(a-b));
                break;
            case"*":
                System.out.println("islemin sonucu: "+(a*b));
                break;
        }

    }
}
