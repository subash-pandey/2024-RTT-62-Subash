package PA_303_10_3;

public class AdultUser extends User implements LibraryUser{
    @Override
    public void registerAccount() {
        if (super.getAge()>=12){
            System.out.println("You have successfully registered under an Adult Account.");
        }else {
            System.out.println("Sorry, age must be greater than 12 to register as an Adult.");
        }
    }

    @Override
    public void requestBook() {
        if(super.getBookType().equalsIgnoreCase("Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only Adult Fiction books.");
        }
    }
}
