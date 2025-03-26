package G2;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: G2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0582c0 extends B {

    /* renamed from: c, reason: collision with root package name */
    private final Context f2618c;

    C0582c0(Context context) {
        this.f2618c = context;
    }

    @Override // G2.B
    public final void a() {
        boolean z7;
        try {
            z7 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f2618c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e8) {
            H2.p.e("Fail to get isAdIdFakeForDebugLogging", e8);
            z7 = false;
        }
        H2.m.j(z7);
        H2.p.g("Update ad debug logging enablement as " + z7);
    }
}
