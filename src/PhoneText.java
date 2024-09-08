import java.util.Scanner;
class Phone
{
    String model;String size;int price;String hardware;int number;
    public Phone(int number)
    {
        this.number=number;
    }
    public void List()
    {
        System.out.println("Model: "+model);
        System.out.println("Size: "+size);
        System.out.println("Price: "+price);
        System.out.println("Hardware: "+hardware);
        System.out.println("Number: "+number);
        System.out.println("Total Price: "+price*number);
    }
}
class XiaoMi extends Phone
{
    public XiaoMi(int number)
    {
        super(number);
        model="XiaoMi 111";
        size="6.5";
        price=2000;
        hardware="Snapdragon 114514";
    }
}
class HuaWei extends Phone
{
    public HuaWei(int number)
    {
        super(number);
        model="Huawei 13 Pro Max 远峰蓝";
        size="88";
        price=3000;
        hardware="QiLin";
    }
}
public class PhoneText
{
    public static void main(String[] args)
    {
        System.out.println("Please input the number of xiaomi and huawei:");
        Scanner Xiaomi=new Scanner(System.in);
        Scanner Huawei=new Scanner(System.in);
        Phone huawei=new HuaWei(Xiaomi.nextInt());
        Phone xiaomi=new XiaoMi(Huawei.nextInt());
        huawei.List();
        System.out.println("-----------------------------");
        xiaomi.List();
    }
}