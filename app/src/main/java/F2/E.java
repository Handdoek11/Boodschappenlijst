package F2;

import G2.AbstractC0608p0;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class E extends x {
    public E(Activity activity) {
        super(activity);
    }

    @Override // F2.x, com.google.android.gms.internal.ads.InterfaceC4289un
    public final void C4(Bundle bundle) {
        AbstractC0608p0.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f2294M = 4;
        this.f2295o.finish();
    }
}
