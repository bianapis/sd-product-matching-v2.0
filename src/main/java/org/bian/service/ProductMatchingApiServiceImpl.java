/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductMatchingApiServiceImpl implements ProductMatchingApiService {

	public SDProductMatchingActivateOutputModel activate(SDProductMatchingActivateInputModel request){
		return JsonReader.read("activate-SDProductMatchingActivateOutputModel.json",new TypeReference<SDProductMatchingActivateOutputModel>(){});
	}
	
	public SDProductMatchingConfigureOutputModel configure(String sdReferenceId, SDProductMatchingConfigureInputModel request){
		return JsonReader.read("configure-SDProductMatchingConfigureOutputModel.json",new TypeReference<SDProductMatchingConfigureOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRProductCustomerCombinationAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRProductCustomerCombinationAnalysisEvaluateOutputModel.json",new TypeReference<CRProductCustomerCombinationAnalysisEvaluateOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRProductCustomerCombinationAnalysisExecuteOutputModel.json",new TypeReference<CRProductCustomerCombinationAnalysisExecuteOutputModel>(){});
	}
	
	public SDProductMatchingFeedbackOutputModel feedback(String sdReferenceId, SDProductMatchingFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductMatchingFeedbackOutputModel.json",new TypeReference<SDProductMatchingFeedbackOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisRequestInputModel request){
		return JsonReader.read("request-CRProductCustomerCombinationAnalysisRequestOutputModel.json",new TypeReference<CRProductCustomerCombinationAnalysisRequestOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductCustomerCombinationAnalysisRetrieveOutputModel.json",new TypeReference<CRProductCustomerCombinationAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductMatchingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductMatchingRetrieveOutputModel.json",new TypeReference<SDProductMatchingRetrieveOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRProductCustomerCombinationAnalysisUpdateOutputModel.json",new TypeReference<CRProductCustomerCombinationAnalysisUpdateOutputModel>(){});
	}
	
}
