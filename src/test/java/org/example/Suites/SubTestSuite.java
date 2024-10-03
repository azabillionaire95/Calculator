package org.example.Suites;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example.Tests")
@IncludeTags("Вычитание")
public class SubTestSuite {
}
