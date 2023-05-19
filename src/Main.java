import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer.Builder()
                .name("Yuliia")
                .email("ys@gmail.com")
                .phoneNumber("+38098")
                .address("Kyiv")
                .dateOfBirth("23/12/1988")
                .gender("female")
                .prefferedLanguage("ukrainian")
                .build();
        Customer customer2 = new Customer.Builder()
                .name("Olena")
                .email("ol@gmail.com")
                .phoneNumber("+38067")
                .purchaseHistory("history")
                .customerType("buyer")
                .marketingPreference("star")
                .build();


        Map<String, String> sharedData = SharedData.getSharedData("keyOne","valueOne");
        Map<String, String> sharedDataAnother = SharedData.getSharedData("keyTwo","valueTwo");
        System.out.println(sharedData + " " + sharedDataAnother);
    }
}