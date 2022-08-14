package yandex.practicum.object.toString;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public void setTitle (String title){
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    public String toString (){
        return "Post{" + "title='" + title + '\'' + " content.length='" + content.length() + '\'' + " tags= " + Arrays.toString(tags)
                + '\'' + " comments= " + "PostComment{text='" + comments
    }

    /* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

}