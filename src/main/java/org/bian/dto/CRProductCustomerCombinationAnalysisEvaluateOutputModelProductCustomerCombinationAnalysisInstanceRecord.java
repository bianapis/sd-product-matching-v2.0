package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord
 */
public class CRProductCustomerCombinationAnalysisEvaluateOutputModelProductCustomerCombinationAnalysisInstanceRecord   {
  private String productMatchingAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the analysis (can define the next best product or a prioritized list a appropriate) 
   * @return productMatchingAssessmentResult
  **/

  public String getProductMatchingAssessmentResult() {
    return productMatchingAssessmentResult;
  }

  public void setProductMatchingAssessmentResult(String productMatchingAssessmentResult) {
    this.productMatchingAssessmentResult = productMatchingAssessmentResult;
  }


}

