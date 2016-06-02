
package de.cs.sometool.news.view;


import de.cs.sometool.news.model.dto.NewsDTO;
import de.cs.sometool.news.service.NewsService;

public class NewsView {

    void view() {
        new NewsService().serviceMethod(); // #1 OK
        new NewsDTO(); // #2 OK
        //new NewsEntity(); // #3 o_O
        // new NewsRepo(); //#7 o_O
    }

}
