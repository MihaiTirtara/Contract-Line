package model;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class company
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int Id;
  String name;
  @Column (name = "capital")
  capital cap;
  String cEO;
  address adres;
  
  ArrayList<AccountList> list;

  
  
   
  company(int Id, String name, String cEO, userReg participants, address adres)
  {
     
     this.Id = Id;
     this.name = name;
     this.cEO = cEO;
     this.participants = participants;
     this.adres = adres;
     
    
     
  }
  
  public void addCompany(company comp)
  {
     list.add(comp);
  }
  
  public int getId()
  {
     this.Id = Id;
  }

public String getName()
{
   return name;
}

public void setName(String name)
{
   this.name = name;
}

public capital getCap()
{
   return cap;
}

public void setCap(capital cap)
{
   this.cap = cap;
}

public userReg getParticipants()
{
   return participants;
}

public void setParticipants(userReg participants)
{
   this.participants = participants;
}

public String getcEO()
{
   return cEO;
}

public void setcEO(String cEO)
{
   this.cEO = cEO;
}

public address getAdres()
{
   return adres;
}

public void setAdres(address adres)
{
   this.adres = adres;
}

public ArrayList<company> getList()
{
   return list;
}

public void setList(ArrayList<company> list)
{
   this.list = list;
}

public boolean equals(Object obj)
{
   if (!(obj instanceof company))
   {
      return false;
   }

   company other = (company) obj;
   return name.equals(other.name) && adres.equals(other.adres);
         
         

}
  
  
  
  
   
   
}
