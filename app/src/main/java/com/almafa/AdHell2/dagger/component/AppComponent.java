package com.almafa.AdHell2.dagger.component;

import com.almafa.AdHell2.adapter.AdhellPermissionInAppsAdapter;
import com.almafa.AdHell2.blocker.ContentBlocker20;
import com.almafa.AdHell2.blocker.ContentBlocker56;
import com.almafa.AdHell2.dagger.module.AdminModule;
import com.almafa.AdHell2.dagger.module.AppModule;
import com.almafa.AdHell2.dagger.module.EnterpriseModule;
import com.almafa.AdHell2.dagger.module.NetworkModule;
import com.almafa.AdHell2.dagger.scope.AdhellApplicationScope;
import com.almafa.AdHell2.fragments.BlockedUrlSettingFragment;
import com.almafa.AdHell2.fragments.BlockerFragment;
import com.almafa.AdHell2.fragments.PackageDisablerFragment;
import com.almafa.AdHell2.service.BlockedDomainService;
import com.almafa.AdHell2.utils.AdhellAppIntegrity;
import com.almafa.AdHell2.utils.AppsListDBInitializer;
import com.almafa.AdHell2.utils.DeviceAdminInteractor;
import com.almafa.AdHell2.viewmodel.AdhellWhitelistAppsViewModel;
import com.almafa.AdHell2.viewmodel.SharedAppPermissionViewModel;

import dagger.Component;

@AdhellApplicationScope
@Component(modules = {AppModule.class, AdminModule.class, EnterpriseModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(DeviceAdminInteractor deviceAdminInteractor);

    void inject(ContentBlocker56 contentBlocker56);

    void inject(ContentBlocker20 contentBlocker20);

    void inject(BlockedDomainService blockedDomainService);

    void inject(BlockedUrlSettingFragment blockedUrlSettingFragment);

    void inject(PackageDisablerFragment packageDisablerFragment);

    void inject(AdhellWhitelistAppsViewModel adhellWhitelistAppsViewModel);

    void inject(SharedAppPermissionViewModel sharedAppPermissionViewModel);

    void inject(AdhellPermissionInAppsAdapter adhellPermissionInAppsAdapter);

    void inject(AppsListDBInitializer appsListDBInitializer);

    void inject(BlockerFragment blockerFragment);

    void inject(AdhellAppIntegrity adhellAppIntegrity);

}
