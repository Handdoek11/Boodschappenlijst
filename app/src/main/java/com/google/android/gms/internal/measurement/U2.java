package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C6397a;

/* loaded from: classes.dex */
public final class U2 implements InterfaceC4873b3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f29025h = new C6397a();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f29026i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f29027a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f29028b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f29029c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f29030d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f29031e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f29032f;

    /* renamed from: g, reason: collision with root package name */
    private final List f29033g;

    private U2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        W2 w22 = new W2(this, null);
        this.f29030d = w22;
        this.f29031e = new Object();
        this.f29033g = new ArrayList();
        b4.h.i(contentResolver);
        b4.h.i(uri);
        this.f29027a = contentResolver;
        this.f29028b = uri;
        this.f29029c = runnable;
        contentResolver.registerContentObserver(uri, false, w22);
    }

    public static U2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        U2 u22;
        synchronized (U2.class) {
            Map map = f29025h;
            u22 = (U2) map.get(uri);
            if (u22 == null) {
                try {
                    U2 u23 = new U2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, u23);
                    } catch (SecurityException unused) {
                    }
                    u22 = u23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return u22;
    }

    static synchronized void d() {
        synchronized (U2.class) {
            try {
                for (U2 u22 : f29025h.values()) {
                    u22.f29027a.unregisterContentObserver(u22.f29030d);
                }
                f29025h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) AbstractC4864a3.a(new InterfaceC4891d3() { // from class: com.google.android.gms.internal.measurement.X2
                    @Override // com.google.android.gms.internal.measurement.InterfaceC4891d3
                    public final Object zza() {
                        return this.f29049a.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException e8) {
                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e8);
                return Collections.emptyMap();
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final Map b() {
        Map map = this.f29032f;
        if (map == null) {
            synchronized (this.f29031e) {
                try {
                    map = this.f29032f;
                    if (map == null) {
                        map = f();
                        this.f29032f = map;
                    }
                } finally {
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    final /* synthetic */ Map c() {
        ContentProviderClient acquireUnstableContentProviderClient = this.f29027a.acquireUnstableContentProviderClient(this.f29028b);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor query = acquireUnstableContentProviderClient.query(this.f29028b, f29026i, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map emptyMap2 = Collections.emptyMap();
                    query.close();
                    return emptyMap2;
                }
                Map c6397a = count <= 256 ? new C6397a(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    c6397a.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return c6397a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map emptyMap3 = Collections.emptyMap();
                query.close();
                return emptyMap3;
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException e8) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e8);
            return Collections.emptyMap();
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public final void e() {
        synchronized (this.f29031e) {
            this.f29032f = null;
            this.f29029c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f29033g.iterator();
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
    public final /* synthetic */ Object n(String str) {
        return (String) b().get(str);
    }
}
