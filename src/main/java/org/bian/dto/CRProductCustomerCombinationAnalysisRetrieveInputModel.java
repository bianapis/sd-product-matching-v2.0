package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis;
import org.bian.dto.CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveInputModel
 */
public class CRProductCustomerCombinationAnalysisRetrieveInputModel   {
  private Object productCustomerCombinationAnalysisRetrieveActionTaskRecord = null;

  private String productCustomerCombinationAnalysisRetrieveActionRequest = null;

  private CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceReportRecord productCustomerCombinationAnalysisInstanceReportRecord = null;

  private CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis productCustomerCombinationAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productCustomerCombinationAnalysisRetrieveActionTaskRecord
  **/

  public Object getProductCustomerCombinationAnalysisRetrieveActionTaskRecord() {
    return productCustomerCombinationAnalysisRetrieveActionTaskRecord;
  }

  public void setProductCustomerCombinationAnalysisRetrieveActionTaskRecord(Object productCustomerCombinationAnalysisRetrieveActionTaskRecord) {
    this.productCustomerCombinationAnalysisRetrieveActionTaskRecord = productCustomerCombinationAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productCustomerCombinationAnalysisRetrieveActionRequest
  **/

  public String getProductCustomerCombinationAnalysisRetrieveActionRequest() {
    return productCustomerCombinationAnalysisRetrieveActionRequest;
  }

  public void setProductCustomerCombinationAnalysisRetrieveActionRequest(String productCustomerCombinationAnalysisRetrieveActionRequest) {
    this.productCustomerCombinationAnalysisRetrieveActionRequest = productCustomerCombinationAnalysisRetrieveActionRequest;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceReportRecord
   * @return productCustomerCombinationAnalysisInstanceReportRecord
  **/

  public CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceReportRecord getProductCustomerCombinationAnalysisInstanceReportRecord() {
    return productCustomerCombinationAnalysisInstanceReportRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceReportRecord(CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceReportRecord productCustomerCombinationAnalysisInstanceReportRecord) {
    this.productCustomerCombinationAnalysisInstanceReportRecord = productCustomerCombinationAnalysisInstanceReportRecord;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceAnalysis
   * @return productCustomerCombinationAnalysisInstanceAnalysis
  **/

  public CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis getProductCustomerCombinationAnalysisInstanceAnalysis() {
    return productCustomerCombinationAnalysisInstanceAnalysis;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysis(CRProductCustomerCombinationAnalysisRetrieveInputModelProductCustomerCombinationAnalysisInstanceAnalysis productCustomerCombinationAnalysisInstanceAnalysis) {
    this.productCustomerCombinationAnalysisInstanceAnalysis = productCustomerCombinationAnalysisInstanceAnalysis;
  }


}

