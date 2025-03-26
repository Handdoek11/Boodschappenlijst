package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.InterfaceC0949a;
import b.InterfaceC0950b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8013a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0950b f8014b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0949a f8015c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f8016d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f8017e;

    f(InterfaceC0950b interfaceC0950b, InterfaceC0949a interfaceC0949a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f8014b = interfaceC0950b;
        this.f8015c = interfaceC0949a;
        this.f8016d = componentName;
        this.f8017e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f8017e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f8017e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f8015c.asBinder();
    }

    ComponentName e() {
        return this.f8016d;
    }

    PendingIntent f() {
        return this.f8017e;
    }

    public int g(String str, Bundle bundle) {
        int t12;
        Bundle b8 = b(bundle);
        synchronized (this.f8013a) {
            try {
                try {
                    t12 = this.f8014b.t1(this.f8015c, str, b8);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t12;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle c8 = c(uri2);
            if (c8 == null) {
                return this.f8014b.k4(this.f8015c, uri);
            }
            bundle.putAll(c8);
            return this.f8014b.i1(this.f8015c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
