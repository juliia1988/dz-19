import javax.xml.namespace.QName;

public class Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String dateOfBirth;
    private String gender;
    private String prefferedLanguage;
    private String purchaseHistory;
    private String customerType;
    private String marketingPreference;

    public Customer() {
    }

    public static class Builder{

        private Customer customer;

        public Builder() {
            customer = new Customer();
        }

        public Builder name(String name) {
            customer.name = name;
            return this;
        }

        public Builder email(String email) {
            customer.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            customer.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            customer.address = address;
            return this;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            customer.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(String gender) {
            customer.gender = gender;
            return this;
        }

        public Builder prefferedLanguage(String prefferedLanguage) {
            customer.prefferedLanguage = prefferedLanguage;
            return this;
        }

        public Builder purchaseHistory(String purchaseHistory) {
            customer.purchaseHistory = purchaseHistory;
            return this;
        }

        public Builder customerType(String customerType) {
            customer.customerType = customerType;
            return this;
        }

        public Builder marketingPreference(String marketingPreference) {
            customer.marketingPreference = marketingPreference;
            return this;
        }

        public Customer build(){
            return customer;
        }
    }
}
