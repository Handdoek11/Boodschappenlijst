package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C6397a;

/* renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5049w3 implements InterfaceC4873b3 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f29618g = new C6397a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f29619a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f29620b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f29621c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f29622d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map f29623e;

    /* renamed from: f, reason: collision with root package name */
    private final List f29624f;

    private C5049w3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f29605o.d(sharedPreferences2, str);
            }
        };
        this.f29621c = onSharedPreferenceChangeListener;
        this.f29622d = new Object();
        this.f29624f = new ArrayList();
        this.f29619a = sharedPreferences;
        this.f29620b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences a8 = AbstractC5062y0.a(context, str, 0, AbstractC5030u0.f29583a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a8;
            }
            if (T2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences a9 = AbstractC5062y0.a(context, str.substring(12), 0, AbstractC5030u0.f29583a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    static C5049w3 b(Context context, String str, Runnable runnable) {
        C5049w3 c5049w3;
        if (!((!T2.a() || str.startsWith("direct_boot:")) ? true : T2.c(context))) {
            return null;
        }
        synchronized (C5049w3.class) {
            try {
                Map map = f29618g;
                c5049w3 = (C5049w3) map.get(str);
                if (c5049w3 == null) {
                    c5049w3 = new C5049w3(a(context, str), runnable);
                    map.put(str, c5049w3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5049w3;
    }

    static synchronized void c() {
        synchronized (C5049w3.class) {
            try {
                for (C5049w3 c5049w3 : f29618g.values()) {
                    c5049w3.f29619a.unregisterOnSharedPreferenceChangeListener(c5049w3.f29621c);
                }
                f29618g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f29622d) {
            this.f29623e = null;
            this.f29620b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f29624f.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.E.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4873b3
    public final Object n(String str) {
        Map<String, ?> map = this.f29623e;
        if (map == null) {
            synchronized (this.f29622d) {
                try {
                    map = this.f29623e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f29619a.getAll();
                            this.f29623e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
