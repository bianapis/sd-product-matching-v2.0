package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisEvaluateOutputModel
 */
public class CRProductCustomerCombinationAnalysisEvaluateOutputModel   {
  private String productCustomerCombinationAnalysisInstanceReference = null;

  private String productCustomerCombinationAnalysisEvaluateActionReference = null;

  private Object productCustomerCombinationAnalysisEvaluateActionRecord = null;

  private String productCustomerCombinationAnalysisInstanceStatus = null;

  private CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return productCustomerCombinationAnalysisEvaluateActionReference
  **/

  public String getProductCustomerCombinationAnalysisEvaluateActionReference() {
    return productCustomerCombinationAnalysisEvaluateActionReference;
  }

  public void setProductCustomerCombinationAnalysisEvaluateActionReference(String productCustomerCombinationAnalysisEvaluateActionReference) {
    this.productCustomerCombinationAnalysisEvaluateActionReference = productCustomerCombinationAnalysisEvaluateActionReference;
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

  public CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord getProductCustomerCombinationAnalysisInstanceRecord() {
    return productCustomerCombinationAnalysisInstanceRecord;
  }

  public void setProductCustomerCombinationAnalysisInstanceRecord(CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord productCustomerCombinationAnalysisInstanceRecord) {
    this.productCustomerCombinationAnalysisInstanceRecord = productCustomerCombinationAnalysisInstanceRecord;
  }


}

