package testing;

public class PersonalCustomer extends Customer{
    Account account;
    public PersonalCustomer(Long id, String name, Account account) {
        super(id, name);
        this.account = account;
    }
}
