package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimesTests {

  @Test (enabled = false)
  public static void testsPrimes() {
    Assert.assertTrue(Primes.isPrimes(Integer.MAX_VALUE));
  }

  @Test (enabled = false)
  public static void testsNotPrimes() {
    Assert.assertFalse(Primes.isPrimes(Integer.MAX_VALUE - 2));
  }

  @Test
  public static void testsPrimesFast() {
    int m = (int) Math.sqrt(Integer.MAX_VALUE);
    Assert.assertFalse(Primes.isPrimes(m));
  }
}
