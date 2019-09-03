package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisExecuteOutputModel
 */
public class CRProductCustomerCombinationAnalysisExecuteOutputModel   {
  private CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private String productCustomerCombinationAnalysisExecuteActionTaskReference = null;

  private Object productCustomerCombinationAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get productCustomerCombinationAnalysisInstanceRecord
   * @return productCustomerCombinationAnalysisInstanceRecord
  **/

  public CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Analysis instance execute service call 
   * @return productCustomerCombinationAnalysisExecuteActionTaskReference
  **/

  public String getProductCustomerCombinationAnalysisExecuteActionTaskReference() {
    return productCustomerCombinationAnalysisExecuteActionTaskReference;
  }

  public void setProductCustomerCombinationAnalysisExecuteActionTaskReference(String productCustomerCombinationAnalysisExecuteActionTaskReference) {
    this.productCustomerCombinationAnalysisExecuteActionTaskReference = productCustomerCombinationAnalysisExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productCustomerCombinationAnalysisExecuteActionTaskRecord
  **/

  public Object getProductCustomerCombinationAnalysisExecuteActionTaskRecord() {
    return productCustomerCombinationAnalysisExecuteActionTaskRecord;
  }

  public void setProductCustomerCombinationAnalysisExecuteActionTaskRecord(Object productCustomerCombinationAnalysisExecuteActionTaskRecord) {
    this.productCustomerCombinationAnalysisExecuteActionTaskRecord = productCustomerCombinationAnalysisExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

