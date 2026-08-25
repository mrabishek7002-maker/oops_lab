 package currrency;
 import java.until.*;
 import java.text.decimalformat;
 class currencyconvertor
 { 
     double rupee,dollar,euro,yen;
     scanner sc = new scanner(system.in);
     decimalformat f=new decimalformat("##.###")
     public converterlnrtoeuro()
     {
        system.out.println("enter amount in rupees");
        rupee =sc.nextfloat();
        eruo =rupee / 80;
        system.out.println("euro:"+f.format(euro));

     }
     public convertereurotoinr()
     {
        system.out.print("enter amount in euro");
        euro=sc.nextfloat();
        rupee=euro*80;
        system.out.println("rupee:"+f.format(rupee));

     }
     public convertorinrtodollar()
     {
        system.out.println("enter amount in rupees");
        rupee=sc.nextfloat();
        dollar=rupee/66;
        system.out.println("dollar:"+f.format(dollar));

     }
     public converterdollartoinr()
     system.out.println("enter amount in dollar");
     dallor=sc.nextfloat();
     rupee=dollar*66;
     system.out.println("rupee:"+f.format(rupee));
 }
 public converterinrtoyen()
 {
    system.out.println("'enter amount in rupee");
    rupee=sc.nextfloat();
    system.out.println("yen:"+f.format(yen));
 }
 public convertyentoinr()
 {
    system.out.println("enter amount in yen ");
    euro= sc.nextfloat();
    rupee=yen*0.61;
    system.out.print("rupee:"+f.format(reupee));
    }
}
      

    package distane;
    import java. until.*;
    import java.text.decimalformat;
    class  distanceconvertor
    {
        double meter,km,miles;
        scanner sc= new scanner(system.in);
        decimalformatf=new decimalformat("###.###");
        public convertormetertokm()
        {
            system.out.println("enter the meter");
            meter=sc.nextfloat();
            km=meter*0.001;
            system.out.println("kilometer:"+f.format(km));

        }        
        public convertorkmtometer()
        {
            system.out.println("enter the kilometer");
            km=sc.nextfloat();
            meter=km/0.001;
            system.out.println("meter:"+f.format(meter));

        }
        public convertormilestokm()
        {
            system.out.println("enter the miles");
            miles=sc.nextfloat();
            km=miles *1.6093;
            system.out.println("kilometer:"+f.format(km));
        
        }
        public convertorkmtomiles();
        {
            system.out,println('enter the kilometer");
            km=sc.nextfloat();
            miles=km/1.6093;
            system.out.println("miles:"+f.format(miles));
            }
    }           
         




    package time;
    import java.until.*;
    import java.text.decimalformat;
    class timeconvertor
{
     double hour,minute,second;
     scanner sc=new scanner(system.in);
     decimalformat f= new decimalformat("##.###");
     public convertorhourtominute()
    {
       system.out,print.("enter the minute");
       minute = sc.nextfloat();
       minute=hour*60;
       system.out.println("minute:"+f.formate(hour));
    }
    public convertorsecondstohour()
    {
       system.out.println("enter the seconds");
       hour=sc.nextfloat();
       second = hour*3600;
       system.out.println("seconds:"+f.format(seconds));
     }
     public convertorsecondtohour();
     seconds=sc.nextfloat();
     hour=second/3600;
     system.out.println("hour;"+f.format(hour));
    }
}        

        