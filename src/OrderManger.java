import kotlin.collections.ArrayDeque;

import java.util.*;


//Define store Object

class Product {

    int Id ;
    String Productname;
    int Price;
    Product(int id,String productname,int price){
        Id = id;
        Productname = productname;
        Price = price;
    }
}

 class Orderplatform {
    public static boolean flag = true;
    public static List<Product> productlist= new LinkedList<Product>();
    public static Iterator<Product> productiter= productlist.iterator();
    Orderplatform(String s){

        ProjectPower projectPower;
        System.out.println("用户："+s+"  请输入 1，展现商品列表，输入 2，商品新增，输入 3，商品编辑 ，输入 4，商品删除,5 exit");
        do {
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        //decrese mang quit
        try {
            int userdicesion = Integer.parseInt(select);





            switch (userdicesion) {
                case 1:
                    projectPower = new ProductsList();
                    projectPower.Partpower();
                    break;
                case 2:
                    projectPower = new ProductsAdd();
                    projectPower.Partpower();
                    break;
                case 3:
                    projectPower = new ProductsEdit();
                    projectPower.Partpower();
                    break;
                case 4:
                    projectPower = new ProductsDell();
                    projectPower.Partpower();
                    break;
                case 5:
                    exit();
                default:
                    break;


            }
        }
        catch (Exception e){
            System.out.println("请输入 1，展现商品列表，输入 2，商品新增，输入 3，商品编辑 ，输入 4，商品删除,5 exit");
        }


        }while (flag);
    }
    void exit(){
        System.out.println("退出平台");
        flag = false;
    }
    interface ProjectPower{
        void Partpower();
    }

    class ProductsList implements ProjectPower{
        public void Partpower() {
            System.out.println("商品列表");

            productiter = productlist.iterator();
            while (productiter.hasNext()){
                Product localproduct = productiter.next();
                System.out.println("商品编号为"+localproduct.Id+",    商品名称为"+localproduct.Productname+"，     商品价格为"+localproduct.Price);
            }
        }
    }

    class ProductsAdd implements ProjectPower{
        public void Partpower() {
            System.out.println("输入商品名称");
            Scanner scanner = new Scanner(System.in);
            String productname = scanner.nextLine();
            System.out.println("输入商品价格");
            int localprice = scanner.nextInt();

            productlist.add(new Product(productlist.size(),productname,localprice));
            System.out.println("录入成功");
        }
    }

    class ProductsEdit implements ProjectPower{
        public void Partpower() {
            System.out.println("请输入商品编号");
            Scanner scanner = new Scanner(System.in);
            int localid= scanner.nextInt();
            System.out.println("当前的商品信息为：  商品编号为"+productlist.get(localid).Id+",    商品名称为"+productlist.get(localid)
                    .Productname+"，     商品价格为"+productlist.get(localid).Price);

            System.out.println("输入商品名称");

            String productname = scanner.next();
            System.out.println("输入商品价格");
            int localprice = scanner.nextInt();


            System.out.println("编辑成功");
            productlist.set(localid,new Product(productlist.size(),productname,localprice));
        }
    }

    class ProductsDell  implements ProjectPower{
        public void Partpower() {
            System.out.println("请输入商品编号");
            Scanner scanner = new Scanner(System.in);
            int localid= scanner.nextInt();
            System.out.println("当前的商品信息为：  商品编号为"+productlist.get(localid).Id+",    商品名称为"+productlist.get(localid)
                    .Productname+"，     商品价格为"+productlist.get(localid).Price);
            System.out.println("是否删除？确认输入y");
            String delcontrol = scanner.next();
            if (delcontrol.equals("y")||delcontrol.equals("Y")){
                productlist.remove(localid);
                System.out.println("删除成功");
            }

        }
    }

}
class BeginLogin{

    BeginLogin(){

        Orderplatform orderplatform;

        System.out.println("请输入用户名");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        orderplatform = new Orderplatform(username);
    }



}

public class OrderManger{

    public static void main(String[] args) {
        BeginLogin beginLogin = new BeginLogin();

    }
}