# Welcome to the UnitTestAndTDD

the purpose is to explore the unit tests and tdd world

## In this repo I used
 * [maven](https://maven.apache.org/) 
 * [java 8](https://www.java.com/it/download/win10.jsp)
 * [junit](https://junit.org/junit5/) (test basic lib)
 * [mockito](https://site.mockito.org/) (useful test lib)
 * [jacoco](https://www.jacoco.org/jacoco/) (code coverage)
 * [pitest](https://pitest.org/) (code coverage + mutant generator)
 * [lombok](https://projectlombok.org/) (cleaning reasons)

## Useful cl commands
 *  clean and install all the libs ```mvn clean install```
 *  execute tests ```mvn clean test```
 *  generate code coverage report (jacoco) ```mvn jacoco:report -f pom.xml```
 *  generate mutants and related code coverage report (pitest) ```mvn test pitest:mutationCoverage```
