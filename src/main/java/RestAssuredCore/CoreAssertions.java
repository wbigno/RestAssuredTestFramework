package RestAssuredCore;

import Utilities.TestUtilities;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class CoreAssertions {

        private static Logger log = LogManager.getLogger(TestUtilities.class.getName());

        public static void verifyTrue(boolean flag){
            Assert.assertTrue(flag);
        }

        public static void verifyFalse(boolean flag){
            Assert.assertFalse(flag);
        }

        public static void verifyStatusCode(Response response, int status){
            Assert.assertEquals(TestUtilities.getStatusCode(response), status);
        }

        public static void verifyStatusMessage(Response response, String status){
            Assert.assertEquals(TestUtilities.getStatusCode(response), status);
        }
    }

