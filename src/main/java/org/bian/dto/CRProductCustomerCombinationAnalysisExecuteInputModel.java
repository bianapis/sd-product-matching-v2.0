package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRProductCustomerCombinationAnalysisExecuteInputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisExecuteInputModel
 */
public class CRProductCustomerCombinationAnalysisExecuteInputModel   {
  private String productMatchingServicingSessionReference = null;

  private String productCustomerCombinationAnalysisInstanceReference = null;

  private CRProductCustomerCombinationAnalysisExecuteInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private Object productCustomerCombinationAnalysisExecuteActionTaskRecord = null;

  private CRProductCustomerCombinationAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productMatchingServicingSessionReference
  **/

  public String getProductMatchingServicingSessionReference() {
    return productMatchingServicingSessionReference;
  }

  public void setProductMatchingServicingSessionReference(String productMatchingServicingSessionReference) {
    this.productMatchingServicingSessionReference = productMatchingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Customer Combination Analysis instance 
   * @return productCustomerCombinationAnalysisInstanceReference
  **/

  public String getProductCustomerCombinationAnalysisInstanceReference() {
    return productCustomerCombinationAnalysisInstanceReference;
  }

  public void setProductCustomerCombinationAnalysisInstanceReference(String productCustomerCombinationAnalysisInstanceReference) {
    this.productCustomerCombinationAnalysisInstanceReference = productCustomerCombinationAnalysisInstanceReference;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceRecord
   * @return productCustomerCombinationAnalysisInstanceRecord
  **/

  public CRProductCustomerCombinationAnalysisExecuteInputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisExecuteInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRProductCustomerCombinationAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRProductCustomerCombinationAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

