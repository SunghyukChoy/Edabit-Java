package my.sunghyuk.edabit.easy;

public class Person {
  private String name;
  private int age;
  private double budget;

  public Person(String name, int age, double budget) {
    this.name = name;
    this.age = age;
    this.budget = budget;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getBudget() {
    return budget;
  }
}