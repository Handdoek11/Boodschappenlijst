package G2;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.AbstractC1601Nq;
import com.google.android.gms.internal.ads.AbstractC2861hg;

/* renamed from: G2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0606o0 {
    public static void a(Context context) {
        int i8 = H2.m.f2946g;
        if (((Boolean) AbstractC2861hg.f22593a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || H2.m.l()) {
                    return;
                }
                com.google.common.util.concurrent.d b8 = new C0582c0(context).b();
                H2.p.f("Updating ad debug logging enablement.");
                AbstractC1601Nq.a(b8, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e8) {
                H2.p.h("Fail to determine debug setting.", e8);
            }
        }
    }
}
