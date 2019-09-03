package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisUpdateOutputModel
 */
public class CRProductCustomerCombinationAnalysisUpdateOutputModel   {
  private CRProductCustomerCombinationAnalysisUpdateInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;

  private String productCustomerCombinationAnalysisUpdateActionTaskReference = null;

  private Object productCustomerCombinationAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productCustomerCombinationAnalysisUpdateActionTaskReference
  **/

  public String getProductCustomerCombinationAnalysisUpdateActionTaskReference() {
    return productCustomerCombinationAnalysisUpdateActionTaskReference;
  }

  public void setProductCustomerCombinationAnalysisUpdateActionTaskReference(String productCustomerCombinationAnalysisUpdateActionTaskReference) {
    this.productCustomerCombinationAnalysisUpdateActionTaskReference = productCustomerCombinationAnalysisUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

