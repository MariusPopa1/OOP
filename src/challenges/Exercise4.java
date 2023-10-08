package challenges;

class Member{
    int age;
    int disability;
    String name;
    public Member(String name,int age,int disability) {
    this.name = name;
    this.age = age;
    this.disability = disability;
    }
    public void Category(){
        if (age > 55 && disability > 7){
            System.out.println("SENIOR");
        } else {
            System.out.println("OPEN");
        }
    }
public static void main(String[] args){
        Member member = new Member("Don",55,7);
        member.Category();
        Member member1 = new Member("Bob",71,8);
        member1.Category();
}
}
