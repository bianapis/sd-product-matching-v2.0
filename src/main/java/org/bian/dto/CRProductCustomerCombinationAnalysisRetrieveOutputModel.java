package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis;
import org.bian.dto.CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord;
import org.bian.dto.CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRetrieveOutputModel
 */
public class CRProductCustomerCombinationAnalysisRetrieveOutputModel   {
  private CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private String productCustomerCombinationAnalysisRetrieveActionTaskReference = null;

  private Object productCustomerCombinationAnalysisRetrieveActionTaskRecord = null;

  private String productCustomerCombinationAnalysisRetrieveActionResponse = null;

  private CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord productCustomerCombinationAnalysisInstanceReportRecord = null;

  private CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis productCustomerCombinationAnalysisInstanceAnalysis = null;


  /**
   * Get productCustomerCombinationAnalysisInstanceRecord
   * @return productCustomerCombinationAnalysisInstanceRecord
  **/

  public CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Analysis instance retrieve service call 
   * @return productCustomerCombinationAnalysisRetrieveActionTaskReference
  **/

  public String getProductCustomerCombinationAnalysisRetrieveActionTaskReference() {
    return productCustomerCombinationAnalysisRetrieveActionTaskReference;
  }

  public void setProductCustomerCombinationAnalysisRetrieveActionTaskReference(String productCustomerCombinationAnalysisRetrieveActionTaskReference) {
    this.productCustomerCombinationAnalysisRetrieveActionTaskReference = productCustomerCombinationAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productCustomerCombinationAnalysisRetrieveActionResponse
  **/

  public String getProductCustomerCombinationAnalysisRetrieveActionResponse() {
    return productCustomerCombinationAnalysisRetrieveActionResponse;
  }

  public void setProductCustomerCombinationAnalysisRetrieveActionResponse(String productCustomerCombinationAnalysisRetrieveActionResponse) {
    this.productCustomerCombinationAnalysisRetrieveActionResponse = productCustomerCombinationAnalysisRetrieveActionResponse;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceReportRecord
   * @return productCustomerCombinationAnalysisInstanceReportRecord
  **/

  public CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord getProductCustomerCombinationAnalysisInstanceReportRecord() {
    return productCustomerCombinationAnalysisInstanceReportRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceReportRecord(CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceReportRecord productCustomerCombinationAnalysisInstanceReportRecord) {
    this.productCustomerCombinationAnalysisInstanceReportRecord = productCustomerCombinationAnalysisInstanceReportRecord;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceAnalysis
   * @return productCustomerCombinationAnalysisInstanceAnalysis
  **/

  public CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis getProductCustomerCombinationAnalysisInstanceAnalysis() {
    return productCustomerCombinationAnalysisInstanceAnalysis;
  }

  public void setProductCustomerCombinationAnalysisInstanceAnalysis(CRProductCustomerCombinationAnalysisRetrieveOutputModelProductCustomerCombinationAnalysisInstanceAnalysis productCustomerCombinationAnalysisInstanceAnalysis) {
    this.productCustomerCombinationAnalysisInstanceAnalysis = productCustomerCombinationAnalysisInstanceAnalysis;
  }


}

