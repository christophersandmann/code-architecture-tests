
package de.cs.sometool.news.service;


import de.cs.sometool.news.model.domain.NewsEntity;
import de.cs.sometool.news.model.dto.NewsDTO;
import de.cs.sometool.news.repo.NewsRepo;

public class NewsService {

    public void serviceMethod() {
        new NewsRepo().save(); // #4 OK
        new NewsDTO(); // #8 OK
        new NewsEntity(); // #9 OK
        // new NewsView(); //#16 o_O
    }
}
