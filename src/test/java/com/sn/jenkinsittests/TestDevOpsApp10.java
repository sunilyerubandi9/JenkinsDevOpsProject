package com.sn.jenkinsittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class TestDevOpsApp10
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
    @Ignore
    public void validateAddMethods()
    {
        assertTrue( true );
        assertTrue(devOpsTitle.equals("DevOps"));
    }
}
