package edu.cs.birzeit.pizzarecycler2;

public class Order {
    private String name;
    private String total;
    private String phone;
    private String items;


    public static Order[] orders = {
            new Order("Hadi's Order","0598901085","Choclate \nchips\n cola\n", "90$"),
            new Order("Hadi's Order","0598901085","Choclate \nchips\n cola\n", "90$"),
            new Order("Hadi's Order","0598901085","Choclate \nchips\n cola\n", "90$"),
            new Order("Hadi's Order","0598901085","Choclate \nchips\n cola\n", "90$")
    };

    public Order(String name,String phone, String items, String total){

        this.name = name;
        this.phone = phone;
        this.items = items;
        this.total = total;
    }
    public Order(){

    }
    public String getName(){return name;}
    public String getPhone(){return phone;}
    public String getItems(){return items;}
    public String getTotal(){return total;}

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
