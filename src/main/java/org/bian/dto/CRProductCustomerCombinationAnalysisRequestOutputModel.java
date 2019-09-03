package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRequestOutputModel
 */
public class CRProductCustomerCombinationAnalysisRequestOutputModel   {
  private CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private String productCustomerCombinationAnalysisRequestActionTaskReference = null;

  private Object productCustomerCombinationAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Analysis instance request service call 
   * @return productCustomerCombinationAnalysisRequestActionTaskReference
  **/

  public String getProductCustomerCombinationAnalysisRequestActionTaskReference() {
    return productCustomerCombinationAnalysisRequestActionTaskReference;
  }

  public void setProductCustomerCombinationAnalysisRequestActionTaskReference(String productCustomerCombinationAnalysisRequestActionTaskReference) {
    this.productCustomerCombinationAnalysisRequestActionTaskReference = productCustomerCombinationAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productCustomerCombinationAnalysisRequestActionTaskRecord
  **/

  public Object getProductCustomerCombinationAnalysisRequestActionTaskRecord() {
    return productCustomerCombinationAnalysisRequestActionTaskRecord;
  }

  public void setProductCustomerCombinationAnalysisRequestActionTaskRecord(Object productCustomerCombinationAnalysisRequestActionTaskRecord) {
    this.productCustomerCombinationAnalysisRequestActionTaskRecord = productCustomerCombinationAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

