package tests.myMethods;

import java.util.Random;

public class GeneratingRandom
{
    public static String Vin()
    {
        Random r1 = new Random();
        int k=2;
        char c = 0;
        StringBuilder sb = new StringBuilder(2);
        for(int i=0;i<k;i++)
        {
            Random r = new Random();
            c = (char) (r.nextInt(26) + 'A');
            sb.append(c);
        }
        String output = sb.toString();
        String id = String.format("%02d", r1.nextInt(100));
        String nn = output.concat(id);
        String ss = null;
        String mm = takeNum(ss);
        String no = nn.concat(mm);
        System.out.println("super -->"+nn.concat(mm));
        return no;
    }

    public static String takeNum(String ss)
    {
        Random r1 = new Random();
        int k=2;
        char c = 0;
        StringBuilder sb = new StringBuilder(2);
        for(int i=0;i<k;i++)
        {
            Random r = new Random();
            c = (char) (r.nextInt(26) + 'A');
            sb.append(c);
        }
        String output = sb.toString();
        String id = String.format("%04d", r1.nextInt(10000));
        ss= output.concat(id);
        return ss;
    }

    public static String tenNumber(String tennumber)
    {
        Random r1 = new Random();
        String id = String.format("%1d", r1.nextInt(1000000000));
        String a="9";
        String ten = a.concat(id);
        return ten;

    }

    public static String fourchar(String forchar)
    {
        Random r1 = new Random();
        int k=4;
        char c = 0;
        StringBuilder sb = new StringBuilder(2);
        for(int i=0;i<k;i++)
        {
            Random r = new Random();
            c = (char) (r.nextInt(26) + 'A');
            sb.append(c);
        }
        String n="nemo";
        forchar = n.concat(sb.toString());
        return forchar;
    }

    public static String gmail(String gmail)
    {
        Random r1 = new Random();
        int k=4;
        char c = 0;
        StringBuilder sb = new StringBuilder(2);
        for(int i=0;i<k;i++)
        {
            Random r = new Random();
            c = (char) (r.nextInt(26) + 'a');
            sb.append(c);
        }
        String n="123@gmail.com";
        gmail = sb.toString().concat(n);
        return gmail;
    }



}
