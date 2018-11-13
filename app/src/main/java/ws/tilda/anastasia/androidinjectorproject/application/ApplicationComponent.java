package ws.tilda.anastasia.androidinjectorproject.application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        ApplicationModule.class,
        BindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder applicationComponent(MyApplication application);
        MyApplication build();
    }
}
