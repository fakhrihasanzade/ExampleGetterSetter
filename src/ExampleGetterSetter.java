public class ExampleGetterSetter {
    private String name;
    private String soname;
    private int age;

    //Setter
    public void setName(String name){
        this.name=name;
    }

    public void setSoname(String soname){
        this.soname=soname;
    }

    public void setAge(int age){
        this.age=age;
    }

    //Gettter
    public String getName(){
        return this.name;
    }

    public String getSoname(){
        return this.soname;
    }

    public int getAge() {
        return age;
    }
}
