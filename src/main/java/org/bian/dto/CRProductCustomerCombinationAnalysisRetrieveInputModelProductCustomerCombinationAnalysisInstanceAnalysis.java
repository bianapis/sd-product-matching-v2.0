package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis
 */
public class CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis   {
  private String productCustomerCombinationAnalysisInstanceAnalysisReference = null;

  private String productCustomerCombinationAnalysisInstanceAnalysisReportType = null;

  private String productCustomerCombinationAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productCustomerCombinationAnalysisInstanceAnalysisReference
  **/

  public String getProductCustomerCombinationAnalysisInstanceAnalysisReference() {
    return productCustomerCombinationAnalysisInstanceAnalysisReference;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysisReference(String productCustomerCombinationAnalysisInstanceAnalysisReference) {
    this.productCustomerCombinationAnalysisInstanceAnalysisReference = productCustomerCombinationAnalysisInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productCustomerCombinationAnalysisInstanceAnalysisReportType
  **/

  public String getProductCustomerCombinationAnalysisInstanceAnalysisReportType() {
    return productCustomerCombinationAnalysisInstanceAnalysisReportType;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysisReportType(String productCustomerCombinationAnalysisInstanceAnalysisReportType) {
    this.productCustomerCombinationAnalysisInstanceAnalysisReportType = productCustomerCombinationAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productCustomerCombinationAnalysisInstanceAnalysisParameters
  **/

  public String getProductCustomerCombinationAnalysisInstanceAnalysisParameters() {
    return productCustomerCombinationAnalysisInstanceAnalysisParameters;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysisParameters(String productCustomerCombinationAnalysisInstanceAnalysisParameters) {
    this.productCustomerCombinationAnalysisInstanceAnalysisParameters = productCustomerCombinationAnalysisInstanceAnalysisParameters;
  }


}

