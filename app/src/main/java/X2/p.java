package X2;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1090b;

/* loaded from: classes.dex */
public final class p extends m {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.b f5927c;

    public p(com.google.android.gms.common.api.b bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5927c = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final AbstractC1090b a(AbstractC1090b abstractC1090b) {
        return this.f5927c.k(abstractC1090b);
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper b() {
        return this.f5927c.r();
    }
}
