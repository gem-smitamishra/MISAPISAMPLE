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
public class Loginuser extends GemjarTestngBase{

    @Test
    public void Loginuser() throws Exception{
        GemTestReporter.addTestStep("Test Case", "Test to check the Login User Api  ", STATUS.INFO);
        Request request = new Request();
        String url = ProjectConfigData.getProperty("Login");
        System.out.println(url);
        request.setURL(url);
        request.setMethod("Post");
        request.setStep("Login user");

        String payload = ProjectSampleJson.getSampleDataString("Loginuser");
        request.setRequestPayload(payload);

        Response response = ApiInvocation.handleRequest(request);
        System.out.println(response.getStatus());
    }
}
