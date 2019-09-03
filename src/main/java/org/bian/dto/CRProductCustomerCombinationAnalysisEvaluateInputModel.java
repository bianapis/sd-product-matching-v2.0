package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisEvaluateInputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisEvaluateInputModel
 */
public class CRProductCustomerCombinationAnalysisEvaluateInputModel   {
  private String productMatchingServicingSessionReference = null;

  private Object productCustomerCombinationAnalysisEvaluateActionRecord = null;

  private String productCustomerCombinationAnalysisInstanceStatus = null;

  private CRProductCustomerCombinationAnalysisEvaluateInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return productCustomerCombinationAnalysisEvaluateActionRecord
  **/

  public Object getProductCustomerCombinationAnalysisEvaluateActionRecord() {
    return productCustomerCombinationAnalysisEvaluateActionRecord;
  }

  public void setProductCustomerCombinationAnalysisEvaluateActionRecord(Object productCustomerCombinationAnalysisEvaluateActionRecord) {
    this.productCustomerCombinationAnalysisEvaluateActionRecord = productCustomerCombinationAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Customer Combination Analysis instance (e.g. initialised, pending, active) 
   * @return productCustomerCombinationAnalysisInstanceStatus
  **/

  public String getProductCustomerCombinationAnalysisInstanceStatus() {
    return productCustomerCombinationAnalysisInstanceStatus;
  }

  public void setProductCustomerCombinationAnalysisInstanceStatus(String productCustomerCombinationAnalysisInstanceStatus) {
    this.productCustomerCombinationAnalysisInstanceStatus = productCustomerCombinationAnalysisInstanceStatus;
  }


  /**
   * Get productCustomerCombinationAnalysisInstanceRecord
   * @return productCustomerCombinationAnalysisInstanceRecord
  **/

  public CRProductCustomerCombinationAnalysisEvaluateInputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisEvaluateInputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
  }


}

