class W35{
    String name;
    double height,weight;
    W35(String varsha,double w,double h)
    {
        name=varsha;
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height)));
    }

  public static void main (String[] args)
 {
  String varsha= null;
W35 p=new W35(varsha,75,1.56);
  System.out.println("The BMI:"+p.BMI());
  
 }
}

