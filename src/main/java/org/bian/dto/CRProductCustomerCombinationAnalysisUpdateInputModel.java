package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisUpdateInputModel
 */
public class CRProductCustomerCombinationAnalysisUpdateInputModel   {
  private String productMatchingServicingSessionReference = null;

  private String productCustomerCombinationAnalysisInstanceReference = null;

  private CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private Object productCustomerCombinationAnalysisUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productCustomerCombinationAnalysisUpdateActionTaskRecord
  **/

  public Object getProductCustomerCombinationAnalysisUpdateActionTaskRecord() {
    return productCustomerCombinationAnalysisUpdateActionTaskRecord;
  }

  public void setProductCustomerCombinationAnalysisUpdateActionTaskRecord(Object productCustomerCombinationAnalysisUpdateActionTaskRecord) {
    this.productCustomerCombinationAnalysisUpdateActionTaskRecord = productCustomerCombinationAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

