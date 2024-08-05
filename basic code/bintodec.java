public static void bintodec(int binNum){
    myNum=binNum;
    int pow=0;
    int decNum=0;
    while(binNum>0){
        int lastDigit=binNum%10;
        decNum=decNum+(lastDigit*(int)Math.poe(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.printlm("decimal of "myNum"="+de)
}