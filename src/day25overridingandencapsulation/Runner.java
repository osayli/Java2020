package day25overridingandencapsulation;

public class Runner {
    public static void main(String[] args) {
        CreditCard ccn1=new CreditCard();
        System.out.println(ccn1.getCcn());//12345678901234
        //12345678901234 ==>***********1234 how to change the value of encapsulated data
        String ccn=ccn1.getCcn();
        ccn1.setCcn("************"+ccn.substring(ccn.length()-4));
        System.out.println(ccn1.getCcn());//************1234

        //I want to tell to user "Not visible"
        ccn1.setCcn("Not visible");
        System.out.println(ccn1.getCcn());//Not visible

    }
}
