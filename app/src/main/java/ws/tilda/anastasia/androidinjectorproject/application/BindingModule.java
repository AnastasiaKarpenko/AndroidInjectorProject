package ws.tilda.anastasia.androidinjectorproject.application;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ws.tilda.anastasia.androidinjectorproject.activity.ActivitySubComponent;
import ws.tilda.anastasia.androidinjectorproject.activity.MainActivity;

@Module
public abstract class BindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(ActivitySubComponent.Builder builder);
}
