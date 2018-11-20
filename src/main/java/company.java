import java.util.ArrayList;

public class company
{
   
  String name;
  capital cap;
  
  userReg participants;
  String cEO;
  address adres;
  ArrayList<company> list;
  
   
  company(String name, String cEO, userReg participants, address adres)
  {
     this.name = name;
     this.cEO = cEO;
     this.participants = participants;
     this.adres = adres;
     
     list = new ArrayList<company>();
     
  }
  
  public void addCompany(company comp)
  {
     list.add(comp);
  }
  
  
  
  
   
   
}
