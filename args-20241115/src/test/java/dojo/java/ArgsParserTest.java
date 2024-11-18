package dojo.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class ArgsParserTest 
{
    private ArgsParser parser;
    private String inputArg;
    private boolean expectedFlagEvaluation;
    private boolean expectedValueEvaluation;

    public ArgsParserTest(String inputArg, boolean expectedFlagEvaluation, boolean expectedValueEvaluation){
        this.inputArg = inputArg;
        this.expectedFlagEvaluation = expectedFlagEvaluation;
        this.expectedValueEvaluation = expectedValueEvaluation;
    }

    @Parameterized.Parameters
    public static Collection exampleArgs() {
        return Arrays.asList(new Object[][] {
         { "", false, false },
         { "a", false, true },
      });
    }

    @Before
    public void init() {
        this.parser = new ArgsParser();
    }

    @Test
    public void shouldEvaluateAsFlagCorrectly()
    {
        // arrange (done in init)
        
        // act
        boolean actualFlagEvaluation = this.parser.isFlag(this.inputArg);
        
        // assert
        assertEquals(this.expectedFlagEvaluation, actualFlagEvaluation);
    }

    @Test
    public void shouldEvaluateAsValueCorrectly()
    {
        // arrange (done in init)
        
        // act
        boolean actualValueEvaluation = this.parser.isValue(this.inputArg);
        
        // assert
        assertEquals(this.expectedValueEvaluation, actualValueEvaluation);
    }
}
