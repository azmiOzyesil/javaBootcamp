package kodlama.io.softwareCourse.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.softwareCourse.dataAccess.abstracts.LanguageRepository;
import kodlama.io.softwareCourse.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(Language language) {
		for (Language language1 : languages) {
			if(language1.getId() == language.getId())
				language.setName(language.getName());
		}
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if(language.getId() == id)
				return language;
		}
		
		return null;
	}

	@Override
	public Language getByName(String name) {
		for (Language language : languages) {
			if(language.getName() == name)
				return language;
		}
		
		return null;
	}

}
