public class W extends X implements I4{
    public static void main(String args[]){
        W test = new W();
        boolean flag = true;
        flag = flag ^ (test instanceof I1);
        flag = flag ^ (test instanceof I2);
        flag = flag ^ (test instanceof I3);
        flag = flag ^ (test instanceof I4);
        flag = flag ^ (test instanceof X);
        flag = flag ^ (test instanceof W);
        if (flag) System.out.println("W are is intance of I1, I2 and I3 via X and W is instance is instace from I4");
    }
}
