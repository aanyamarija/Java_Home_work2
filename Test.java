public class Test {


    public static void main(String[]args){

        //Процедура для вывода всех полей класс на консоль:

        Car car = new Car ("Audi", 2021, 59000);
        Car car1 = new Car ("Tesla", 2023, 200000, true);

        System.out.println(car.getBrand());
        System.out.println(car.getAge());
        System.out.println(car.getPrice());


        System.out.println(car1.getBrand());
        System.out.println(car1.getAge());
        System.out.println(car1.getPrice());
        System.out.println(car1.isElectric());

        //--------------------------------------------

        //Присваиваем значение переменным:

        double a = 10;
        double b = 2;
        double add = a +b ;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        //Отоброжаем в консоли арифмитические операции:

        System.out.println("Сумма: " + add);
        System.out.println("Разность: " + sub);
        System.out.println("Умножение: " + mul);
        System.out.println("Деление: " + div);

        //------------------------------------

        //Переменные для логических выражений:

        int c = 10;
        int d = 3;
        int f = 11;

        //Смотрим и проверяем условия в консоли:

        System.out.println(isFirstMoreThanOthers(60,50,40));
        System.out.println(isFirsMoreAtLeastOne(30,29,31));
        System.out.println(isFirsMoreOtherOne(20,10,40));



    }

    //2. Статические методы:

    public static double add (double a, double b){
        return a + b;
    }
    public static double sub (double a ,double b){
        return a - b;
    }
    public static double mul (double a, double b){
        return a * b;
    }
    public static double div ( double a, double b){
        return a / b;
    }

    //------------------------------------------------

    //Логические методы:

    public static boolean isFirstMoreThanOthers(int c, int d, int f){return c > d && c > f;}

    public static boolean isFirsMoreAtLeastOne(int c, int d, int f){return c > d || c > f;}

    public static boolean isFirsMoreOtherOne(int c, int d, int f){return c > d ^ c > f;}




}
