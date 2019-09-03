package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord
 */
public class CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord   {
  private String productCustomerCombinationAnalysisInstanceReportData = null;

  private String productCustomerCombinationAnalysisInstanceReportType = null;

  private Object productCustomerCombinationAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productCustomerCombinationAnalysisInstanceReportData
  **/

  public String getProductCustomerCombinationAnalysisInstanceReportData() {
    return productCustomerCombinationAnalysisInstanceReportData;
  }

  public void setProductCustomerCombinationAnalysisInstanceReportData(String productCustomerCombinationAnalysisInstanceReportData) {
    this.productCustomerCombinationAnalysisInstanceReportData = productCustomerCombinationAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productCustomerCombinationAnalysisInstanceReportType
  **/

  public String getProductCustomerCombinationAnalysisInstanceReportType() {
    return productCustomerCombinationAnalysisInstanceReportType;
  }

  public void setProductCustomerCombinationAnalysisInstanceReportType(String productCustomerCombinationAnalysisInstanceReportType) {
    this.productCustomerCombinationAnalysisInstanceReportType = productCustomerCombinationAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productCustomerCombinationAnalysisInstanceReport
  **/

  public Object getProductCustomerCombinationAnalysisInstanceReport() {
    return productCustomerCombinationAnalysisInstanceReport;
  }

  public void setProductCustomerCombinationAnalysisInstanceReport(Object productCustomerCombinationAnalysisInstanceReport) {
    this.productCustomerCombinationAnalysisInstanceReport = productCustomerCombinationAnalysisInstanceReport;
  }


}

