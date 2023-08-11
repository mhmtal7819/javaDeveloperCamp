public class product {
    public product(){
        System.out.println("const. calisti.");
    }
    public product(String name,String renk,String kod,String description,int id,double price,int stockAmount){
        System.out.println("eslestirmeler yapildi.."); //iki farklı const. ile overloading yapablirsi
    }

    private int id;
    private String name;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
    private String description;

    public void setId(int _id){
        id=_id;
    }
    public void setName(String _name){
        name=_name;
    }
    public void setPrice(int _price){
        price=_price;
    }
    public void setRenk(String _renk){
        renk=_renk;
    }
    public void setKod(String _kod){
        kod=_kod;
    }
    public void setStockAmount(int _stocamount){
        stockAmount=_stocamount;
    }
    public void setDescription(String _description){
        description=_description;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getRenk(){
        return renk;
    }
    public String getKod(){
        return kod;
    }
    public String getDescription(){
        return description;
    }
    public int getStockAmount(){
        return stockAmount;
    }




}
