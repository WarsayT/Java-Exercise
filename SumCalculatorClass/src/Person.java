public class Person {
    private String firstName;
    private String lastName;
    private int age = 0;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age < 0 || this.age > 100) {
            this.age = 0;
        }
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        if (this.age >12 && this.age <20) return true;
        return false;
    }
    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " +this.lastName;
        }
    }
}
