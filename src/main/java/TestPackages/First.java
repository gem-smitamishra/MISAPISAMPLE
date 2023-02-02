package TestPackages;
import com.gemini.generic.api.utils.ApiInvocation;
import com.gemini.generic.api.utils.ProjectSampleJson;
import com.gemini.generic.api.utils.Request;
import com.gemini.generic.api.utils.Response;
import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemjarTestngBase;
import com.gemini.generic.utils.ProjectConfigData;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;

public class First extends GemjarTestngBase{
    @Test
    public void Sample() throws Exception{
        Request request = new Request();
        String url=ProjectConfigData.getProperty("Gett");
        request.setURL(url);
        request.setMethod("get");
        request.setStep("Test to check the get api");
        Response response = ApiInvocation.handleRequest(request);
        System.out.println(response.getStatus());
    }

}
