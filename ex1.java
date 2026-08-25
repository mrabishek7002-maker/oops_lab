import java.until.scanner;
{
  public static void main(string[]args)
  { 
    consumer ob = new consumer();
    ob.getdata();
    ob.calc();
    on.display();
  }
}
class consumer
{
    scanner in=new scanner(system.in);
    scanner ins= new scanner(system.in);    
    int cno;
    string cname,type_of_conn;
    double pre_reading,curr_,unit_consumer,tbill;
    void getdata()
    {
        system.out.print("\n\t enter consumer number =");
        cno = in.nextint();
        system.out.print("\n\t enter consumer name =");
        cnmae =ins.nextline();
        system.out.print("\n\t enter the type of connection=");
        type_of_conn = ins.nextline();
        system.out.print("\n\t enter pre_month reading =");
        pre_reading = in.nextdouble();
        system.out.print("\n\t enter the pre_month reading = ");
        curr_reading=in.nextdouble();
     }
     void calc()
     {
          unit_consumer = curr_reading-pre_reading;
          if(type_of_conn.contains("domestic"))
          {
               if(unit consumed<=100)
                   tbill=1* unit_consumed;
               else if(unit_consumed>100&&unit_consumed<=200)                
                   tbill=2.50*unit_consumed;
               else if(unit_consumed>200 && unit_consumed<=500)
                   tbill=4*unit_consumed;
               else
                   tbill=6*unit_conusmed;
               }
               else if(type_of_conn.contains("commercial"))
               {
                    if(unit_consumed<=100)
                        tbill=2*unit_consumed;
               else if(unit_consumed>100&&unit_consumed<=200_)
                        tbill=4.50*unit_consumed;
               else if(unit_consumed>200&& unit_consumed<=500)
                       tbill=6* unit_consumed;
               else
                       tbill=7*_consumed;
            }
        }
        void display()
        {
           system.out.println("\n\t consumer name="+cname);
           system.out.println("\n\t total units ="+units_consumed);
           system.out.println("\n\t toatal bill =rs"+tbill);
        }
     }
