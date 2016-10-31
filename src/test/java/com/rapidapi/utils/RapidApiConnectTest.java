package com.rapidapi.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RapidApiConnectTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RapidApiConnectTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RapidApiConnectTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testRapidApiConnect()
    {
        assertTrue( true );
    }
}
