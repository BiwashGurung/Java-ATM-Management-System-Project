/**
 * Author (Biwash Gurung)
 * This is a BankCard class It is a super(parent) class for DebitCard and CreditCard(Child Classes)
 * Defining the BankCard class
 */
public class BankCard
{
    //declaring the variables
    private int cardId ;//int that represents the cardId
    private String clientName;//String value that displays the clientname
    private String issuerBank;//String value that displays the issuerBank
    private String bankAccount;//String value that displays the bankAccount
    private double balanceAmount;//Double that store decimal number of balanceAmount

    //no-args constructor (child class can get access)
    protected BankCard()
    {

    }

    //this is a constructor that accepts four parameters cardId, issuerBank,String bankAccount,balanceAmount to set the attributes value.
    protected BankCard(int cardId, String issuerBank, String bankAccount, double balanceAmount)//constructor
    {
        //refers to the instance variables by assigning the value of constructor's parameters
        this.cardId = cardId;//refers to the instance variable of cardId
        this.issuerBank = issuerBank;//refers to the instance variable of issuerBank
        this.bankAccount = bankAccount;//refers to the instance variable of bankAccount
        this.balanceAmount = balanceAmount;//refers to the instance variable of balanceAmount
        this.clientName="";//refers to the instance variable of clientName
    }

    //using the accessor(getter) method for cardId
    protected int getCardId()
    {
        return cardId;
    }

    //using the accessor(getter) method for issuerBank
    protected String getIssuerBank()
    {
        return issuerBank;
    }

    //using the accessor(getter) method for bankAccount
    protected String getBankAccount()
    {
        return bankAccount;
    }

    //using the accessor(getter) method for balanceAmount
    protected double getBalanceAmount()
    {
        return balanceAmount;
    }

    //using the accessor(getter) method for clientName
    protected String getClientName()
    {
        return clientName;
    }

    //using the mutator(setter) method for clientName
    protected void setClientName(String newClientName)
    {
        this.clientName = newClientName;
    }

    //using the mutator(setter) method for balanceAmount
    protected void setBalanceAmount(double newBalanceAmount)
    {
        this.balanceAmount = newBalanceAmount;
    }

    //This is a method to display the output using if, else condition
    protected void display()
    {
        if(clientName ==  ""){
            System.out.println("The name of the client is not assigned. ");
        }
        else{
            System.out.println("The card Id is " + cardId);
            System.out.println("The issuer bank is " + issuerBank);
            System.out.println("The bank account is " + bankAccount);
            System.out.println("The balanceAmount is " + balanceAmount);
            System.out.println("The clientName is " + clientName);

        }  
    }
}