
package entity;

public class Inmate {
    private String Lname;
    private String fname;
    private String dcnum;
    private int height;
    private int weight;
    private int age;
    private String sex;
    private String Offense;

    public Inmate(String Lname, String fname, String dcnum, int height, int weight, int age, String sex, String Offense) {
        this.Lname = Lname;
        this.fname = fname;
        this.dcnum = dcnum;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.Offense = Offense;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getOffense() {
        return Offense;
    }

    public void setOffense(String Offense) {
        this.Offense = Offense;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDcnum() {
        return dcnum;
    }

    public void setDcnum(String dcnum) {
        this.dcnum = dcnum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
            
}
