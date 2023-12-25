package viraj.com.services;

import viraj.com.dto.AddUserRequest;
import viraj.com.dto.AddUserResponse;
import org.springframework.stereotype.Service;

@Service
public class AddUserServices {

	public AddUserResponse addUser(AddUserRequest addUserRequest) {

		AddUserResponse response = new AddUserResponse();

		if (addUserRequest.getAction().equalsIgnoreCase("AddUser") && addUserRequest.getUser_id().equals("123")
				&& addUserRequest.getUser_name().equalsIgnoreCase("John Doe") && // Fixed method call
				addUserRequest.getUser_email().equalsIgnoreCase("john.doe@example.com")
				&& addUserRequest.getUser_age().equals("28")) {

			response.setStatus("success");
			response.setMessage("User successfully added");
			response.setUser_name("John Doe");
			response.setUser_id("123");
			response.setUser_email("john.doe@example.com");
			response.setUser_age("28");
		} else {
			response.setStatus("Failed");
			response.setMessage("User Not Found!!!!..");
		}
		return response;
	}

}
