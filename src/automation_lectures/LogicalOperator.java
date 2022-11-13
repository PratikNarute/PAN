package automation_lectures;

public class LogicalOperator
{
public static void main(String[] args) 
{
boolean ans;
     // and operator [&&]
ans=(10==10)&&(5>3);
System.out.println(ans);

System.out.println("--------------------------------------------------------------------------------");

     // or operator [||]
ans=(100>=50)||(10>20);
System.out.println(ans);
	
System.out.println("--------------------------------------------------------------------------------");

     //not operator [!]
int d=(25%10);
ans=!(d==5);
System.out.println(ans);

System.out.println("--------------------------------------------------------------------------------");


int a=10,b=5;
boolean c;
if (a<b)  
{
System.out.println("a is less than b"); //if statement is correct then this run
}
else 
{
System.out.println("a is greater than b");	//if statement is not correct then this block used to run
}

System.out.println("--------------------------------------------------------------------------------");



                     // ladder fail 

     //[ degree of workability]

double slum;
slum=140;

if ((slum==0.70)||(slum<=0.80))
{
System.out.println("degree of workability= Very low");
}

  else if((slum>=25)&&(slum<=75))
  {
  System.out.println("degree of workability= Low");
  }

    else if((slum>75)&&(slum<=100))
    {
    System.out.println("degree of workability= Medium");
    }

      else if((slum>=100)&&(slum<=150))
      {
      System.out.println("degree of workability= High");
      }
  
        else if((slum>150)&&(slum<=200))
        {
        System.out.println("degree of workability= Very High");
        }
  
System.out.println("--------------------------------------------------------------------------------");
     



         // [rock quality specification]
int RQD= 51;

if (RQD<=25)
{
System.out.println("Rock quality specification= Very Poor");
}
  else if (RQD<=50)
  {
  System.out.println("Rock quality specification= Poor");
  }

    else if (RQD<=75)
    {
    System.out.println("Rock quality specification= fair");
    }

      else if (RQD<=90)
      {
      System.out.println("Rock quality specification= Good");
      }

        else if (RQD<=100)
        {
        System.out.println("Rock quality specification= Excellent");
        }

    System.out.println("--------------------------------------------------------------------------------");
    
   
    
       //  [Grade classification]
   
 int result=80;
 
if (result>90)
{
System.out.println("grade classification= Outstanding");
}

   if ((result>80)&&(result<=90))
  {
  System.out.println("grade classification= A+");
  }

     if ((result>70)&&(result<=80))
    {
    System.out.println("grade classification= A");
    }

       if ((result>60)&&(result<=70))
      {
      System.out.println("grade classification= B+");
      }

         if ((result>50)&&(result<=60))
        {
        System.out.println("grade classification= B");
        }
  
           if ((result>35)&&(result<=50))
          {
          System.out.println("grade classification= C");
          }
  
             if (result<=35)
            {
            System.out.println("grade classification= Fail");
            }
  
System.out.println("--------------------------------------------------------------------------------");


                   // traveling through Train

int saving;

saving = 50;

     // travel 20km
if (saving==100)
{  
System.out.println("travel 20km through AC class seats");
}
  
  if ((saving>=40)&&(saving<100))
  {
   System.out.println("travel 20km through Sleeper class seats");
  }
    
     else if ((saving>=20)&&(saving<=40))
     {
     System.out.println("travel 20km through General class seats");
     }

  
  
    // travel 40 km
if (saving==200)
{
System.out.println("travel 40km through AC class seats");
}
  if ((saving>=150)&&(saving<200))  
  {
  System.out.println("travel 40km through Sleeper class seats");
  }
  
    else if ((saving<150)&&(saving>100))
    {
    System.out.println("travel 40km through General class seats");
    }  
	 
System.out.println("--------------------------------------------------------------------------------");
	  
	  
	  
  
}
}
