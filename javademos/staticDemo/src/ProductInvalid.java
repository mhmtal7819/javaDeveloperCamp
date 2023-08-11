public class ProductInvalid {
    public static boolean Invalid(product _product){
        if(_product.price>0 && _product.name!=""){
            return true;
        }
        else{
            return false;
        }
    }
}
