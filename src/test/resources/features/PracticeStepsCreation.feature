Feature: This feature will help to understand different ways of writing gherkin statements

  Scenario: Long to short gherkin statement
    Given first statement after second statement
    And first statement

  Scenario: Singular and plural steps : One step definition for below both steps
    * file processed
    * files processed

  Scenario: Specific values as parameter : One step definition for below both steps: values capturable
    Given i have table
    And i have chair

  Scenario: Multiple acceptable values : One step definition for below both steps: values non-capturable
    Given i do not have table
    And i do not have chair

  Scenario: Numeric value parameter : One Step definition for below both steps
    Given i have 10 pens
    * i have 1 pen

  Scenario: String value parameter
    Given

  Scenario: DataTable parameter
    Given

  Scenario: Example table parameter
    Given

  Scenario: Multiple Example table parameter
    Given