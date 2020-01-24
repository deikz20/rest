package facci.pm.vera.herrera.mongodb.rest.adapter;

import java.util.List;

import facci.pm.vera.herrera.mongodb.rest.constants.ApiConstants;
import facci.pm.vera.herrera.mongodb.rest.model.Post;
import facci.pm.vera.herrera.mongodb.rest.service.MarketService;
import retrofit2.Call;

public class MarketAdapter
        extends BaseAdapter
        implements MarketService {

    private MarketService marketService;

    public MarketAdapter(){
        super(ApiConstants.BASE_POST_URL);
        marketService = createService(MarketService.class);

    }

    @Override
    public Call<Post> InsertPost(Post post){
        return marketService.InsertPost(post);
    }

    @Override
    public Call<List<Post>> getPosts() {
        return marketService.getPosts();
    }
}
