import java.util.*;
class employee{
  Scanner s = new Scanner(System.in);
  void get()
  {
	System.out.print("Upper");
  }
}

class programmer extends employee{
  void get()
  {
	System.out.print("Lower");
  }
}

class inheritance{
    public static void main(String args[]){
	employee obj = new programmer();
	obj.get();
  }
}