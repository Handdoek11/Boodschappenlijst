package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;

/* loaded from: classes.dex */
public final class l extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context) {
        J6.r.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        J6.r.d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(f.a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.t
    public GetTopicsRequest c(a aVar) {
        J6.r.e(aVar, "request");
        GetTopicsRequest build = h.a().setAdsSdkName(aVar.a()).setShouldRecordObservation(aVar.b()).build();
        J6.r.d(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
