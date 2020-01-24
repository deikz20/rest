package facci.pm.vera.herrera.mongodb.rest.model;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("title")
    private String Title;

    @SerializedName("description")
    private String Description;

    @SerializedName("url_image")
    private String UrlImage;




    public Post(String title, String description, String urlImage){
        Title = title;
        Description = description;
        UrlImage= urlImage;
    }


    public String getTitle() { return Title; }

    public void setTitle(String title) { Title = title; }

    public String getDescription() { return Description; }

    public void setDescription(String description) { Description = description; }

    public String getUrlImage() { return UrlImage; }

    public void setUrlImage(String urlImage) { UrlImage = urlImage; }
}
