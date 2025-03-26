package G2;

import D2.C0555y;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3184kf;

/* loaded from: classes.dex */
public class G0 extends E0 {
    static final boolean l(int i8, int i9, int i10) {
        return Math.abs(i8 - i9) <= i10;
    }

    @Override // G2.AbstractC0579b
    public final boolean d(Activity activity, Configuration configuration) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23771R4)).booleanValue()) {
            return false;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23787T4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C0555y.b();
        int B7 = H2.g.B(activity, configuration.screenHeightDp);
        int B8 = H2.g.B(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        C2.v.t();
        DisplayMetrics Z7 = D0.Z(windowManager);
        int i8 = Z7.heightPixels;
        int i9 = Z7.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) D2.A.c().a(AbstractC3184kf.f23755P4)).intValue();
        return (l(i8, B7 + dimensionPixelSize, round) && l(i9, B8, round)) ? false : true;
    }
}
