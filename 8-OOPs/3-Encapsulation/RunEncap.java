class EncapTest{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setIdNum(String newId){
        idNum = newId;
    }

}


public class RunEncap {
    public static void main(String args[]){

        EncapTest encap = new EncapTest();
        encap.setName("Ananth");
        encap.setAge(21);
        encap.setIdNum("123ms");

        System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());

    }
}
