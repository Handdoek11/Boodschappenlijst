package G2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import java.util.Locale;

/* loaded from: classes.dex */
public class U0 extends O0 {
    static final /* synthetic */ WindowInsets m(Activity activity, View view, WindowInsets windowInsets) {
        if (C2.v.s().j().h() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                InterfaceC0611r0 j8 = C2.v.s().j();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(format);
                }
                j8.h0(str);
            } else {
                C2.v.s().j().h0("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void n(boolean z7, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i8 = attributes.layoutInDisplayCutoutMode;
        int i9 = true != z7 ? 2 : 1;
        if (i9 != i8) {
            attributes.layoutInDisplayCutoutMode = i9;
            window.setAttributes(attributes);
        }
    }

    @Override // G2.AbstractC0579b
    public final int i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // G2.AbstractC0579b
    public final void j(final Activity activity) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23966o1)).booleanValue() && C2.v.s().j().h() == null && !activity.isInMultiWindowMode()) {
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: G2.P0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return U0.m(activity, view, windowInsets);
                }
            });
        }
    }
}
