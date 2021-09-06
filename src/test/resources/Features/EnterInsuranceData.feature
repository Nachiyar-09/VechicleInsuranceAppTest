@InsuranceData
Feature: To test the components present in this insurance data tab
  Scenario: Insurance data tab under test
     Given User should be navigated to insurance data page
      And user should enter values in the FIRST NAME field 
      And use should enter values in the LAST NAME field
      And user should select date from the DATE OF BIRTH datepicker
      And user should select values from the available GENDER option
      And user should enter values in the STREET ADDRESS field
      And user should select values from the COUNTRY dropdown
      And user should enter values in the ZIP CODE field
      And user should enter values in the CITY field
      And user should select values from the OCCUPATION dropdown field
      And user should select the values available in the HOBBIES checkbox fields
      And user should enter values in the WEBSITE field
       Then user should click on the NEXT button available
     
