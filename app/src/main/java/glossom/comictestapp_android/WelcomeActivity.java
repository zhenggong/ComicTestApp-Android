package glossom.comictestapp_android;

import android.view.animation.Animation;

import com.king.base.SplashActivity;

public class WelcomeActivity extends SplashActivity{
    @Override
    public int getContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public Animation.AnimationListener getAnimationListener() {
        return null;
    }
}
