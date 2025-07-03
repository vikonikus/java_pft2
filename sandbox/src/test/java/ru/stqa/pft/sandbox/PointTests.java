package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void distanceTest1(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(1, 1);
    Assert.assertEquals(p1.distanceTo(p2), 1.4142135623730951);
  }

  @Test
  public void distanceTest2(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(5, 5);
    Assert.assertEquals(p1.distanceTo(p2), 1.4142135623730951);
  }
}
