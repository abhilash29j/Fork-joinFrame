package Streams;

public class Student {
    private String name;
    private boolean local;
    public Student() {

    }

    public Student(String name,boolean local) {
        this.name = name;
        this.local = local;
    }

    public String getName() {
      return this.name;
    }
  public boolean isLocal() {
        return this.local;
  }

}
