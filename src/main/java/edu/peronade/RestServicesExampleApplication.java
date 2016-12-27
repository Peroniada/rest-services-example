package edu.peronade;


		import edu.peronade.entity.Account;
		import edu.peronade.entity.Bookmark;
		import edu.peronade.repositories.AccountRepository;
		import edu.peronade.repositories.BookmarkRepository;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.Bean;

		import java.util.Arrays;

@SpringBootApplication
public class RestServicesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
						   BookmarkRepository bookmarkRepository) {
		return (evt) -> Arrays.asList(
				"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(
						a -> {
							Account account = accountRepository.save(new Account(a,
									"password"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/1/" + a, "A description"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/2/" + a, "A description"));
						});
	}

}