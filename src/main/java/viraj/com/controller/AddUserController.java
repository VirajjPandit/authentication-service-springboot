package viraj.com.controller;

import viraj.com.dto.AddUserRequest;
import viraj.com.dto.AddUserResponse;
import viraj.com.services.AddUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {

	@Autowired
	AddUserServices addUserService;

	@PostMapping(path = "/api/auth/add-user", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public AddUserResponse addUser(@RequestBody AddUserRequest addUserRequest) {
		return addUserService.addUser(addUserRequest);
	}
}
