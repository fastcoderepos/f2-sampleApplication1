package com.fastcode.timesheet.application.extended.authorization.users;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.authorization.users.UsersAppService;

import com.fastcode.timesheet.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.timesheet.domain.core.authorization.userspreference.IUserspreferenceRepository;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("usersAppServiceExtended")
public class UsersAppServiceExtended extends UsersAppService implements IUsersAppServiceExtended {

	public UsersAppServiceExtended(IUsersRepositoryExtended usersRepositoryExtended,
				IUserspreferenceRepository userspreferenceRepository,IUsersMapperExtended mapper,LoggingHelper logHelper) {

		super(usersRepositoryExtended,
		userspreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

