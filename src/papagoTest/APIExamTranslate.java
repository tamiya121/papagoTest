package papagoTest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class APIExamTranslate {

	 public static void main(String[] args) {
	        String clientId = "9rh501eOhfMUTbYwSjp5";
	        String clientSecret = "nMfTy9SSmQ";
	        try {
	            String text = URLEncoder.encode("hello", "UTF-8");
	            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
	            URL url = new URL(apiURL);
	            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
	            huc.setRequestMethod("POST");
	            huc.setRequestProperty("X-Naver-Client-Id", clientId);
	            huc.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            // post request
	            String postParams = "source=en&target=ko&text=" + text;
	            huc.setDoOutput(true);
	            DataOutputStream wr = new DataOutputStream(huc.getOutputStream());
	            wr.writeBytes(postParams);
	            wr.flush();
	            wr.close();
	            int responseCode = huc.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { 
	                br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
	            } else {  
	                br = new BufferedReader(new InputStreamReader(huc.getErrorStream()));
	            }
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	            while ((inputLine = br.readLine()) != null) {
	                response.append(inputLine);
	            }
	            br.close();
	            System.out.println(response.toString());
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}