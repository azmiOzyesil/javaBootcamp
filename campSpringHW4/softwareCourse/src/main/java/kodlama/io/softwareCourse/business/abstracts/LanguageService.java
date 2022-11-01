package kodlama.io.softwareCourse.business.abstracts;

import java.util.List;

import kodlama.io.softwareCourse.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language);
	Language getById(int id);
	Language getByName(String name);

}
