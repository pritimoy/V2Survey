package ltd.v2.v2survey.network;

import io.reactivex.Observable;
import ltd.v2.v2survey.model.Survey;
import retrofit2.Response;
import retrofit2.http.GET;

public interface NetworkCall {
    //Get Survey Data
    @GET("getSurvey/")
    Observable<Response<Survey[]>> GetSurvey();
}
