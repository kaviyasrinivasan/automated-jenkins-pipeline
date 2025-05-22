package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test public void testAdd1() { assertEquals(5, calc.add(2, 3)); }
    @Test public void testAdd2() { assertEquals(0, calc.add(0, 0)); }
    @Test public void testAdd3() { assertEquals(-5, calc.add(-2, -3)); }
    @Test public void testAdd4() { assertEquals(1, calc.add(-2, 3)); }
    @Test public void testAdd5() { assertEquals(-1, calc.add(2, -3)); }
    @Test public void testAdd6() { assertEquals(1000, calc.add(700, 300)); }
    @Test public void testAdd7() { assertEquals(2147483646, calc.add(1073741823, 1073741823)); }
    @Test public void testAdd8() { assertEquals(0, calc.add(-100, 100)); }
    @Test public void testAdd9() { assertEquals(-200, calc.add(-150, -50)); }
    @Test public void testAdd10() { assertEquals(2, calc.add(1, 1)); }

    @Test public void testAdd11() { assertEquals(10, calc.add(5, 5)); }
    @Test public void testAdd12() { assertEquals(-10, calc.add(-5, -5)); }
    @Test public void testAdd13() { assertEquals(1, calc.add(-2, 3)); }
    @Test public void testAdd14() { assertEquals(-1, calc.add(3, -4)); }
    @Test public void testAdd15() { assertEquals(6, calc.add(2, 4)); }
    @Test public void testAdd16() { assertEquals(20, calc.add(10, 10)); }
    @Test public void testAdd17() { assertEquals(0, calc.add(5, -5)); }
    @Test public void testAdd18() { assertEquals(100, calc.add(60, 40)); }
    @Test public void testAdd19() { assertEquals(-100, calc.add(-60, -40)); }
    @Test public void testAdd20() { assertEquals(50, calc.add(75, -25)); }

    // Repeat similar variations up to testAdd100
    @Test public void testAdd21() { assertEquals(1000000, calc.add(500000, 500000)); }
    @Test public void testAdd22() { assertEquals(9999, calc.add(9000, 999)); }
    @Test public void testAdd23() { assertEquals(1, calc.add(-100, 101)); }
    @Test public void testAdd24() { assertEquals(0, calc.add(Integer.MAX_VALUE, Integer.MIN_VALUE + 1)); }
    @Test public void testAdd25() { assertEquals(-1, calc.add(Integer.MIN_VALUE, Integer.MAX_VALUE)); }
    @Test public void testAdd26() { assertEquals(2147483647, calc.add(2147483646, 1)); }
    @Test public void testAdd27() { assertEquals(-2147483648, calc.add(-2147483647, -1)); }
    @Test public void testAdd28() { assertEquals(42, calc.add(21, 21)); }
    @Test public void testAdd29() { assertEquals(-42, calc.add(-21, -21)); }
    @Test public void testAdd30() { assertEquals(100, calc.add(33, 67)); }

    // Skipping ahead for brevity
    @Test public void testAdd31() { assertEquals(8, calc.add(3, 5)); }
    @Test public void testAdd32() { assertEquals(-8, calc.add(-3, -5)); }
    @Test public void testAdd33() { assertEquals(1, calc.add(100, -99)); }
    @Test public void testAdd34() { assertEquals(199, calc.add(99, 100)); }
    @Test public void testAdd35() { assertEquals(0, calc.add(-50, 50)); }
    @Test public void testAdd36() { assertEquals(3, calc.add(0, 3)); }
    @Test public void testAdd37() { assertEquals(-3, calc.add(0, -3)); }
    @Test public void testAdd38() { assertEquals(12, calc.add(6, 6)); }
    @Test public void testAdd39() { assertEquals(6, calc.add(12, -6)); }
    @Test public void testAdd40() { assertEquals(-12, calc.add(-6, -6)); }

    @Test public void testAdd41() { assertEquals(4, calc.add(2, 2)); }
    @Test public void testAdd42() { assertEquals(-4, calc.add(-2, -2)); }
    @Test public void testAdd43() { assertEquals(1001, calc.add(1000, 1)); }
    @Test public void testAdd44() { assertEquals(200, calc.add(100, 100)); }
    @Test public void testAdd45() { assertEquals(101, calc.add(50, 51)); }
    @Test public void testAdd46() { assertEquals(1, calc.add(-1, 2)); }
    @Test public void testAdd47() { assertEquals(-1, calc.add(1, -2)); }
    @Test public void testAdd48() { assertEquals(0, calc.add(-1000, 1000)); }
    @Test public void testAdd49() { assertEquals(-2000, calc.add(-1000, -1000)); }
    @Test public void testAdd50() { assertEquals(3, calc.add(1, 2)); }

    // The rest up to 100
    @Test public void testAdd51() { assertEquals(7, calc.add(4, 3)); }
    @Test public void testAdd52() { assertEquals(-7, calc.add(-4, -3)); }
    @Test public void testAdd53() { assertEquals(9, calc.add(6, 3)); }
    @Test public void testAdd54() { assertEquals(-9, calc.add(-6, -3)); }
    @Test public void testAdd55() { assertEquals(14, calc.add(7, 7)); }
    @Test public void testAdd56() { assertEquals(-14, calc.add(-7, -7)); }
    @Test public void testAdd57() { assertEquals(20, calc.add(10, 10)); }
    @Test public void testAdd58() { assertEquals(-20, calc.add(-10, -10)); }
    @Test public void testAdd59() { assertEquals(11, calc.add(5, 6)); }
    @Test public void testAdd60() { assertEquals(-11, calc.add(-5, -6)); }

    @Test public void testAdd61() { assertEquals(30, calc.add(15, 15)); }
    @Test public void testAdd62() { assertEquals(-30, calc.add(-15, -15)); }
    @Test public void testAdd63() { assertEquals(21, calc.add(20, 1)); }
    @Test public void testAdd64() { assertEquals(-21, calc.add(-20, -1)); }
    @Test public void testAdd65() { assertEquals(100, calc.add(99, 1)); }
    @Test public void testAdd66() { assertEquals(-100, calc.add(-99, -1)); }
    @Test public void testAdd67() { assertEquals(2000, calc.add(1000, 1000)); }
    @Test public void testAdd68() { assertEquals(-2000, calc.add(-1000, -1000)); }
    @Test public void testAdd69() { assertEquals(999, calc.add(998, 1)); }
    @Test public void testAdd70() { assertEquals(-999, calc.add(-998, -1)); }

    @Test public void testAdd71() { assertEquals(77, calc.add(70, 7)); }
    @Test public void testAdd72() { assertEquals(-77, calc.add(-70, -7)); }
    @Test public void testAdd73() { assertEquals(33, calc.add(30, 3)); }
    @Test public void testAdd74() { assertEquals(-33, calc.add(-30, -3)); }
    @Test public void testAdd75() { assertEquals(888, calc.add(444, 444)); }
    @Test public void testAdd76() { assertEquals(-888, calc.add(-444, -444)); }
    @Test public void testAdd77() { assertEquals(22, calc.add(11, 11)); }
    @Test public void testAdd78() { assertEquals(-22, calc.add(-11, -11)); }
    @Test public void testAdd79() { assertEquals(66, calc.add(33, 33)); }
    @Test public void testAdd80() { assertEquals(-66, calc.add(-33, -33)); }

    
}
