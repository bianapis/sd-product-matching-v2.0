/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductMatchingApiService {

	SDProductMatchingActivateOutputModel activate(SDProductMatchingActivateInputModel request);
	
	SDProductMatchingConfigureOutputModel configure(String sdReferenceId, SDProductMatchingConfigureInputModel request);
	
	CRProductCustomerCombinationAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRProductCustomerCombinationAnalysisEvaluateInputModel request);
	
	CRProductCustomerCombinationAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisExecuteInputModel request);
	
	SDProductMatchingFeedbackOutputModel feedback(String sdReferenceId, SDProductMatchingFeedbackInputModel request);
	
	CRProductCustomerCombinationAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisRequestInputModel request);
	
	CRProductCustomerCombinationAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductMatchingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductCustomerCombinationAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisUpdateInputModel request);
	
}
