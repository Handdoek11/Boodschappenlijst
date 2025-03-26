package e4;

import Z2.r;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;
import com.google.firebase.f;
import e4.InterfaceC5746a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import v3.C6835a;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5747b implements InterfaceC5746a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile InterfaceC5746a f35326c;

    /* renamed from: a, reason: collision with root package name */
    private final C6835a f35327a;

    /* renamed from: b, reason: collision with root package name */
    final Map f35328b;

    /* renamed from: e4.b$a */
    class a implements InterfaceC5746a.InterfaceC0252a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f35329a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ C5747b f35330b;

        a(C5747b c5747b, String str) {
            this.f35329a = str;
            this.f35330b = c5747b;
        }
    }

    private C5747b(C6835a c6835a) {
        r.l(c6835a);
        this.f35327a = c6835a;
        this.f35328b = new ConcurrentHashMap();
    }

    public static InterfaceC5746a d(f fVar, Context context, E4.d dVar) {
        r.l(fVar);
        r.l(context);
        r.l(dVar);
        r.l(context.getApplicationContext());
        if (f35326c == null) {
            synchronized (C5747b.class) {
                try {
                    if (f35326c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.b(com.google.firebase.b.class, new Executor() { // from class: e4.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new E4.b() { // from class: e4.d
                                @Override // E4.b
                                public final void a(E4.a aVar) {
                                    C5747b.e(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f35326c = new C5747b(C4889d1.g(context, null, null, null, bundle).y());
                    }
                } finally {
                }
            }
        }
        return f35326c;
    }

    static /* synthetic */ void e(E4.a aVar) {
        throw null;
    }

    private final boolean f(String str) {
        return (str.isEmpty() || !this.f35328b.containsKey(str) || this.f35328b.get(str) == null) ? false : true;
    }

    @Override // e4.InterfaceC5746a
    public InterfaceC5746a.InterfaceC0252a a(String str, InterfaceC5746a.b bVar) {
        r.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.g(str) || f(str)) {
            return null;
        }
        C6835a c6835a = this.f35327a;
        Object dVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.d(c6835a, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(c6835a, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f35328b.put(str, dVar);
        return new a(this, str);
    }

    @Override // e4.InterfaceC5746a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.g(str) && com.google.firebase.analytics.connector.internal.a.c(str2, bundle) && com.google.firebase.analytics.connector.internal.a.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.b(str, str2, bundle);
            this.f35327a.n(str, str2, bundle);
        }
    }

    @Override // e4.InterfaceC5746a
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.g(str) && com.google.firebase.analytics.connector.internal.a.d(str, str2)) {
            this.f35327a.u(str, str2, obj);
        }
    }
}
