package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4882c3 implements InterfaceC4873b3 {

    /* renamed from: c, reason: collision with root package name */
    private static C4882c3 f29239c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29240a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f29241b;

    private C4882c3() {
        this.f29240a = null;
        this.f29241b = null;
    }

    static C4882c3 a(Context context) {
        C4882c3 c4882c3;
        synchronized (C4882c3.class) {
            try {
                if (f29239c == null) {
                    f29239c = o0.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4882c3(context) : new C4882c3();
                }
                c4882c3 = f29239c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4882c3;
    }

    static synchronized void b() {
        Context context;
        synchronized (C4882c3.class) {
            try {
                C4882c3 c4882c3 = f29239c;
                if (c4882c3 != null && (context = c4882c3.f29240a) != null && c4882c3.f29241b != null) {
                    context.getContentResolver().unregisterContentObserver(f29239c.f29241b);
                }
                f29239c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4873b3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String n(final String str) {
        Context context = this.f29240a;
        if (context != null && !T2.b(context)) {
            try {
                return (String) AbstractC4864a3.a(new InterfaceC4891d3() { // from class: com.google.android.gms.internal.measurement.f3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC4891d3
                    public final Object zza() {
                        return this.f29290a.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e8);
            }
        }
        return null;
    }

    final /* synthetic */ String c(String str) {
        return J2.a(this.f29240a.getContentResolver(), str, null);
    }

    private C4882c3(Context context) {
        this.f29240a = context;
        C4900e3 c4900e3 = new C4900e3(this, null);
        this.f29241b = c4900e3;
        context.getContentResolver().registerContentObserver(I2.f28890a, true, c4900e3);
    }
}
