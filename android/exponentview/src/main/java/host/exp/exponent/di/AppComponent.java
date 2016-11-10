// Copyright 2015-present 650 Industries. All rights reserved.

package host.exp.exponent.di;

import javax.inject.Singleton;

import dagger.Component;
import host.exp.exponent.ExponentDevActivity;
import host.exp.exponent.ExponentIntentService;
import host.exp.exponent.ExponentManifest;
import host.exp.exponent.LauncherActivity;
import host.exp.exponent.experience.BaseExperienceActivity;
import host.exp.exponent.experience.ExperienceActivity;
import host.exp.exponent.gcm.ExponentGcmListenerService;
import host.exp.exponent.gcm.RegistrationIntentService;
import host.exp.exponent.kernel.Kernel;
import host.exp.exponent.modules.ExponentKernelModule;
import host.exp.exponentview.Exponent;

@Singleton
@Component(
    modules = {
        AppModule.class
    }
)
public interface AppComponent {
  void inject(Exponent exponent);

  Kernel getKernel();

  ExponentManifest getExponentManifest();

  void inject(LauncherActivity activity);

  void inject(ExponentDevActivity activity);

  void inject(ExponentIntentService service);

  void inject(RegistrationIntentService service);

  void inject(ExponentGcmListenerService service);

  void inject(BaseExperienceActivity activity);

  void inject(ExperienceActivity activity);

  void inject(ExponentKernelModule module);

  void inject(NativeModuleDepsProvider nativeModuleDepsProvider);
}
