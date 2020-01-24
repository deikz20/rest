package facci.pm.vera.herrera.mongodb.rest.service;

import java.util.List;

import facci.pm.vera.herrera.mongodb.rest.model.Posts;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
