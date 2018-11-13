package ws.tilda.anastasia.androidinjectorproject.application;

import android.content.Context;

import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;
import ws.tilda.anastasia.androidinjectorproject.activity.ActivitySubComponent;

@Module(subcomponents = {ActivitySubComponent.class})
public class ApplicationModule {

    Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @ApplicationScope
    @Provides
    Context context() {
        return this.context;
    }
}
