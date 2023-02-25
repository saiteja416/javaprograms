public class emp {
    int employ;
    public void setEmploy(int employ){
        this.employ=employ;
    }
    public int getEmploy(){
        return employ;

    }
    String ename;
    public void setEname(String ename)
    {
        this.ename=ename;

    }
    public String getEname(){

        return ename;
    }

    public void disp(){
        System.out.println(employ+" "+ename);
    }
}

