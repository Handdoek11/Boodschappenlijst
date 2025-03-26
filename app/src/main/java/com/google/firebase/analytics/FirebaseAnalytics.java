package com.google.firebase.analytics;

import A3.AbstractC0379m;
import Z2.r;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C4889d1;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w3.z;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f32703b;

    /* renamed from: a, reason: collision with root package name */
    private final C4889d1 f32704a;

    private FirebaseAnalytics(C4889d1 c4889d1) {
        r.l(c4889d1);
        this.f32704a = c4889d1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f32703b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f32703b == null) {
                        f32703b = new FirebaseAnalytics(C4889d1.f(context));
                    }
                } finally {
                }
            }
        }
        return f32703b;
    }

    @Keep
    public static z getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4889d1 g8 = C4889d1.g(context, null, null, null, bundle);
        if (g8 == null) {
            return null;
        }
        return new a(g8);
    }

    public final void a(String str, Bundle bundle) {
        this.f32704a.r(str, bundle);
    }

    public final void b(String str) {
        this.f32704a.I(str);
    }

    public final void c(String str, String str2) {
        this.f32704a.B(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) AbstractC0379m.b(c.q().d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f32704a.k(activity, str, str2);
    }
}
