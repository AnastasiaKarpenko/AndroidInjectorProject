package ws.tilda.anastasia.androidinjectorproject.application;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        ApplicationModule.class,
        BindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface ApplicationComponent {
}
