class HelloWorld{
    public static void main(String[] args){
        int myInt=7;
        System.out.println(myInt);
        double shoeSize=9.5;
        char myInitial='C';
        String myName = "Cameron";
        double result = myInt * shoeSize;
        System.out.println(myInt*shoeSize);
        System.out.println(result);
        System.out.println(myInitial);
        System.out.println(myName.length());
        String receivedName = returnName(myName);
        printName(receivedName);

        Cat myCat = new Cat();

        myCat.name = "George";
        myCat.age = 5;

        Cat anotherCat = new Cat();
        anotherCat.name = "Alex";
        anotherCat.age = 10;

        System.out.println(myCat.age);

        myCat.meow();
        Cat.dingDong();
    }

    private static void printName(String name){
        if(name.equals("my name is Cameron")){
            System.out.println("This guy sucks");
        }
    }

    private static String returnName(String name){
        return "my name is " + name;
    }

}
