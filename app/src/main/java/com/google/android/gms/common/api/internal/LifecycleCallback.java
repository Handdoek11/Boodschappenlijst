package com.google.android.gms.common.api.internal;

import X2.C0758f;
import X2.InterfaceC0759g;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: o, reason: collision with root package name */
    protected final InterfaceC0759g f13281o;

    protected LifecycleCallback(InterfaceC0759g interfaceC0759g) {
        this.f13281o = interfaceC0759g;
    }

    protected static InterfaceC0759g c(C0758f c0758f) {
        if (c0758f.d()) {
            return X2.I.f2(c0758f.b());
        }
        if (c0758f.c()) {
            return X2.G.f(c0758f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC0759g d(Activity activity) {
        return c(new C0758f(activity));
    }

    @Keep
    private static InterfaceC0759g getChimeraLifecycleFragmentImpl(C0758f c0758f) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity e8 = this.f13281o.e();
        Z2.r.l(e8);
        return e8;
    }

    public void e(int i8, int i9, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
