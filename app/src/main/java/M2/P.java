package M2;

import G2.D0;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.DG;

/* loaded from: classes.dex */
public final class P implements DG {

    /* renamed from: o, reason: collision with root package name */
    private final C f3811o;

    /* renamed from: s, reason: collision with root package name */
    private final int f3812s;

    /* renamed from: t, reason: collision with root package name */
    private final String f3813t;

    public P(C c8, int i8, String str) {
        this.f3811o = c8;
        this.f3812s = i8;
        this.f3813t = str;
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(final N n8) {
        if (n8 == null || this.f3812s != 2 || TextUtils.isEmpty(this.f3813t)) {
            return;
        }
        D0.M(new Runnable() { // from class: M2.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f3809o.b(n8);
            }
        });
    }

    final /* synthetic */ void b(N n8) {
        this.f3811o.d(this.f3813t, n8);
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
    }
}
