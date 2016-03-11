
package de.cs.sometool.news.repo;


import de.cs.sometool.news.model.domain.NewsEntity;

public class NewsRepo {

    public void save() {
        new NewsEntity(); // #5 OK
        // new NewsDTO(); // #6 o_O
        // new NewsView(); // #14 o_O
        // new NewsService(); // #15 o_O
    }

}
