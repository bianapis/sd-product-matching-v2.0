package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis
 */
public class CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis   {
  private String productCustomerCombinationAnalysisInstanceAnalysisData = null;

  private String productCustomerCombinationAnalysisInstanceAnalysisReportType = null;

  private Object productCustomerCombinationAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productCustomerCombinationAnalysisInstanceAnalysisData
  **/

  public String getProductCustomerCombinationAnalysisInstanceAnalysisData() {
    return productCustomerCombinationAnalysisInstanceAnalysisData;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysisData(String productCustomerCombinationAnalysisInstanceAnalysisData) {
    this.productCustomerCombinationAnalysisInstanceAnalysisData = productCustomerCombinationAnalysisInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return productCustomerCombinationAnalysisInstanceAnalysisReport
  **/

  public Object getProductCustomerCombinationAnalysisInstanceAnalysisReport() {
    return productCustomerCombinationAnalysisInstanceAnalysisReport;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysisReport(Object productCustomerCombinationAnalysisInstanceAnalysisReport) {
    this.productCustomerCombinationAnalysisInstanceAnalysisReport = productCustomerCombinationAnalysisInstanceAnalysisReport;
  }


}

