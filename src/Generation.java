public class Generation {
    public static void main(String[] args) {
        int age = 27;
        if (age < 6) {
            System.out.println("I am Generation Alpha");
        } else if(age >=6 && age <=20) {
            System.out.println("I am Generation Z");
        } else if(age >=21 && age <=35) {
            System.out.println("I am Generation Y");
        } else if(age >=36 && age <=50) {
            System.out.println("I am Generation X");
        } else if(age >=51 && age <=69) {
            System.out.println("I am Baby Boomer");
        } else if(age >=70) {
            System.out.println("I am Builder");
        }
    }
}
