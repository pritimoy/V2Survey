package ltd.v2.v2survey.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import io.reactivex.Observable;
import ltd.v2.v2survey.model.Survey;
import ltd.v2.v2survey.repository.NetworkCallRepository;
import retrofit2.Response;

public class MainActivityViewModel extends AndroidViewModel {
    private NetworkCallRepository mNetworkCallRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mNetworkCallRepository = new NetworkCallRepository(application);
    }
    public Observable<Response<Survey[]>> GetSurvey() {
        return mNetworkCallRepository.GetSurvey();
    }
}
