package edu.pdx.cs410J.xingjian;

import org.junit.Test;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void testC(){
    Kata obj=new Kata();
    char temp='C';
    obj.printDiamond(temp);
  }
  @Test
  public void testE(){
    Kata obj=new Kata();
    char temp='E';
    obj.printDiamond(temp);
  }

}
