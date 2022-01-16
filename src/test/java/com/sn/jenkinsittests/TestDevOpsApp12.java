package com.sn.jenkinsittests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class TestDevOpsApp12
{
    /**
     * Rigorous Test :-)
     */
	
	String devOpsTitle = "DevOps";
	
    @Test
    public void shouldAnswerWithTrue()
    {
        //new change
        //new change for Cascade Delete
        //Another change for Cascade Delete
        //Third Change
        //Change for Cascade Delete, again
        //Change For validation of PipelineUI Tests
        assertTrue( true );
    }
    
    
    @Test
    public void validateAddMethod1()
    {
        // assertTrue( false );
        assertTrue(devOpsTitle.equals("DevOps"));
    }
    
    @Test
    @Ignore
    public void validateAddMethods2()
    {
      //  assertTrue( true );
        assertTrue(devOpsTitle.equals("DevOps"));
    }
    
    @Test
    public void validateAddMethods3()
    {
        // assertTrue( false );
        assertTrue(devOpsTitle.equals("DevOps"));
    }
}
