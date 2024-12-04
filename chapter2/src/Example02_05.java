public class Example02_05 {
    public static void main(String[] args) 
    {
        byte VarByte;
        short Varshort;
        int VarInt;
        long VarLong;
        float Varfloat;
        double Vardouble;
        char Varchar;

        // Initial value to variable
        VarByte = (byte) 256 ;  //#1
        Varshort = (short) 32800 ; //#2
        VarInt = 200000000;
        VarLong = 500000000000L;
        Varfloat = 120e10F + 234e10F;
        Vardouble = 120e10 + 234e10 ;
        Varchar = 'A'; //7

        System.out.println("Value Byte : " + VarByte);
        System.out.println("Value Short : " + Varshort);
        System.out.println("Value Int : " +VarInt);
        System.out.println("Value long : " + VarLong);
        System.out.println("value float : " + Varfloat);
        System.out.println("Value double : "+ Vardouble);
        System.out.print("Value char : " + Varchar);
        System.out.println(", value ascii : " + (byte) Varchar);
        System.out.print("Value ascil : " + 68);
        System.out.println(", value char : "+(char) 68);
        

    }
}
