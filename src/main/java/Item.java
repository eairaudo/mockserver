public class Item {

    int id;
    String title;
    String category_id;
    float price;
    String currency_id;
    int quantity;
    String condition;
    String [] pictures;

    public Item(int id) {
        this.id = id;
        title = "Titulo de Item";
        category_id = "MLA" + id;
        price = 100;
        currency_id = "ARS";
        quantity = 10;
        condition = "New";
        pictures = new String[] {"img.png","img2.png"};
    }


}
