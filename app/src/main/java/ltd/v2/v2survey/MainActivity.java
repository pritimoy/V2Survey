package ltd.v2.v2survey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import ltd.v2.v2survey.databinding.ActivityMainBinding;
import ltd.v2.v2survey.model.Survey;
import ltd.v2.v2survey.viewmodel.MainActivityViewModel;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    //ViewBinding
    private ActivityMainBinding mBinding;
    private MainActivityViewModel mMainActivityViewModel;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        mMainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        //getData
        mMainActivityViewModel.GetSurvey()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<Survey[]>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<Survey[]> response) {
                        if (response.isSuccessful()) {
                            List<Survey> surveyList = new ArrayList<>();
                            surveyList.addAll(Arrays.asList(response.body()));
                            Log.d(TAG, "onNext: " + surveyList.get(0).getmQuestion());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e);

                    }

                    @Override
                    public void onComplete() {

                    }
                });



    }
}