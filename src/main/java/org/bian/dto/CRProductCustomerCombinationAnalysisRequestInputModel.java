package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisRequestInputModelProductCustomerCombinationAnalysisInstanceRecord;
import org.bian.dto.CRProductCustomerCombinationAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisRequestInputModel
 */
public class CRProductCustomerCombinationAnalysisRequestInputModel   {
  private String productMatchingServicingSessionReference = null;

  private String productCustomerCombinationAnalysisInstanceReference = null;

  private CRProductCustomerCombinationAnalysisRequestInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private Object productCustomerCombinationAnalysisRequestActionTaskRecord = null;

  private CRProductCustomerCombinationAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRProductCustomerCombinationAnalysisRequestInputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisRequestInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductCustomerCombinationAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductCustomerCombinationAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

