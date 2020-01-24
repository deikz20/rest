package facci.pm.vera.herrera.mongodb.rest.service;

import java.util.List;

import facci.pm.vera.herrera.mongodb.rest.constants.ApiConstants;
import facci.pm.vera.herrera.mongodb.rest.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MarketService {
    @POST (ApiConstants.MARKET_POST_ENDPOINT)
    Call<Post> InsertPost (@Body Post post);

    @GET(ApiConstants.MARKET_POST_ENDPOINT)
    Call<List<Post>> getPosts();


}


