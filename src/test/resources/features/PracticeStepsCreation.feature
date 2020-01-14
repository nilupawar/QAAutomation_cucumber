Feature: This feature will help to understand different ways of writing gherkin statements

  Scenario: Long to short gherkin statement
    Given first statement after second statement
    And first statement

  @fewOthertags
  Scenario: Singular and plural steps : One step definition for below both steps
    * file processed
    * files processed

  Scenario: Specific values as parameter : One step definition for below both steps: values capturable
    Given i have table
    And i have chair

  @Tag1 @Tag2
  Scenario: Multiple acceptable values : One step definition for below both steps: values non-capturable
    Given i do not have table
    And i do not have chair

  @Tag2
  Scenario: Numeric value parameter : One Step definition for below both steps
    Given i have 10 pens
    * i have 1 pen

  Scenario: String value parameter
  Given

  Scenario: DataTable parameter
  Given

  Scenario: Example table parameter
  Given

  @MultiExamples
  Scenario Outline: Multiple Example table parameter "<rowNum>"
    * this step will run for multiple example row "<rowNum>"

    @ExampleTag1
    Examples: This is first test set
      | rowNum |
      | 1      |
      | 2      |
      | 3      |

    @ExampleTag2
    Examples: This is second test set
      | rowNum |
      | 4      |
      | 5      |
      | 6      |