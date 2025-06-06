package com.example.d308vacationschedulernathanpons.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.d308vacationschedulernathanpons.model.User;
import com.example.d308vacationschedulernathanpons.model.Vacation;
import com.example.d308vacationschedulernathanpons.repo.VacationRepository;

import java.util.List;

public class VacationListViewModel extends AndroidViewModel {
    private VacationRepository mVacationRepository;
    private LiveData<List<Vacation>> mAllVacations;
    private int userId;
    private String username;

    public VacationListViewModel(@NonNull Application application) {
        super(application);
        mVacationRepository = new VacationRepository(application);
        mAllVacations = mVacationRepository.getmAllVacations();
        userId = mVacationRepository.getUserId(username);

    }

    public LiveData<List<Vacation>> getmAllVacations() {
        return mAllVacations;
    }

    public void insert(Vacation vacation) {
        mVacationRepository.insert(vacation);
    }

    public void update(Vacation vacation) {
        mVacationRepository.update(vacation);
    }

    public void delete(Vacation vacation) {
        mVacationRepository.delete(vacation);
    }

    public int getUserId(String username) { return mVacationRepository.getUserId(username); }
}
