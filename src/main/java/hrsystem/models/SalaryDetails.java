package hrsystem.models;

public class SalaryDetails {
    private int amount;
    private String socialSecurityType;
    private int iban;

    public SalaryDetails(int amount, String socialSecurityType, int iban) {
        this.amount = amount;
        this.socialSecurityType = socialSecurityType;
        this.iban = iban;
    }

    public int getId() {
        return amount;
    }

    public void setId(int amount) {
        this.amount = amount;
    }

    public String getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(String socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }
}
