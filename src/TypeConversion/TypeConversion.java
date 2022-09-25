package src.TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        float f=123.2f;
        long l=12122L;
        int a=123;
        long L=a;//неявное
        int x=(int)l;//явное

        //еще один пример

        double d=123.5;
        int b=(int)d;
        System.out.println(d);

        int p=(int)Math.round(d);
        System.out.println(p);

        //что случится если число не помещается

        byte K=(byte)128;
        System.out.println(K);
    }
}
