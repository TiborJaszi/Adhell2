package com.almafa.AdHell2.viewmodel;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.almafa.AdHell2.db.entity.PolicyPackage;

public class ProfileViewModel extends ViewModel {
    private MutableLiveData<PolicyPackage> policyPackagesLiveData;

    public LiveData<PolicyPackage> getPolicyPackagesLiveData() {
        if (policyPackagesLiveData == null) {
            policyPackagesLiveData = new MutableLiveData<>();
            loadPolicyPackages();
        }
        return policyPackagesLiveData;
    }

    private void loadPolicyPackages() {

    }
}
