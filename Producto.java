public class Producto {
    String Name;
    boolean Stock;
    int Amount;
    public Producto(String name, int amount){
        Name=name;
        Amount=amount;
        Stock=(amount>0)?true:false;
    }
    public String format(){
        String formated= String.format("""
                Name:%s
                Stock: %s
                Status: %s""" ,Name,(Stock== true)? " en stock":" agotado",Amount);
        return formated;
    }

}
