package BM23AI021;
public class Boxing {
    public static void main(String[] args)
    {
        Integer boxint=Integer.valueOf(10);
        Boolean boxboo=Boolean.valueOf(true);
        Float boxfloat=Float.valueOf(34.5f);
        Character boxchar=Character.valueOf('d');
        Double boxdoub=Double.valueOf(38.3);
        int unboxint=boxint.intValue();
        boolean unboxboo=boxboo.booleanValue();
        float unboxfloat=boxfloat.floatValue();
        char unboxchar=boxchar.charValue();
        double unboxdoub=boxdoub.doubleValue();
        System.out.println("Boxed int:"+boxint);
        System.out.println("UnBoxed int:"+unboxint);
        System.out.println("Boxed char:"+boxchar);
        System.out.println("UnBoxed char:"+unboxchar);
        System.out.println("Boxed double:"+boxdoub);
        System.out.println("UnBoxed double:"+unboxdoub);
        System.out.println("Boxed float:"+boxfloat);
        System.out.println("UnBoxed float:"+unboxfloat);
        System.out.println("Boxed boolean:"+boxboo);
        System.out.println("UnBoxed boolean:"+unboxboo);
    }
}
