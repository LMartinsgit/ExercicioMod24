package br.com.lmartins;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author lucas.martins
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {
}
