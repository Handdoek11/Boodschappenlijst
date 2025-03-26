package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;

/* loaded from: classes.dex */
public final class g extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        J6.r.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        J6.r.d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(f.a(systemService));
    }
}
