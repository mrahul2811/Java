class rahul{
    public static void main(String[] args) {
        class2 on = new class2();
         on.display();
         System.out.println(on.a);
        System.out.println(class2.b);
    }
}
class class2{
    int a=170;
    static int b=105;
    void display(){
        System.out.println(b);
    }
}