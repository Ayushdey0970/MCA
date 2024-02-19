class inheritence {
    float salary = 40000;
}

class q1_Programmer extends inheritence {
    int bonus = 10000;

    public static void main(String args[]) {
        q1_Programmer p = new q1_Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}