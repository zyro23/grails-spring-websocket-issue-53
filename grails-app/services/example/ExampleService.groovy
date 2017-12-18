package example

import org.springframework.messaging.simp.user.SimpUserRegistry
import org.springframework.scheduling.annotation.Scheduled

class ExampleService {

	static boolean lazyInit = false

	SimpUserRegistry userRegistry

	@Scheduled(fixedRate = 2000l)
	void check() {
		println userRegistry.users*.sessions*.subscriptions
	}

}
