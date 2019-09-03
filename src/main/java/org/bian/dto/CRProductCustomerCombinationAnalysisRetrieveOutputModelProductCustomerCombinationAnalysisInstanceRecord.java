package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord
 */
public class CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord   {
  private String customerReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private Object customerEligibilityAssessmentInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private Object customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerBehaviorAnalysisInstanceReference = null;

  private Object customerBehaviorAnalysisInstanceRecord = null;

  private String productServiceType = null;

  private String productServiceProperties = null;

  private String matchingContextIndicator = null;

  private String customerProductServiceUtilization = null;

  private String bankProductWeightingsPriorities = null;

  private String productMatchingAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer's eligibility profile record 
   * @return customerEligibilityAssessmentInstanceReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(String customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the customer's current use and eligibility for products/services - retrieved from SD-Customer Product/Service Eligibility using Customer Reference 
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public Object getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(Object customerEligibilityAssessmentInstanceRecord) {
    this.customerEligibilityAssessmentInstanceRecord = customerEligibilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer's reference data record 
   * @return customerReferenceDataDirectoryEntryInstanceReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReference() {
    return customerReferenceDataDirectoryEntryInstanceReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReference(String customerReferenceDataDirectoryEntryInstanceReference) {
    this.customerReferenceDataDirectoryEntryInstanceReference = customerReferenceDataDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The reference data record retrieved from the Customer Reference Data Management service domain 
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(Object customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer behavior insights record 
   * @return customerBehaviorAnalysisInstanceReference
  **/

  public String getCustomerBehaviorAnalysisInstanceReference() {
    return customerBehaviorAnalysisInstanceReference;
  }

  public void setCustomerBehaviorAnalysisInstanceReference(String customerBehaviorAnalysisInstanceReference) {
    this.customerBehaviorAnalysisInstanceReference = customerBehaviorAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A collection of customer insights that are maintained for a customer using customer behavior models applied to production activity that are referenced to improve servicing, sales, risk and relationship development 
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public Object getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(Object customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the type of product of interest (e.g. lending or deposit products) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the selected product's features and options desired 
   * @return productServiceProperties
  **/

  public String getProductServiceProperties() {
    return productServiceProperties;
  }

  public void setProductServiceProperties(String productServiceProperties) {
    this.productServiceProperties = productServiceProperties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the context for the product selection (e.g. solicitation, cross/up-sell, retention, relationship review) 
   * @return matchingContextIndicator
  **/

  public String getMatchingContextIndicator() {
    return matchingContextIndicator;
  }

  public void setMatchingContextIndicator(String matchingContextIndicator) {
    this.matchingContextIndicator = matchingContextIndicator;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reports obtained from product processing detail the customer's usage volume/frequency for in-force products 
   * @return customerProductServiceUtilization
  **/

  public String getCustomerProductServiceUtilization() {
    return customerProductServiceUtilization;
  }

  public void setCustomerProductServiceUtilization(String customerProductServiceUtilization) {
    this.customerProductServiceUtilization = customerProductServiceUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mechanism that allows the bank to define priorities for the type of products recommended 
   * @return bankProductWeightingsPriorities
  **/

  public String getBankProductWeightingsPriorities() {
    return bankProductWeightingsPriorities;
  }

  public void setBankProductWeightingsPriorities(String bankProductWeightingsPriorities) {
    this.bankProductWeightingsPriorities = bankProductWeightingsPriorities;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the analysis (can define the next best product or a prioritized list a appropriate) 
   * @return productMatchingAssessmentResult
  **/

  public String getProductMatchingAssessmentResult() {
    return productMatchingAssessmentResult;
  }

  public void setProductMatchingAssessmentResult(String productMatchingAssessmentResult) {
    this.productMatchingAssessmentResult = productMatchingAssessmentResult;
  }


}

